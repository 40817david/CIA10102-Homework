package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
		
		Set<Train> set = new HashSet<Train>();
		
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		//不重複Train物件-迭代器
		Iterator<Train> it1 = set.iterator();
		while(it1.hasNext()) {
			Train t = it1.next();
			t.getInfo();
		}
//		
		//不重複Train物件-for-each迴圈
		for(Train t : set) {
			t.getInfo();
		}


		
		
		//Train重複，由大到小排序
		List<Train> list = new ArrayList<Train>();
		
		list.add(t3);
		list.add(t5);
		list.add(t7);
		list.add(t6);
		list.add(t1);
		list.add(t4);
		list.add(t2);
		
		Collections.sort(list);
		
		//Train重複，由大到小排序-迭代器
		Iterator<Train> it2 = list.iterator();
		while(it2.hasNext()) {
			Train t = it2.next();
			t.getInfo();
		}
		
		
		//Train重複，由大到小排序-for迴圈
		for(int i = 0 ;i<list.size();i++) {
			Train t = list.get(i);
			t.getInfo();
		}
		
		//Train重複，由大到小排序-for-each迴圈
		for(Train t : list) {
			t.getInfo();
		}

		
		
		
		
		//Train不重複，由大到小排序
		TreeSet<Train> ts = new TreeSet<Train>();
		
		ts.add(t3);
		ts.add(t5);
		ts.add(t7);
		ts.add(t6);
		ts.add(t1);
		ts.add(t4);
		ts.add(t2);
		
		
		//Train重複，由大到小排序-迭代器
		Iterator<Train> it3 = ts.iterator();
		while(it3.hasNext()) {
			Train t = it3.next();
			t.getInfo();
		}
		
		//Train重複，由大到小排序-for-each迴圈
		for(Train t : ts) {
			t.getInfo();
		}

		
		
	}

}


