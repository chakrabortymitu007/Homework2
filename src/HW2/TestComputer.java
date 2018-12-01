package HW2;

public class TestComputer {
		public static void main(String[] args) {
		//Obect creation for non static variable and method
			Computer comp = new Computer();
			comp.computerBrand = "MAC";
			comp.color = "Black";
			comp.quantity = 2;
			comp.buyAMac();
			//Calling Static variable and Method
			Computer.budget = 2000.00;
			Computer.price = 1200.00;
			Computer.storeName = "Best Buy";
			Computer.buyAWindows();
		}

}
