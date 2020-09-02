//AM 2008030104		Tepelidis Avraam

package pkg1;

public class Eksetasi {
	private String name;
	private int codeEx;
	private static int numCode=1;
	
	
	Eksetasi(String name)
	{
		this.name=name;
		codeEx=numCode;
		numCode++;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getCodeEx() {
		return codeEx;
	}


	public void setCodeEx(int code) {
		codeEx = code;
	}


	public static int getNumCode() {
		return numCode;
	}


	public static void setNumCode(int numCode) {
		Eksetasi.numCode = numCode;
	}




}
