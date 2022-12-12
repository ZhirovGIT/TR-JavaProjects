
public class BankAccountAppl {

	public static void main(String[] args) {
		// ==== User 1
		BankAccount peter = new BankAccount(1111, "Peter", "Leumi", 23, 150);
		peter.display();
		peter.display(true);
		System.out.println(peter.credit(300.));
		System.out.println(peter.getAmount());

		System.out.println(peter.credit(50.));
		System.out.println(peter.getAmount());

		peter.debit(345.);
		System.out.println(peter.getAmount());
		System.out.println();

		// ==== User 2
		BankAccount mariya = new BankAccount(222, "Maria", "ApoAlim", 323);
		mariya.display(false);

		// ==== User 3
		BankAccount user1 = new BankAccount(3333, "Leumi", 44, 1234.);
		// ==== User 4
		BankAccount user2 = new BankAccount(0, "Leumi", 45);
		user2.debit(900_000.);
		// ==== ARRAY
		BankAccount[] bank = { peter, mariya, user1, user2 };

		System.out.println(getTotalBalanceOfAnonymous(bank));
	}

	private static double getTotalBalanceOfAnonymous(BankAccount[] bank) {
		double res = 0.0;
		
		for (int i = 0; i < bank.length; i++) {
			if (bank[i].getOwner() == null)
				res += bank[i].getAmount();
		}

		return res;
	}

}
