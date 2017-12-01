package org.spring.springboot.domain.tables;
import com.welab.xdao.context.table.AllField;
import com.welab.xdao.context.table.AbstractTable;
import com.welab.xdao.context.element.ITableField;
import com.welab.xdao.context.table.TableFieldImpl;
import java.util.HashMap;
import java.util.Map;

public class TCitya extends AbstractTable {

	static {
		init();
	}

	private TCitya(){
		super.tableName = "citya";
	}

	private TCitya(String aliasName){
		this();
		setAliasName(aliasName);
	}

	public static final TCitya getInstance() {
		return new TCitya();
	}

	public static final TCitya getInstance(String aliasName) {
		return new TCitya(aliasName);
	}

	private static Map<String, String> allFieldMap;
	private static final void init() {
		allFieldMap = new HashMap<String, String>();
		allFieldMap.put("CODENO", "CODENO");
		allFieldMap.put("ITEMNO", "ITEMNO");
		allFieldMap.put("ITEMNAME", "ITEMNAME");
	}

	public String getFieldName(String javaFieldName) {
		return allFieldMap.get(javaFieldName);
	}

	public final ITableField<Integer> all = new AllField<Integer>(this,  "*",null);

	public ITableField<?> allField() {
		return all;
	}

	/**
	 * 11 | varchar(25)
	 */
	public final ITableField<String> CODENO = new TableFieldImpl<String>(this,"CODENO","CODENO","11");

	/**
	 * 22 | varchar(25)
	 */
	public final ITableField<String>  pk = new TableFieldImpl<String>(this,"ITEMNO","ITEMNO","22");
	public final ITableField<String> ITEMNO = new TableFieldImpl<String>(this,"ITEMNO","ITEMNO","22");

	/**
	 * 33 | varchar(50)
	 */
	public final ITableField<String> ITEMNAME = new TableFieldImpl<String>(this,"ITEMNAME","ITEMNAME","33");

	private final ITableField<?>[] allFields = new ITableField<?>[] {CODENO,ITEMNO,ITEMNAME};

	public ITableField<?>[] getAllFields() {
		return allFields;
	}

	@SuppressWarnings("unchecked")
	//主键字段
	public final ITableField<?> getPK() {
		return pk;
	}

	@SuppressWarnings("unchecked")
	//乐观锁字段
	public final ITableField<?> getLockVersion() {
		return null;
	}

	//表citya的新增，修改，删除记录是否需要留痕
	public final String getDataTrailTableName() {
		return null;
	}

	//是否是自增主键
	public final boolean isAutoGeneratedPK() {
		return false;
	}

	//是否有乐观锁
	public final boolean isLockVersion() {
		return false;
	}

	public String toString() {
		return "TCitya[table=citya]";
	}
}