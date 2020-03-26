
public class Test {

	public static void main(String[] args) {
	
		Car.myStatic += 20;
		  System.out.println(Car.myStatic); 
		 
		  Car c1 = new Car();
		  System.out.println("Статическая переменная c1 = " + Car.myStatic);
		  c1.notStatic +=20;  
		  System.out.println("Не статическая переменная c1 = "+c1.notStatic);
		  
		  Car c2 = new Car();
		  System.out.println("Статическая переменная c2 = "+c2.myStatic);  
		  System.out.println("Не статическая переменная c2 = "+c2.notStatic);
	}

}

