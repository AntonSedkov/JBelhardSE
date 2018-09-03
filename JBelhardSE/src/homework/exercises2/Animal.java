package homework.exercises2;
public class Animal {

	public int weigth;
	public int age;
	public String name;

	public Animal() {
	}

	public Animal(String name, int age, int weigth) {
		this.setName(name);
		this.setAge(age);
		this.setWeigth(weigth);
	}

	public Animal(Animal a) {
		this.name = a.name;
		this.age = a.age;
		this.weigth = a.weigth;
	}

	/*
	 * public abstract void golos (){ System.out.println("Say") }
	 */

	public void show() {
		System.out.println(name + " возраста " + age + " с весом " + weigth);
	}

	public void create (){
		
	}
	
	
	public void arrCreate(){
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}