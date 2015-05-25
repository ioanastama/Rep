package testeFirma;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestFirmaAdaugareAngajat {

	//adaugarea unui angajat
		@Test
		public void testAdaugaAngajatInexistent() {
			Firma f=Firma.getInstance();
			Angajat a= new Angajat("Popa","Ionut", "2901010998890",4500,"fulltime","it");
			f.adaugaAngajat(a);
			assertEquals(a,f.getAngajat(a));
			
		}
		
	/*	@Test
		public void testAdaugareAngajatExistent(){
			Firma f=Firma.getInstance();
			Angajat a= new Angajat("Dorin","Ion", "3293849927455",4500,"fulltime","it");
			f.adaugaAngajat(a);
			f.adaugaAngajat(a);
					
			}*/
		
		@Test
		public void testAdaugareAngajatNull(){
			Firma f=Firma.getInstance();
			Angajat a=null;
			try{
				f.adaugaAngajat(a);
			}
			catch(NullPointerException ex){
				
			}
		}
}
