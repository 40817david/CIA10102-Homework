package hw8;

import java.util.Objects;

public class Train implements Comparable<Train>{
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
	
	public int compareTo(Train t) {
		if(this.number < t.number) {
			return 1;
		}else if(this.number == t.number) {
			return 0;
		}else {
			return -1;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
}

