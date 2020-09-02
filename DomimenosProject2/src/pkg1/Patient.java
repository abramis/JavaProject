//AM 2008030104		Tepelidis Avraam

package pkg1;

public class Patient {
	private String name,surname;
	private int amka;

	Patient(String name,String surname,int amka)	//constructor
	{
			this.name=name;
			this.surname=surname;
			this.amka=amka;
	}

	public String getName() {		//set/get methodoi gia kathe metavliti melous tis klasis
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

	public int getAmka() {
		return amka;
	}

	public void setAmka(int amka) {
		this.amka = amka;
	}


}
