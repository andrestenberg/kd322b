
public class Main {

	
public static void main(String[] args) {
	///**MyBikes**///
	Bike bike1 = new Bike("red",20,3500);
	Bike bike2 = new Bike("Yellow",28,5000);
	Bike bike3 = new Bike("Black",19,1999 );
	Bike bike4 = new Bike("Green",20, 3000 );
	Bike bike5 = new Bike("Purple",20, 3999 );
	Bike bike6 = new Bike("Black",15, 2000 );
	Bike bike7 = new Bike("Pink",28, 10000 );
	Bike bike8 = new Bike("Silver",20, 8000 );
	Bike bike9 = new Bike("Darkred",12, 2000 );
	Bike bike10 = new Bike("White",20, 20000 );

	
	Bike [] bikeArray = new Bike [10];
	
	bikeArray [0] = bike1;
	bikeArray [1] = bike2;
	bikeArray [2] = bike3;
	bikeArray [3] = bike4;
	bikeArray [4] = bike5;
	bikeArray [5] = bike6;
	bikeArray [6] = bike7;
	bikeArray [7] = bike8;
	bikeArray [8] = bike9;
	bikeArray [9] = bike10;
	
	for(int i = 0;i<bikeArray.length;i++){
		int a = i+1;
	
		System.out.println("Cykelnummer: " + a + " Färg: "  +bikeArray[i].getColor() + " Hjulstorlek: " + bikeArray[i].getSize() + " Pris: " + bikeArray[i].getPrice());
		
	}
	
	
	
			
		
		
}
}
