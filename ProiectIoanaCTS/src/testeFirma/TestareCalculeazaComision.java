package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareCalculeazaComision {

	@Test
	public void calculeazaComision(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a=new Angajat("Popa","Dan", "1921009009988",5000,"fulltime","vanzari");
		Angajat b=new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
		listaA.add(a);
		listaA.add(b);
		float com=a.comision()+b.comision();
		
		Firma f= new Firma(listaA);
		assertEquals(com,f.calculeazaComision(),0);
	}
	
	@Test
	public void calculeazaComisionListaNula(){
		ArrayList<Angajat> listaA = null;
		Firma f=new Firma(listaA);
		try{
			System.out.println(f.calculeazaComision());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void calculeazaComisionListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Firma f= new Firma(listaA);
		assertEquals(0, f.calculeazaComision(),0);
	}
}
