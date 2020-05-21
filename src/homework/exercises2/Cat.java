package homework.exercises2;
public class Cat extends Animal {
	private int mice;

	public Cat (){
	}
	
	public Cat (String name, int age,int weigth, int mice){
		super( name,  age, weigth);
		this.setMice(mice);
	}
	
	public Cat (Animal b){
		super(b);
	}
	
	public void show() {
		super.show();
		System.out.print( name + " cловил " + mice + " мышей.");
		System.out.println();
	}

	
	/*
	 * public abstract void golos (){ System.out.println("Miay - Miay") }
	 */
	
	public int getMice() {
		return mice;
	}

	public void setMice(int mice) {
		this.mice = mice;
	}

}