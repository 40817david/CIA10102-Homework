package hw9;

class MyThread implements Runnable {
	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 2501 + 500));
				System.out.println(name + "吃第" + i + "碗飯");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");

	}

}

public class Hw9_1 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("饅頭人");
		MyThread mt2 = new MyThread("詹姆士");

		Thread th1 = new Thread(mt1);
		Thread th2 = new Thread(mt2);

		System.out.println("-----大胃王快食比賽開始!-----");

		th1.start();
		th2.start();

		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-----大胃王快食比賽結束!-----");
	}

}
