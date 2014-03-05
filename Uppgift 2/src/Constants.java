
public class Constants {
	/**Minsta tillåtna Storlek*/
	public static int MIN_SIZE = 8;
	/** Största tillåtna storlek*/
	public static int MAX_SIZE = 28;
	/**Billigaste cykeln kan vara*/
	public static int MIN_PRICE = 0;
	/** Dyraste cykeln kan vara*/
	public static int MAX_PRICE = 30000;
	
	public static String colors [] = new String [9];{
	colors[0] = "Red";
	colors[1] = "Yellow";
	colors[2] = "Black";
	colors[3] = "Green";
	colors[4] = "Purple";
	colors[5] = "Pink";
	colors[6] = "Silver";
	colors[7] = "Darkred";
	colors[8] = "White";
	}
	public static final String D_color = "Color not available";

	public static String checkColor (String farg){
		farg = farg.toLowerCase();
		boolean foundColor = false;
		
		for(int i = 0; i<colors.length;i++){
			if(farg.equals(colors[i])){
				foundColor = true;
			}
			}
		if(foundColor){
			return farg;
			
		}else{ 
			
			return D_color;
		}
		}
		
	}

