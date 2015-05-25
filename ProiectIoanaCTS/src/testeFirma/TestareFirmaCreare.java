package testeFirma;



import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;


public class TestareFirmaCreare {

	//Testam metoda de creare a listei firmei dintr-o alta lista
	@Test
	public void testareFirma() {

		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		Firma f= new Firma(listaA);
		assertEquals(listaA,f.getListaAngajati());

	}
	
	@Test
	public void testareFirmaNotNull() {
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		Firma f= new Firma(listaA);
		assertNotNull(f.getListaAngajati());

	}

	@Test
	public void testFirmaNull() {
		ArrayList<Angajat> listaA = null;
		Firma f= new Firma(listaA);
		try {

			
			System.out.println(f.getListaAngajati());
			fail("trebuia o exceptie");

		} catch (NullPointerException ex) {
			System.out.println("  ");
		}
		

	}
	
	//testarea setarii unei liste de angajati
	@Test
	public void testSetare(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		Firma f= Firma.getInstance();
		f.setListaAngajati(listaA);
		assertEquals(listaA,f.getListaAngajati());
		
	}
	
	@Test
	public void testareSetareNotNull() {
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		Firma f= Firma.getInstance();
		f.setListaAngajati(listaA);
		assertNotNull(f.getListaAngajati());

	}
	
	@Test
	public void testSetareNull() {
		ArrayList<Angajat> listaA = null;
		Firma f= Firma.getInstance();
		try {
			f.setListaAngajati(listaA);
			
			System.out.println(f.getListaAngajati());
			fail("trebuia o exceptie");

		} catch (NullPointerException ex) {
			System.out.println("  ");
		}
		

	}
	
	
	
		
	}
	
	


