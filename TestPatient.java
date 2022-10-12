public class TestPatient {
	public static void main(String[] args) {
		Patient p1 = new Patient();
		p1.setPatientId(1501);
		p1.setPatientName("Mr. Ashok");
		p1.setBedType(1);
		p1.setNoOfDays(13);
		System.out.println(p1);
		System.out.println("Bill: "+p1.getBillAmount());
		
		InHousePatient p2= new InHousePatient();
		p2.setPatientId(1709);
		p2.setPatientName("Ms Smith");
		p2.setBedType(1);
		p2.setNoOfDays(20);
		p2.setDiscount(15);
		System.out.println(p2);
		System.out.println("Bill: "+p2.getBillAmount());
	}
}