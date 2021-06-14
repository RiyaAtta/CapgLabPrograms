package jdbccrudeexample;

import java.util.Scanner;

public class ProductManagement {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductManagementSystem pms = new ProductManagementSystem();
		pms.dbConnection();
 
		char cont = 'y';
		while (cont == 'y') {
			System.out.println("Enter the choice : ");
			System.out.println("insert : to insert product");
			System.out.println("update : to update product");
			System.out.println("delete : to delete product");
			System.out.println("getproduct : to a get single product");
			System.out.println("getallproducts : to a single get all products");
			System.out.println("exit : to exit");
			String transaction = sc.next();
			switch (transaction) {
			case "insert":
				pms.insertIntoProductUsingPS();
				break;
			case "update":
				pms.updateProductUsingId();
				break;
			case "delete":
				pms.deleteProductUsingId();
				break;
			case "getproduct":
				pms.getProductById();
				break;
			case "getallproducts":
				pms.getAllProducts();
				break;
			case "exit":
				System.out.println("Thank you for visiting......");
				System.out.println("Please visit again");
				System.exit(0);
				break;
			default:
				break;
			}// switch close
			System.out.println("do you want continue");
			cont = sc.next().trim().charAt(0);
		} // while
	}// main
 
}// class close
 
	

 