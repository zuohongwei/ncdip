package nc.ui.dip.datalook;

import java.io.Serializable;
import nc.vo.trade.pub.IBDGetCheckClass2;

/**
 * <b> ǰ̨У�����Getter�� </b>
 *
 * <p>
 *     �ڴ˴����Ӵ����������Ϣ
 * </p>
 *
 *
 * @author author
 * @version tempProject 1.0
 */

public class DataLookClientUICheckRuleGetter implements IBDGetCheckClass2,Serializable {

	/**
	 * ǰ̨У����
	 */
	public String getUICheckClass() {
		return "nc.ui.dip.datalook.DataLookClientUICheckRule";
	}

	/**
	 * ��̨У����
	 */
	public String getCheckClass() {
		return null;
	}

}