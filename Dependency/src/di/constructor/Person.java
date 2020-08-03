package di.constructor;

import di.tire.GoldTire;
import di.tire.Tire;

public class Person {
	public static void main(String[] args) {
		
		Car car = new Car(new GoldTire());
		System.out.println(car.getTire());
		
		
	}
	
}
