//AM 2008030104		Tepelidis Avraam

package pkg2;

import pkg1.Nosokomeio;
import tuc.ece.cs111.util.StandardInputRead;

public class MainClass {


	public static void main(String[] args) {
		
		StandardInputRead sir = new StandardInputRead();
		int k,l;
		Nosokomeio N = new Nosokomeio();
		do {
			printMenu();
			k = sir.readPositiveInt("epelekse mia leitourgia apo 1-7\n");

		} while (k < 0 || k > 7);
		while (k != 0) {
			if (k == 1) 
			{
				System.out.println("eisagwgi nosokomeioy");
				N.setName(sir.readString("dwse onoma nosokomeioy:  "));
				N.setTmima(sir.readString("dwse tmima:  "));
			} 
			else if (k == 2) 
			{
				System.out.println("eisagwgi iatroy");
				N.insertIatros();

			} 
			else if (k==3)
			{
				System.out.println("eisagwgi astheni");
				N.insertPatient();
				
				
			} 
			else if (k==4)
			{
				System.out.println("eisagwgi fakeloy");
				N.insertFakelos();
			}
			else if (k==5)
			{
				System.out.println("eisagwgi eksetasis");
				N.insertEksetasi();
			}
			else if (k==6)
			{	
				System.out.println("diagrafi astheni\n");
				N.deletePatient();
			}
			else
			{
				System.out.println("ektypwsi: dialekste ti na typwthei");
				System.out.println("1. Eksetaseis");
				System.out.println("2. Astheneis");
				System.out.println("3. Iatroi");
				System.out.println("4. Fakeloi");
				do
					l=sir.readPositiveInt(" ");
				while(l<0 || l>5);
				if(l==1)
				{
					N.printEksetaseis();
				}
				else if(l==2)
				{
					N.printPatients();
				}
				else if(l==3)
				{
					N.printIatroi();
				}
				else
				{
					N.printFakeloi();
				}
			}

			do {
				printMenu();
				k = sir.readPositiveInt("epelekse mia leitourgia apo 1-7\n");
			} while (k < 0 || k > 7);

		}
	}

	public static void printMenu() {
		System.out.println("1. Eisagwgi stoixeiwn nosokomeioy");
		System.out.println("2. Eisagwgi stoixeiwn iatrou");
		System.out.println("3. Eisagwgi stoixeiwn astheni");
		System.out.println("4. Eisagwgi stoixeiwn fakeloy nosileias asthenous");
		System.out.println("5. Eisagwgi eksetasis");
		System.out.println("6. Diagrafi astheni me vasi to AMKA");
		System.out.println("7. Ektypwsi");
	}
	
	
}
