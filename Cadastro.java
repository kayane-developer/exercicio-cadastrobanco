package entities;

public class Cadastro {
	
	private int account;
	private String name;
	private double balance;
	
	
	public Cadastro (int account, String name, double initialMoney) {
		this.account = account;
		this.name= name;
		addMoney(initialMoney);
	}
	public Cadastro (int account, String name) {
		this.account = account;
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public int getAccount() {
		return account;
	}
	public double getBalance() {
		return balance;
	}
	
	public void addMoney (double numberToAdd) {
		balance+=numberToAdd;
	}
	
	public void withDraw (double numberToDiscount) {
		balance -= (numberToDiscount + 5.00);
	}
	
	public String toString() {
		return "Account: " + account
				+ ", Holder: " + name
				+ ", Balance: $ "
				+  String.format("%.2f", balance);
	}

}
