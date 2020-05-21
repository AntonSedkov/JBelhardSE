package classwork.lesson07;

public class Cats extends Animals  {
	private int countMouse;
	
	public Cats(String name, int countMouse ){
		super(name);
		//setName(name);
		this.countMouse = countMouse;
	}
	
	public void show(){
		super.show();
		System.out.print(" " + countMouse);
	}

	public void showMouse(){
		System.out.println(countMouse);
	}

	public int getCountMouse() {
		return countMouse;
	}

	public void setCountMouse(int countMouse) {
		this.countMouse = countMouse;
	}

}