package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class testNrFemei {

	@Test
	public void testareNrFemei() {
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dana", "2921009009988",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		Firma f= new Firma(listaA);
		assertEquals(1,f.numarFemei());
		
	}
	
	@Test
	public void testareNrFemeiListaNull(){
		ArrayList<Angajat> listaA=null;
		try{
			Firma f=new Firma(listaA);
			System.out.println(f.numarFemei());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareNrFemeiListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Firma f= new Firma(listaA);
		assertEquals(0,f.numarFemei());
	}
}
