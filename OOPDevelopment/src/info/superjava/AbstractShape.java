package info.superjava;


public abstract class AbstractShape implements Shape {

	private int someInt;
//	public abstract int getArea();

	public int getSomeInt() {
		return someInt;
	}

	public void setSomeInt(int someInt) {
		this.someInt = someInt;
	}

}
