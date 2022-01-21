package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("The deposit rate is 8%");
	}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	BankInfo c = new AxisBank();
	b.deposit();
	c.deposit();
	c.saving();
	c.fixed();
}
}