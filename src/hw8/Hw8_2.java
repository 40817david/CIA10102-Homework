package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw8_2 {
	 
	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		//不重複Train物件
		
		Set set = new HashSet();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String str = (String)(it.next());
			System.out.println();
		}

	}

}

class Train {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(){
		super();
	}
	
	public Train(int number, String type, String start, String dest, double price) {
		setInfo(number, type, start, dest, price);
	}
	
	public void getInfo() {
		System.out.println("班次:" + number);
		System.out.println("型別:" + type);
		System.out.println("出發地:" + start);
		System.out.println("目的地:" + dest);
		System.out.println("票價:" + price);
		System.out.println("==========================");
	}
	
	public void setInfo(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
}

