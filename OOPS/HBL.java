package Encapsulation;

public class HBL extends BankLoan{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankLoan loan = new BankLoan();
		
		loan.setName("Azhar");
		loan.setage(25);
		loan.setamount(12500);
		
		System.out.println("Name: "+loan.getName());
		System.out.println("Age: "+loan.getage());
		System.out.println("Amount: "+loan.getamount());
		
	}

}
