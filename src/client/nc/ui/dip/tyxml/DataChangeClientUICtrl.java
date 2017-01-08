package nc.ui.dip.tyxml;

import nc.ui.dip.buttons.IBtnDefine;
import nc.ui.trade.businessaction.IBusinessActionType;
import nc.ui.trade.bill.ISingleController;
import nc.ui.trade.button.IBillButton;
import nc.ui.trade.treecard.ITreeCardController;
import nc.vo.dip.tyxml.DipTYXMLDatachangeBVO;
import nc.vo.dip.tyxml.DipTYXMLDatachangeHVO;
import nc.vo.dip.tyxml.MyBillVO;


/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 *
 * <p>
 *     �ڴ˴����Ӵ����������Ϣ
 * </p>
 *
 * Create on 2006-4-6 16:00:51
 *
 * @author authorName
 * @version tempProject version
 */

public class DataChangeClientUICtrl implements ITreeCardController, ISingleController{

	public String[] getCardBodyHideCol() {
		return null;
	}

	public int[] getCardButtonAry() {

		return new int[]{
				IBillButton.Refresh,
				IBillButton.Add,
				IBillButton.Edit,
				IBtnDefine.LCLINE,
				IBillButton.Save,
				IBillButton.Cancel,
				IBillButton.Delete,
				IBtnDefine.MBZH,//ģ��
				IBtnDefine.Conversion,
				IBtnDefine.initUFOENV,
				IBtnDefine.YuJing,
				IBtnDefine.CONTROL,
//				IBillButton.ImportBill,
//				IBillButton.ExportBill,
                IBtnDefine.folderManageBtn
		};

	}

	public int[] getListButtonAry() {		
		return new int[]{
				IBillButton.Add,
				IBillButton.Edit,
				IBillButton.Save,
				IBillButton.Cancel,
				IBillButton.Delete,
				IBillButton.Refresh,
		};

	}

	public boolean isShowCardRowNo() {
		return true;
	}

	public boolean isShowCardTotal() {
		return false;
	}

	public String getBillType() {
		return "H4H3H6H4";
	}

	public String[] getBillVoName() {
		return new String[]{
				MyBillVO.class.getName(),
				DipTYXMLDatachangeHVO.class.getName(),
				DipTYXMLDatachangeBVO.class.getName()
		};
	}

	public String getBodyCondition() {
		return null;
	}

	public String getBodyZYXKey() {
		return null;
	}

	public int getBusinessActionType() {
		return IBusinessActionType.BD;
	}

	public String getChildPkField() {
		return null;
	}

	public String getHeadZYXKey() {
		return null;
	}

	public String getPkField() {
		return null;
	}

	public Boolean isEditInGoing() throws Exception {
		return null;
	}

	public boolean isExistBillStatus() {
		return false;
	}

	public boolean isLoadCardFormula() {		
		return false;
	}

	public String[] getListBodyHideCol() {	
		return null;
	}

	public String[] getListHeadHideCol() {		
		return null;
	}

	public boolean isShowListRowNo() {		
		return false;
	}

	public boolean isShowListTotal() {
		return false;
	}


	/**
	 * 2011-04-11 chengli
	 * <P>
	 * ��������ɾ��ʱ,�Ƿ��Զ�ά�����ṹ <BR>
	 * ����˵��
	 * 
	 * @return
	 * @see nc.ui.trade.treecard.ITreeCardController#isAutoManageTree()
	 */
	public boolean isAutoManageTree() {
		return true;
	}

	public boolean isChildTree() {
		return false;
	}

	public boolean isTableTree() {
		return false;
	}

	public boolean isSingleDetail() {
		return true;
	}
}