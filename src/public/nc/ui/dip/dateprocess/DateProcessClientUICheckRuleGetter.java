package nc.ui.dip.dateprocess;

import java.io.Serializable;

import nc.vo.trade.pub.IBDGetCheckClass2;

public class DateProcessClientUICheckRuleGetter implements IBDGetCheckClass2,Serializable  {

	/**
	 * 前台校验类
	 */
	public String getUICheckClass() {
		return "nc.ui.dip.dateprocess.DateProcessClientUICheckRule";
	}

	/**
	 * 后台校验类
	 */
	public String getCheckClass() {
		return null;
	}
}
