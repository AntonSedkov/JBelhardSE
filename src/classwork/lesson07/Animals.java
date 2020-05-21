package classwork.lesson07;

public class Animals {
	private String name;
	
	public Animals(String name){
		this.name = name;
	}
	
	public void show(){
		System.out.print(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}