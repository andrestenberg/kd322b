package upg1;

//Klassmetod
public class House {
	
		
		//Instansvariabler
		   private int year;  
		   private int size;  
		   
		   //Klassvariabel
		   private static int nbrOfHouses;  
		   
		   
		   public static final int MIN_SIZE =10; 
		   //Final betyder att du inte kan �ndra p� v�rdet n�r man k�rt applicationen
		   
		 //Constructor
		   public House(int _year,int _size){    
			   year = _year;
			   if (_size > MIN_SIZE){
			   size = _size;
			   }else{
				   size = MIN_SIZE;
			   }
			   // l�gger till ett hus f�r varje hus som e r�knat
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




