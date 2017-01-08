/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.dip.authorize.role;
	
import nc.vo.pub.SuperVO;
	
/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 *     �ڴ˴����Ӵ����������Ϣ
 * </p>
 * ��������:2016-12-05 22:12:30
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class RoleGroupBVO extends SuperVO {
	private String pk_corp;
	private String ts;
	private String pk_role_group_b;
	private Integer dr;
	private String pk_role_group;
	private String pk_role;

	public static final String PK_CORP = "pk_corp";
	public static final String PK_ROLE_GROUP_B = "pk_role_group_b";
	public static final String GROUP_NAME = "group_name";
	public static final String GROUP_MEMO = "group_memo";
	public static final String GROUP_CODE = "group_code";
	public static final String PK_ROLE_GROUP = "pk_role_group";
	public static final String PK_ROLE = "pk_role";
			
	/**
	 * ����pk_corp��Getter����.
	 * ��������:2016-12-05 22:12:30
	 * @return String
	 */
	public String getPk_corp () {
		return pk_corp;
	}   
	/**
	 * ����pk_corp��Setter����.
	 * ��������:2016-12-05 22:12:30
	 * @param newPk_corp String
	 */
	public void setPk_corp (String newPk_corp ) {
	 	this.pk_corp = newPk_corp;
	} 	  
	/**
	 * ����ts��Getter����.
	 * ��������:2016-12-05 22:12:30
	 * @return UFDateTime
	 */
	public String getTs () {
		return ts;
	}   
	/**
	 * ����ts��Setter����.
	 * ��������:2016-12-05 22:12:30
	 * @param newTs UFDateTime
	 */
	public void setTs (String newTs ) {
	 	this.ts = newTs;
	} 	  
	/**
	 * ����pk_role_group_b��Getter����.
	 * ��������:2016-12-05 22:12:30
	 * @return String
	 */
	public String getPk_role_group_b () {
		return pk_role_group_b;
	}   
	/**
	 * ����pk_role_group_b��Setter����.
	 * ��������:2016-12-05 22:12:30
	 * @param newPk_role_group_b String
	 */
	public void setPk_role_group_b (String newPk_role_group_b ) {
	 	this.pk_role_group_b = newPk_role_group_b;
	} 	  
	/**
	 * ����dr��Getter����.
	 * ��������:2016-12-05 22:12:30
	 * @return UFDouble
	 */
	public Integer getDr () {
		return dr;
	}   
	/**
	 * ����dr��Setter����.
	 * ��������:2016-12-05 22:12:30
	 * @param newDr UFDouble
	 */
	public void setDr (Integer newDr ) {
	 	this.dr = newDr;
	} 	  
	/**
	 * ����pk_role_group��Getter����.
	 * ��������:2016-12-05 22:12:30
	 * @return String
	 */
	public String getPk_role_group () {
		return pk_role_group;
	}   
	/**
	 * ����pk_role_group��Setter����.
	 * ��������:2016-12-05 22:12:30
	 * @param newPk_role_group String
	 */
	public void setPk_role_group (String newPk_role_group ) {
	 	this.pk_role_group = newPk_role_group;
	} 	  
	/**
	 * ����pk_role��Getter����.
	 * ��������:2016-12-05 22:12:30
	 * @return String
	 */
	public String getPk_role () {
		return pk_role;
	}   
	/**
	 * ����pk_role��Setter����.
	 * ��������:2016-12-05 22:12:30
	 * @param newPk_role String
	 */
	public void setPk_role (String newPk_role ) {
	 	this.pk_role = newPk_role;
	} 	  
 
	/**
	  * <p>ȡ�ø�VO�����ֶ�.
	  * <p>
	  * ��������:2016-12-05 22:12:30
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
		return "PK_ROLE_GROUP";
	}   
    
	/**
	  * <p>ȡ�ñ�����.
	  * <p>
	  * ��������:2016-12-05 22:12:30
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	  return "pk_role_group_b";
	}
    
	/**
	 * <p>���ر�����.
	 * <p>
	 * ��������:2016-12-05 22:12:30
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "dip_rolegroup_b";
	}    
    
    /**
	  * ����Ĭ�Ϸ�ʽ����������.
	  *
	  * ��������:2016-12-05 22:12:30
	  */
     public RoleGroupBVO() {
		super();	
	}    
} 