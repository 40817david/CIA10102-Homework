package hw6;

public class Caculator {

	private int x;
	private int y;

	public Caculator() {
		super();
	}

	public Caculator(int x, int y) throws CalException {
		setXY(x, y);
	}

	public void setXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}  else {
			this.x = x;
			this.y = y;
		}
	}

	public int powerXY() {
		int power =(int)(Math.pow(x, y));
		return power;
	}
}
