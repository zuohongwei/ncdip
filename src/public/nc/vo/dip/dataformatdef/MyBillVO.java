package nc.vo.dip.dataformatdef;

import java.util.Arrays;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.trade.pub.HYBillVO;




/**
 * 
 * ���ӱ�/����ͷ/������ۺ�VO
 *
 * ��������:Your Create Data
 * @author Your Author Name
 * @version Your Project 1.0
 */
public class  MyBillVO extends HYBillVO {

	public CircularlyAccessibleValueObject[] getChildrenVO() {
		return (DataformatdefBVO[]) super.getChildrenVO();
	}

	public CircularlyAccessibleValueObject getParentVO() {
		return (DataformatdefHVO) super.getParentVO();
	}

	public void setChildrenVO(CircularlyAccessibleValueObject[] children) {
		if( children == null || children.length == 0 ){
			super.setChildrenVO(null);
		}
		else{
			super.setChildrenVO((CircularlyAccessibleValueObject[]) Arrays.asList(children).toArray(new DataformatdefBVO[0]));
		}
	}

	public void setParentVO(CircularlyAccessibleValueObject parent) {
		super.setParentVO((DataformatdefHVO)parent);
	}

}