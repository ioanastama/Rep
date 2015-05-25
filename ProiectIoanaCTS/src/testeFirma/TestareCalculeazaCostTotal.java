package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareCalculeazaCostTotal {

	@Test
	public void testCalculeazaTotal(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a=new Angajat("Popa","Dan", "1921009009988",5000,"fulltime","it");
		
		listaA.add(a);
		
		float total=a.impozit()+a.comision()+a.getSalariu()+a.bonus();
		
		Firma f= new Firma(listaA);
		assertEquals(total,f.calculeazaPlatiTotale(),0);
	}
	
	@Test
	public void calculeazaTotalListaNula(){
		ArrayList<Angajat> listaA = null;
		Firma f=new Firma(listaA);
		try{
			System.out.println(f.calculeazaPlatiTotale());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void calculeazaImpozitListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Firma f= new Firma(listaA);
		assertEquals(0, f.calculeazaPlatiTotale(),0);
	}
	

}
