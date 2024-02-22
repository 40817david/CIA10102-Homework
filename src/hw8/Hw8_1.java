package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {

	public static void main(String[] args) {
		List myList = new ArrayList();
		Object obj = new Object();

		myList.add(new Integer(100));
		myList.add(new Double(3.14));
		myList.add(new Long(21L));
		myList.add(new Short("100"));
		myList.add(new Double(5.1));
		myList.add("Kitty");
		myList.add(new Integer(100));
		myList.add(obj);
		myList.add("Snoopy");
		myList.add(new BigInteger("1000"));

		// Iterator
		Iterator it1 = myList.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next()); 
		}
		System.out.println("============================");

		// for迴圈
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("============================");

		
		//for-each迴圈
		for(Object objs : myList) {
			System.out.println(objs);
		}
		System.out.println("============================");

		
		//移除Number類型
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) instanceof Number) {
				System.out.println(myList.get(i));
			}else {
				myList.remove(i);
			}
		}
		
		//迭代器、for-each無法做增刪，會出現例外
//		Iterator it2 = myList.iterator();
//		while(it2.hasNext()) {
//			if(it2.next() instanceof Number) {
//				System.out.println(it2.next());
//			}else {
//				myList.remove(it2.next());
//			}
//		}
	}

}
