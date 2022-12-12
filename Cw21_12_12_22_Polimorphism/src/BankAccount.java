
public class BankAccount {
	private long account;
	private String owner;
	private String bankName;
	private int branch;
	private double amount;

	public BankAccount(long account, String owner, String bankName, int branch, double amount) {
		this.account = account;
		this.owner = owner;
		this.bankName = bankName;
		this.branch = branch;
		this.amount = amount + 100.; // bonus for opening bank account
	}

	public BankAccount(long account, String owner, String bankName, int branch) {
		this.account = account;
		this.owner = owner;
		this.bankName = bankName;
		this.branch = branch;
		amount = 50.;
	}

	public BankAccount(long account, String bankName, int branch, double amount) {
		this.account = account;
		this.bankName = bankName;
		this.branch = branch;
		this.amount = amount;
	}

	public BankAccount(long account, String bankName, int branch) {
		this.account = account;
		this.bankName = bankName;
		this.branch = branch;
	}

	// =====

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	public double getAmount() {
		return amount;
	}

	public void debit(double sum) {
		if (sum > 0.)
			amount += sum;

	}

	public boolean credit(double sum) {
		if (sum < 0. || sum > amount)
			return false;

		amount -= sum;
		return true;
	}

	public void display() {
		String res;
		boolean check = owner != null;

		if (check)
			res = "Owner: " + owner;
		else
			res = "Owner: Anonymous";

		res += ", Account: " + account + ", Amount: " + amount + ", Bank: " + bankName + ", Branch: " + branch;

		System.out.println(res);
	}

	public void display(boolean gender) {
		String res;

		if (gender)
			res = "Mr.";
		else
			res = "Mrs.";
		
		boolean check = owner != null;
		if(check) res += owner;
		else res += "Anonymous";
		System.out.println(res);
	}
}
