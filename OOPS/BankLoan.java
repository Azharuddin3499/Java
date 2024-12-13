package Encapsulation;

public class BankLoan {
	
	private String name;
	private int age;
	private int amount;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setage(int age) {
		if(age>=18 && age<=60) {
			this.age = age;
		}else {
			System.out.println("Please Enter valid amount");
		}
	}
	
	public void setamount(int amount) {
		if(amount>=10000 && amount<=150000) {
		this.amount = amount;
		}else {
			System.out.println("Please Enter valid amount");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public int getamount() {
		return amount;
	}
	
	
}
