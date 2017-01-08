/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
  \***************************************************************/
package nc.vo.dip.datachange;

import java.util.ArrayList;

import nc.util.dip.sj.IContrastUtil;
import nc.vo.pub.*;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;

/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 *
 * <p>
 *     �ڴ˴����Ӵ����������Ϣ
 * </p>
 *
 * ��������:2011-4-7
 * @author ${vmObject.author}
 * @version Your Project 1.0
 */
public class DipDatachangeHVO extends SuperVO {
	public String pk_datadefinit_h;
	public String systype;
	public String outpath;
	public String tasktype;
	public Integer limit;
	public String org;
	public String busidata;
	public Integer dr;
	public String pk_glorg;
	public String endstatus;
	public String code;
	public String ncorg;
	public String middletab;
	public String def_str_1;
	public String ts;
	public String pk_datachange_h;
	public String constatus;
	public String def_str_2;
	public String name;
	public String fpk;
	public Integer results;
	public String guding;
	public Integer sfhb;
	public String explanation;
	public String dataprecision;//DATAPRECISION
	public Integer beforeprecision;//BEFOREPRECISION
	public Integer afterprecision;//AFTERPRECISION
	public String pxzd;
	public String  pk_xt;//ϵͳ����
	public UFBoolean isfolder; //�Ƿ��ļ���

	public static final String PK_XT="pk_xt";
	public static final String ISFOLDER="isfolder"; 
	public static final String SFHB="sfhb";
	public static final String GUDING="guding";
	public static final String  RESULT="results";   
	public static final String  SYSTYPE="systype";   
	public static final String  OUTPATH="outpath";   
	public static final String  TASKTYPE="tasktype";   
	public static final String  LIMIT="limit";   
	public static final String  ORG="org";   
	public static final String  BUSIDATA="busidata";   
	public static final String  DR="dr";   
	public static final String  PK_GLORG="pk_glorg";   
	public static final String  ENDSTATUS="endstatus";   
	public static final String  CODE="code";   
	public static final String  NCORG="ncorg";   
	public static final String  MIDDLETAB="middletab";   
	public static final String  DEF_STR_1="def_str_1";   
	public static final String  TS="ts";   
	public static final String  PK_DATACHANGE_H="pk_datachange_h";   
	public static final String  CONSTATUS="constatus";   
	public static final String  DEF_STR_2="def_str_2";   
	public static final String  NAME="name";  
	public  static  final String  PK_DATADEFINIT_H="pk_datadefinit_h";
	public static final String EXPLANATION="explanation";
	public static final String DATAPRECISION="DATAPRECISION";
	public static final String BEFOREPRECISION="beforeprecision";
	public static final String AFTERPRECISION="afterprecision";


	public String getPk_datadefinit_h() {
		return pk_datadefinit_h;
	}

	public void setPk_datadefinit_h(String pk_datadefinit_h) {
		this.pk_datadefinit_h = pk_datadefinit_h;
	}

	public String getNcorg() {
		return ncorg;
	}

	public void setNcorg(String ncorg) {
		this.ncorg = ncorg;
	}

	/**
	 * ����systype��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getSystype() {
		return systype;
	}   

	/**
	 * ����systype��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newSystype String
	 */
	public void setSystype(String newSystype) {

		systype = newSystype;
	} 	  

	/**
	 * ����outpath��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getOutpath() {
		return outpath;
	}   

	/**
	 * ����outpath��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newOutpath String
	 */
	public void setOutpath(String newOutpath) {

		outpath = newOutpath;
	} 	  

	/**
	 * ����tasktype��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getTasktype() {
		return tasktype;
	}   

	/**
	 * ����tasktype��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newTasktype String
	 */
	public void setTasktype(String newTasktype) {

		tasktype = newTasktype;
	} 	  


	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	/**
	 * ����org��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getOrg() {
		return org;
	}   

	/**
	 * ����org��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newOrg String
	 */
	public void setOrg(String newOrg) {

		org = newOrg;
	} 	  

	/**
	 * ����busidata��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getBusidata() {
		return busidata;
	}   

	/**
	 * ����busidata��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newBusidata String
	 */
	public void setBusidata(String newBusidata) {

		busidata = newBusidata;
	} 	  

	/**
	 * ����dr��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}   

	/**
	 * ����dr��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newDr Integer
	 */
	public void setDr(Integer newDr) {

		dr = newDr;
	} 	  

	/**
	 * ����pk_glorg��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getPk_glorg() {
		return pk_glorg;
	}   

	/**
	 * ����pk_glorg��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newPk_glorg String
	 */
	public void setPk_glorg(String newPk_glorg) {

		pk_glorg = newPk_glorg;
	} 	  

	/**
	 * ����endstatus��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getEndstatus() {
		return endstatus;
	}   

	/**
	 * ����endstatus��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newEndstatus String
	 */
	public void setEndstatus(String newEndstatus) {

		endstatus = newEndstatus;
	} 	  

	/**
	 * ����code��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getCode() {
		return code;
	}   

	/**
	 * ����code��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newCode String
	 */
	public void setCode(String newCode) {

		code = newCode;
	} 	  


	/**
	 * ����middletab��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getMiddletab() {
		return middletab;
	}   

	/**
	 * ����middletab��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newMiddletab String
	 */
	public void setMiddletab(String newMiddletab) {

		middletab = newMiddletab;
	} 	  

	/**
	 * ����def_str_1��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getDef_str_1() {
		return def_str_1;
	}   

	/**
	 * ����def_str_1��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newDef_str_1 String
	 */
	public void setDef_str_1(String newDef_str_1) {

		def_str_1 = newDef_str_1;
	} 	  

	/**
	 * ����ts��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return UFDateTime
	 */
	public Object getTs() {
		if(ts==null){
			return null;
		}else{
			if(IContrastUtil.VERSION.equals("nc502")){
				  return new UFDateTime(ts);
			  }else if(IContrastUtil.VERSION.equals("nc507")){
				  return ts;  
			  }
		}
		return ts;
	} 

	/**
	 * ����ts��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newTs UFDateTime
	 */
	public void setTs(String newTs) {

		ts = newTs;
	} 	  

	/**
	 * ����pk_datachange_h��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getPk_datachange_h() {
		return pk_datachange_h;
	}   

	/**
	 * ����pk_datachange_h��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newPk_datachange_h String
	 */
	public void setPk_datachange_h(String newPk_datachange_h) {

		pk_datachange_h = newPk_datachange_h;
	} 	  

	/**
	 * ����constatus��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getConstatus() {
		return constatus;
	}   

	/**
	 * ����constatus��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newConstatus String
	 */
	public void setConstatus(String newConstatus) {

		constatus = newConstatus;
	} 	  

	/**
	 * ����def_str_2��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getDef_str_2() {
		return def_str_2;
	}   

	/**
	 * ����def_str_2��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newDef_str_2 String
	 */
	public void setDef_str_2(String newDef_str_2) {

		def_str_2 = newDef_str_2;
	} 	  

	/**
	 * ����name��Getter����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getName() {
		return name;
	}   

	/**
	 * ����name��Setter����.
	 *
	 * ��������:2011-4-7
	 * @param newName String
	 */
	public void setName(String newName) {

		name = newName;
	} 	  


	/**
	 * ��֤���������֮��������߼���ȷ��.
	 *
	 * ��������:2011-4-7
	 * @exception nc.vo.pub.ValidationException �����֤ʧ��,�׳�
	 * ValidationException,�Դ�����н���.
	 */
	public void validate() throws ValidationException {

		ArrayList errFields = new ArrayList(); // errFields record those null

		// fields that cannot be null.
		// ����Ƿ�Ϊ�������յ��ֶθ��˿�ֵ,�������Ҫ�޸��������ʾ��Ϣ:

		if (pk_datachange_h == null) {
			errFields.add(new String("pk_datachange_h"));
		}	

		StringBuffer message = new StringBuffer();
		message.append("�����ֶβ���Ϊ��:");
		if (errFields.size() > 0) {
			String[] temp = (String[]) errFields.toArray(new String[0]);
			message.append(temp[0]);
			for ( int i= 1; i < temp.length; i++ ) {
				message.append(",");
				message.append(temp[i]);
			}
			throw new NullFieldException(message.toString());
		}
	}


	/**
	 * <p>ȡ�ø�VO�����ֶ�.
	 * <p>
	 * ��������:2011-4-7
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {

		return "fpk";

	}   

	/**
	 * <p>ȡ�ñ�����.
	 * <p>
	 * ��������:2011-4-7
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_datachange_h";
	}

	/**
	 * <p>���ر�����.
	 * <p>
	 * ��������:2011-4-7
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {

		return "dip_datachange_h";
	}    

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 *
	 * ��������:2011-4-7
	 */
	public DipDatachangeHVO() {

		super();	
	}    

	/**
	 * ʹ���������г�ʼ���Ĺ�����.
	 *
	 * ��������:2011-4-7
	 * @param newPk_datachange_h ����ֵ
	 */
	public DipDatachangeHVO(String newPk_datachange_h) {

		// Ϊ�����ֶθ�ֵ:
		pk_datachange_h = newPk_datachange_h;

	}


	/**
	 * ���ض����ʶ,����Ψһ��λ����.
	 *
	 * ��������:2011-4-7
	 * @return String
	 */
	public String getPrimaryKey() {

		return pk_datachange_h;

	}

	/**
	 * ���ö����ʶ,����Ψһ��λ����.
	 *
	 * ��������:2011-4-7
	 * @param newPk_datachange_h  String    
	 */
	public void setPrimaryKey(String newPk_datachange_h) {

		pk_datachange_h = newPk_datachange_h; 

	} 

	/**
	 * ������ֵ�������ʾ����.
	 *
	 * ��������:2011-4-7
	 * @return java.lang.String ������ֵ�������ʾ����.
	 */
	public String getEntityName() {

		return "dip_datachange_h"; 

	}

	public String getFpk() {
		return fpk;
	}

	public void setFpk(String fpk) {
		this.fpk = fpk;
	}

	public Integer getResults() {
		return results;
	}

	public void setResults(Integer results) {
		this.results = results;
	}

	public String getGuding() {
		return guding;
	}

	public void setGuding(String guding) {
		this.guding = guding;
	}

	public Integer getSfhb() {
		return sfhb;
	}

	public void setSfhb(Integer sfhb) {
		this.sfhb = sfhb;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public Integer getAfterprecision() {
		return afterprecision;
	}

	public void setAfterprecision(Integer afterprecision) {
		this.afterprecision = afterprecision;
	}

	public Integer getBeforeprecision() {
		return beforeprecision;
	}

	public void setBeforeprecision(Integer beforeprecision) {
		this.beforeprecision = beforeprecision;
	}

	public String getDataprecision() {
		return dataprecision;
	}

	public void setDataprecision(String dataprecision) {
		this.dataprecision = dataprecision;
	}

	public String getPxzd() {
		return pxzd;
	}

	public void setPxzd(String pxzd) {
		this.pxzd = pxzd;
	}

	public UFBoolean getIsfolder() {
		return isfolder;
	}

	public void setIsfolder(UFBoolean isfolder) {
		this.isfolder = isfolder;
	}

	public String getPk_xt() {
		return pk_xt;
	}

	public void setPk_xt(String pk_xt) {
		this.pk_xt = pk_xt;
	} 
	
	
} 