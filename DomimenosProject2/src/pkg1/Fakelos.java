//AM 2008030104		Tepelidis Avraam

package pkg1;

import java.util.Date;	//import tin vivliothiki gia to date

public class Fakelos {
	private Patient asthenis;
	private Iatros giatros;
	private Date dtIN;
	private Date dtOUT;
	private Eksetasi listOfEksetaseis[]=new Eksetasi[6]; 
	
	Fakelos(Patient asthenis,Iatros giatros,Date dtIN,Date dtOUT, Eksetasi listOfEksetaseis[])
	{
		this.asthenis=asthenis;
		this.giatros=giatros;
		this.dtIN=dtIN;
		this.dtOUT=dtOUT;
		this.listOfEksetaseis=listOfEksetaseis;
		this.listOfEksetaseis[5]=null;
	}



	public Date getDtin() {
		return dtIN;
	}



	public void setDtin(Date dtIN) {
		this.dtIN = dtIN;
	}

	public Date getDtout() {
		return dtOUT;
	}



	public void setDtout(Date dtOUT) {
		this.dtOUT = dtOUT;
	}

	public Patient getAsthenis() {
		return asthenis;
	}
	public void setAsthenis(Patient asthenis) {
		this.asthenis = asthenis;
	}
	public Iatros getGiatros() {
		return giatros;
	}
	public void setGiatros(Iatros giatros) {
		this.giatros = giatros;
	}



	public Eksetasi[] getListOfEksetaseis() {
		return listOfEksetaseis;
	}
	public void setListOfEksetaseis(Eksetasi[] listOfEksetaseis) {
		this.listOfEksetaseis = listOfEksetaseis;
	}
	
	public void printFakelo()
	{
		System.out.println("Hmerominia eisodou: "+dtIN);
		System.out.println("Hmerominia eksodou: "+dtOUT);
		System.out.println("Asthenis: " + asthenis.getSurname());
		System.out.println("Iatros therapwn: "+giatros.getName()+"\n");
		System.out.println("Amka: "+asthenis.getAmka());
		int i=0;
		while(listOfEksetaseis[i]!=null)
		{
			System.out.println(listOfEksetaseis[i].getName()+"   " +listOfEksetaseis[i].getCodeEx());
			i++;
		}
		
	}
	
	
}
