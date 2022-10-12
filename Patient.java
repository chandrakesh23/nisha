
public class Patient {
	private int patientId;
	private String patientName;
	private int bedType; 
	private int noOfDays;
	
	//getters & setters
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getBedType() {
		return bedType;
	}
	public void setBedType(int bedType) {
		this.bedType = bedType;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	//utility method
	public double getBillAmount() {
		int price =0;
		if(bedType==1)
			price=500;
		else if(bedType==2)
			price=350;
		else 
			price=200;
		
		return price*noOfDays;
	}
	
	//toString method to print Patient details
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", bedType=" + bedType
				+ ", noOfDays=" + noOfDays + "]";
	}
	
}
