
//Antal m�n antagna till LNU-81027 = 3st
//H�gskolor som har Webbutveckling som program = Blekinge Tekniska h�gskola och Mittuniversitetet



public class Program {

	private String name;
	private String code;
	private int women;
	private int men;
	
	

	
	public Program(String name,String code,int women,int men) {
	super();
	this.name = name;
	this.code = code;
	this.women = women;
	this.men= men;
	}









	public String getName(){
		return name;
	}
	
	public String getCode(){
		return code;
	
	}
	public int getWomen(){
		return women;
	}
	public int getMan(){
		return men;
		
	}
	@Override
	public String toString(){
		return name;
	}
}

