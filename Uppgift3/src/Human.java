

public class Human {
	
	private String name;
	private Dog dog;
	private String Info = "";


	public Human (String s){
		name = s;
		
	}
	
	public String getName(){
		
		return name;
	}
	
	public void buyDog(Dog d) {
		dog = d;
		//return dog;
		
		
	}
	public String getInfo(){
		
		
		
		if(dog == null){
		Info = ("Dogless");
		return Info;
		}else{
			Info = ("" + name + " Has a dog named " + dog.getName());
			return Info;
		
		}
		}

	public void buyDog(java.lang.String text) {
		
		
	}
	
}
	
	
	
	
	
	



