
public class Bike {
	
	private String color;
	private int price;
	private int size;
	
	private static int nbrOfBikes;
	
	
	public Bike(String farg, int storlek){
		farg = color;
		storlek = size;
		
		
	}
	/**Visar cykel med de förutbestämde MIN värdena*/
	public Bike(String farg, int storlek, int pris){
		this.color  = Constants.checkColor(farg);
		 if (storlek > Constants.MIN_SIZE && storlek < Constants.MAX_SIZE){
			   this.size = storlek;
			   }else{
				   size = Constants.MIN_SIZE;
			   }
		 if (pris > Constants.MIN_PRICE && pris < Constants.MAX_PRICE){
			   this.price = pris;
			   }else{
				   price = Constants.MIN_PRICE;
			   }
		
		 
		
		nbrOfBikes = nbrOfBikes + 1; 
	}
		
		
	/** Hämtar och returnerar farger*/
	public String getColor(){
		return color;
	}
	/** Hämtar och returnerar Storlek*/
	public int getSize(){
		return size;
	}
	/**Hämtar och returnerar priset*/
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int pris){
		
	}
	/** Hämtar antalet cyklar*/
	public static int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
}
