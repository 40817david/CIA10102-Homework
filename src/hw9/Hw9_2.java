package hw9;

class Account {
	 int save = 0;

	synchronized public void deposit(int money) {
		while (save > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				System.out.println("熊大被老媽告知帳戶已經有錢!");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		save += money;
		System.out.println("媽媽存了" + money + "，帳戶共有:" + save);
		notify();
	}

	synchronized public void withdraw(int money) {
		while (save == 0) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				System.out.println("媽媽被熊大要求匯款!");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		save -= money;
		System.out.println("熊大領了" + money + "，帳戶共有:" + save);
		if (save < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
		}
		notify();
	}
}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(2000);
		}
	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000);
		}
	}
}

public class Hw9_2 {
	public static void main(String[] args) {
		Account a = new Account();
		
		Mom mom = new Mom(a);
		Son son = new Son(a);
	
		mom.start();
		son.start();
	}
}
