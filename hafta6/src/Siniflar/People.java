package Siniflar;

public class People {
	private String name;
	private String surname;
	Cars c;
	public Cars getC() {
		return c;
	}
	public void setC(Cars c) {
		this.c = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public People(String name, String surname, Cars c) {
		super();
		this.name = name;
		this.surname = surname;
		this.c = c;
	}

}
