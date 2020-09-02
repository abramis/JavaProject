//AM 2008030104		Tepelidis Avraam
package pkg1;

import tuc.ece.cs111.util.StandardInputRead;	//kanoyme import tin klassi gia anagnwsi apto standard input
import java.util.Date;

public class Nosokomeio {				//vazw ena tmima, oxi polla opws zitaei
	private String name;				
	private String tmima;
	private Iatros listOfIatroi[] = new Iatros[100];
	private Patient listOfPatients[] = new Patient[100];
	private Eksetasi listOfEksetaseis[] = new Eksetasi[100];
	private Fakelos listOfFakelo[]= new Fakelos[100];
	private int numOfIatroi = 0;
	private int numOfEksetaseis = 0;
	private int numOfPatients = 0;
	private int numOfFakelo = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getTmima() {
		return tmima;
	}

	public void setTmima(String tmima) {
		this.tmima = tmima;
	}


		//methodoi gia eisagwgi mexri 100 iatrwn,eksetasewn,asthenwn
	public void insertIatros() {
		if (numOfIatroi >=100) {
			System.out.println("to nosokomeio den mporei na xei perissoterous giatrous");
		} else {
			StandardInputRead sir = new StandardInputRead();
			String name,eidikotita;
			name = sir.readString("dwse onoma giatrou\n");
			eidikotita = sir.readString("dwse eidikotita giatrou\n");
			listOfIatroi[numOfIatroi] = new Iatros(name, eidikotita);
			numOfIatroi++;

		}

	}

	public void insertEksetasi() {
		if (numOfEksetaseis >=100) {
			System.out.println("to nosokomeio den mporei na kanei perissoteres eksetaseis");
		} else {
			StandardInputRead sir = new StandardInputRead();
			String name;
			name = sir.readString("dwse onoma eksetasis\n");
			listOfEksetaseis[numOfEksetaseis] = new Eksetasi(name);
			numOfEksetaseis++;

		}

	}

	public void insertPatient() {
		if (numOfPatients >=100) {
			System.out.println("den yparxei dynatotita gia perissoterous astheneis");
		} else {
			StandardInputRead sir = new StandardInputRead();
			String name, surname;
			name = sir.readString("dwse onoma astheni\n");
			surname = sir.readString("dwse epitheto astheni\n");
			int amka;
			do
				amka = sir.readPositiveInt("dwse to amka\n");
			while(amka==-1.0);
			listOfPatients[numOfPatients] = new Patient(name, surname,amka);
			numOfPatients++;

		}

	}
	//methodoi gia ektypwsi giatrwn,eksetasewn,asthenwn,fakelwn
	public void printIatroi()
	{
		if(numOfIatroi==0)
			System.out.println("Δεν υπαρχουν αποθηκευμενα Φαρμακα");
		
		for(int i=0;i<numOfIatroi;i++)
		{
			System.out.println(listOfIatroi[i].getCode()+"   " +listOfIatroi[i].getName()+"   "+listOfIatroi[i].getEidikotita());
		}
	}
	public void printEksetaseis()
	{
		if(numOfEksetaseis==0)
			System.out.println("Den yparxoun eksetaseis");
		for(int i=0;i<numOfEksetaseis;i++)
		{
			System.out.println(listOfEksetaseis[i].getName()+"   "+listOfEksetaseis[i].getCodeEx());
		}
	}
	public void printPatients()
	{
		if(numOfPatients==0)
			System.out.println("den yparxoun astheneis");
		for(int i=0;i<numOfPatients;i++)
		{
			System.out.println(listOfPatients[i].getAmka()+"   "+listOfPatients[i].getName()+"   "+listOfPatients[i].getSurname());
		}
	}
	public void printFakeloi()
	{

		if(numOfFakelo==0)
			System.out.println("den yparxoun fakeloi");
		for(int i=0;i<numOfFakelo;i++)
		{
			System.out.println("fakelos "+i);
			listOfFakelo[i].printFakelo();
			System.out.println("\n\n");
		}
	}
	
	public void insertFakelos()
	{

		StandardInputRead sir = new StandardInputRead();	//StandardInputRead: voithitiki class gia anagnwsi apto standard input. kanoyme ena neo antikeimeno autis gia
		int tmpEksetasi;									//na to xrisimopoihsoume parakatw gia na diavasoume apto pliktrologio
		int tmpIatros;
		int tmpPatient;
		Eksetasi eksetaseis[]=new Eksetasi[6];
		Date dtin,dtout;

		int j=0;
		int arithmos;
		int flag1=0;
		int flag2=1;
		if(numOfEksetaseis!=0 && numOfIatroi!=0 && numOfPatients!=0)	
		{
			
			printEksetaseis();
			System.out.println("dwse kwdiko eksetasis kai arithmo eksetasewn");
			do
			{
				do
					tmpEksetasi=findEksetasi(sir.readPositiveInt("kwdikos: "));
				while(tmpEksetasi==-1);
				arithmos=sir.readPositiveInt("arithmos ekset: ");
				if(arithmos+j>5)
				{
					System.out.println("den ginetai panw apo 5 eksetaseis");
				}
				else
				{
					for(int i=j;i<arithmos+j;i++)
					{
						eksetaseis[i]=listOfEksetaseis[tmpEksetasi];
					}
					j=j+arithmos;
					if(j==5)
					{
						flag1=1;
					}
					if(flag1==0)
					{
						flag2=sir.readPositiveInt("theleis alli eksetasi; an oxi pata 0");
						if(flag2==0)
							flag1=1;
					}
				}
				
			}while (flag1!=1);
	

			printIatroi();
			do
				tmpIatros=findIatros(sir.readString("dwse onoma iatrou: "));
			while(tmpIatros==-1);
			printPatients();
			do
				tmpPatient=findPatient(sir.readString("dwse epitheto astheni: "));
			while(tmpPatient==-1);
			
			do
				dtin=sir.readDate("dwse hmerominia eisagwgis\n");
			while(dtin==null);
			do
				dtout=sir.readDate("dwse hmerominia eksodou\n");
			while(dtout==null);
			listOfFakelo[numOfFakelo]=new Fakelos(listOfPatients[tmpPatient],listOfIatroi[tmpIatros],dtin,dtout,eksetaseis);
			numOfFakelo++;
			
			
		}
		else
			System.out.println("den yparxoun stoixeia");
			
	}
	//3 methodoi find parakatw poy voithoun sto parapanw insertFakelo
	private int findEksetasi(int ekseCode)
	{
		for(int i=0;i<numOfEksetaseis;i++)
			if(listOfEksetaseis[i].getCodeEx()==ekseCode)
				return i;
		System.out.println("den vrethike eksetasi");
		return -1;
		
		
	}
	
	private int findIatros(String name)
	{
		for(int i=0;i<numOfIatroi;i++)
			if((listOfIatroi[i].getName()).equals(name))
				return i;
		System.out.println("den vrethike giatros");
		return -1;
	}

	private int findPatient(String surname)
	{
		for(int i=0;i<numOfPatients;i++)
			if((listOfPatients[i].getSurname()).equals(surname))
				return i;
		System.out.println("den vrethike asthenis");
		return -1;
	}
	
	private int findPatient2(int amka)		//voithitiki euresi astheni me vasi to amka gia tin xrisimopoihsh tis methodou sto deletePatient
	{
		for(int i=0;i<numOfPatients;i++)
			if(listOfPatients[i].getAmka()==(amka))
				return i;
		System.out.println("den vrethike asthenis");
		return -1;
	}
	
	public void deletePatient()			//diagrafi astheni me vasi to AMKA, den diagrafw kai tous fakelous nosileias
	{
		StandardInputRead sir = new StandardInputRead();
		int i;
		printPatients();
		if(numOfPatients!=0)
		{
			do
				i=findPatient2(sir.readPositiveInt("dwse amka astheni "));
			while(i==-1);
			listOfPatients[i]=null;
			for(int j=i;j<numOfPatients-1;j++)
				listOfPatients[j]=listOfPatients[j+1];
			listOfPatients[numOfPatients-1]=null;
			numOfPatients--;
		}
	}


	
}
