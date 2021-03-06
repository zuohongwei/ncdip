package nc.vo.dip.recstatus;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.trade.pub.HYBillVO;

public class MyBillVO extends HYBillVO
{
  public CircularlyAccessibleValueObject[] getChildrenVO()
  {
    return super.getChildrenVO();
  }

  public CircularlyAccessibleValueObject getParentVO() {
    return ((DipRecstatusVO)super.getParentVO());
  }

  public void setChildrenVO(CircularlyAccessibleValueObject[] children) {
    if ((children == null) || (children.length == 0)) {
      super.setChildrenVO(null);
    }
    else
      super.setChildrenVO(children);
  }

  public void setParentVO(CircularlyAccessibleValueObject parent)
  {
    super.setParentVO((DipRecstatusVO)parent);
  }
}