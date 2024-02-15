package hw5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw5_2 {

	public void randAvg(Set set) {
		while (set.size() != 10) {
			set.add((int) (Math.random() * 101));
		}

		Iterator it = set.iterator();
		System.out.println("本次亂數結果");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public void getAvg(Set set) {
		int sum = 0;

		Iterator it = set.iterator();
		while (it.hasNext()) {
			sum += (int) (it.next());
		}

		System.out.println("平均數" + sum / 10);

	}

	public static void main(String[] args) {
		Set set = new HashSet();
		Hw5_2 objs = new Hw5_2();

		objs.randAvg(set);
		System.out.println();
		objs.getAvg(set);

	}
}
