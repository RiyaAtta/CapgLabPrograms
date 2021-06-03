package com.capgemini;


import java.util.Scanner;

import com.capgemini.service.*;

public class VegetableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm = new Scanner(System.in);
		int choice;
		VegetableManager vm = new VegetableManager();
		char c='y';
		while(c!='n' && c!='N' && c!='0'){
			System.out.print("1. Create Vegetable\n2. Display Vegetables\n3. Update Vegetable\n4. Delete Vegetable\n5. Sort the created list\nEnter your choice : ");
			choice = sm.nextInt();
			switch(choice) {
			case 1 : vm.createVegetable();
					break;
			case 2 : vm.read();
					break;
			case 3 : vm.update();
					break;
			case 4 : vm.delete();
					break;
			case 5 : vm.sort();
					break;
			default : System.out.println("\nEnter correct choice 1-5...");
			}
			System.out.print("\nDo you want to continue?(y/n) ");
			c=sm.next().trim().charAt(0);
		}
		System.out.println("-----Thank You-----");
	}

}