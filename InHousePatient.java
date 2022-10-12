
public class InHousePatient extends Patient{
	private double discount;
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	@Override
	public double getBillAmount() {
		double billAmount= super.getBillAmount();
		if(billAmount>5000)
			return billAmount*(1 -discount/100);
		else
			return billAmount*(1-5/100);
	}
}
