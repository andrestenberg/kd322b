package javagym.views;

public class Member {
	
	// Klassvariabel
	private static int numberOfMembers;

	//Instansvariabler
	private String firstName;
	private int bornYear;
	private String adress;
	private String personNummer;
	private int now = 2014;
	private String emailAdress;
	private String postKod;
	
	
	//Constructor
	public Member (String name){
		this.firstName = name;
		numberOfMembers = numberOfMembers +1;	
	}
	
	public String getName(){
		return firstName;
		
	}
	public void setName (String newName){
		firstName = newName;
	}
	public void setBorn(int year){
		
		if (year >1970 && year < now){
			bornYear = year;
		}else{
			bornYear = 1950;
		}
		}
	// Calculate the member age
	public int getAge(){
		return 0;
		
		
	}
	
	}


