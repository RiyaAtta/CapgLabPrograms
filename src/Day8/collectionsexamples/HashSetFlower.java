package Day8.collectionsexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HashSetFlower {
	public static void main(String[] args){

		HashSet<Flower> flowerList = new HashSet<Flower>();
	Scanner sc=new Scanner(System.in);
	char ch='y';
	while(ch == 'y')
	{
		System.out.println("Enter your choice");
		System.out.println("1) Create Flower List\n"
				+ "2) Display Flower List\n"
				+ "3) Remove Flower Based On Quantity\n");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			
			Flower f;
				Scanner sc1= new Scanner(System.in);
				for(int i=0;i<3;i++) {
					System.out.println("Enter the details of Flower");
					System.out.println("Enter the Flower ID : ");
					int id = sc1.nextInt();
					System.out.println("Enter the Flower Name");
					String name = sc1.next();
					System.out.println("Enter the Price : ");
					double pr = sc1.nextDouble();
					System.out.println("Enter the Quantity : ");
					double q = sc1.nextDouble();
					flowerList.add(new Flower(id,name,pr,q));
				}
			break;
		case 2:
			Iterator<Flower> flowerItr = flowerList.iterator();
			System.out.println("Flower HashSet values using Iterator");
			while(flowerItr.hasNext()) {
				Flower fl = flowerItr.next();
				System.out.println(fl.getFid() + " \t\t\t " + fl.getFname()+" \t\t\t "+ fl.getPrice() + " \t\t\t " + fl.getQty());
				System.out.println();
			}
			break;
		case 3:
			Iterator<Flower> flowerItr1 = flowerList.iterator();
			/*System.out.println("Enter the Flower id to remove");
			int id = sc.nextInt();*/
			while(flowerItr1.hasNext()) {
				Flower fl = flowerItr1.next();
				if(fl.getQty()<=0) {
					flowerItr1.remove();
				}
			}
			break;
		default:System.out.println("Incorrect Choice!!!");
			System.out.println();
		}
		
		System.out.println("Do you wish to Continue?(y/n):");
		ch = sc.next().charAt(0);
		System.out.println();
	}
	
	System.out.println("Thank You!!!");
	
	sc.close();
	}
}