package Entities;

public class Rent {
	private String name;
	private String email;
	
	//metodo construtor 
		public Rent(String name, String email) {
			this.name = name;
			this.email = email;
		}
		
	//metodo get e set 	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//metodo retorna toStyring nome e email
	public String toString() {
		return (name + ", " + email);
	}
	
	
	

}
