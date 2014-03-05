package upg1;

//Klassmetod
public class House {
	
		
		//Instansvariabler
		   private int year;  
		   private int size;  
		   
		   //Klassvariabel
		   private static int nbrOfHouses;  
		   
		   
		   public static final int MIN_SIZE =10; 
		   //Final betyder att du inte kan ändra på värdet när man kört applicationen
		   
		 //Constructor
		   public House(int _year,int _size){    
			   year = _year;
			   if (_size > MIN_SIZE){
			   size = _size;
			   }else{
				   size = MIN_SIZE;
			   }
			   // lägger till ett hus för varje hus som e räknat
			   nbrOfHouses = nbrOfHouses +1 ;
			   }   
		   
			   public static int getNbrHouses(){    
				   return nbrOfHouses;    } 
			   
			   //Instansmetoder
			   public int getYear(){
				   return year;
			 
				   }   
				   public int getSize(){  
					   return size;
					   
					   } 
				   
			   
				   
		   }




