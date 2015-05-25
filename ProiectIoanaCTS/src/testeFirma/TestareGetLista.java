package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareGetLista {

	@Test
	public void testGetLista(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		Firma f= new Firma(listaA);
		assertEquals(listaA,f.getListaAngajati());
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
	

}
