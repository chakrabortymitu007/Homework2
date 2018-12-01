package HW2;

public class Computer {
 String computerBrand;
 String color;
 static double price;
 int quantity;
 static String storeName;
 static double budget;
 
 public void buyAMac() {
	 System.out.println("User will buy " +computerBrand );
	 System.out.println("User likes " +color+ " color");
	 System.out.println(computerBrand+ " will cost = " +price);
	 System.out.println("User wants " +quantity+ " " +computerBrand);
 }
 
 public static void buyAWindows() { 
	 
	 System.out.println("User will go to " +storeName);
	 System.out.println("User have  "+budget + " budget  but the price is " +price);
	 
	 
 }
 
 
}
