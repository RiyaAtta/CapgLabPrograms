package com.capgemini.anonymousclassexample;

public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape() {
			
			int height=30;
			@Override
			void perimeter() {
				System.out.println("Shape Perimeter");
			}

			@Override
			void area() {
				System.out.println("Shape area = "+(length*height));
				System.out.println("length = "+length);
			}
		};
		
		s.area();
		s.perimeter();
		
		Vehicle v = new Vehicle() {

			int cost=3000000;
			@Override
			public void costOfVehicle() {
				// TODO Auto-generated method stub
				System.out.println("cost of vehicle = "+cost);
				
			}

			@Override
			public void TypeOfVehicle() {
				// TODO Auto-generated method stub
				System.out.println("type of vehicle");
			}
			
		};
		
		v.costOfVehicle();
		v.TypeOfVehicle();
	}

}
