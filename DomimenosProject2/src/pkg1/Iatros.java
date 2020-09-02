//AM 2008030104		Tepelidis Avraam

package pkg1;

public class Iatros {
	private String name;		//private ara ta antikeimena tis klasis autis stin main px, den mporoun na prospelasoun auti ti metavliti
	private String eidikotita;
	private int code;
	private static int docCode=1;	//static ara i metavliti auti anhkei stin klasi ki oxi se kathe antikeimeno tis

	Iatros(String name,String eidikotita)	//constructor
	{
		this.name=name;				//to 1o "name" einai h metavliti melous tis klasis enw to 2o i parametros tou constructor, giayto vazoume "this"
		this.eidikotita=eidikotita;
		code=docCode;	
		docCode++;			//ton kwdiko toy to vazei to systima, oxi o xristis
	}

	public String getName() {		//kanoume set/get methodous gia kathe metavliti mas
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEidikotita() {
		return eidikotita;
	}

	public void setEidikotita(String eidikotita) {
		this.eidikotita = eidikotita;
	}
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

     

}

