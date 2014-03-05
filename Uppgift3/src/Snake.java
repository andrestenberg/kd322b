
public class Snake extends Animal {
private Boolean Poison;
	
	public Snake (String Latin,Boolean Poison){
		super (Latin);
		this.Poison = Poison;
		
	}
	public Boolean getPoison(){
		return Poison;
	}
	public void setPoison(boolean Poison){
		this.Poison = Poison;
	}

	@Override
	public String getInfo() {
		String s; // defines string s
		
		if(Poison){
			s = ""; // this is were s gets an empty String
		
		}else{
			s = "not";
		}
		
		return "The snake \""+super.getLatin()+"\" is "+ s +" dangerous \n";
		
		
		
	}

}

		
	
	
	

