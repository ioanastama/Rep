package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareCalculeazaImpozit {

	@Test
	public void calculeazaImpozit(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a=new Angajat("Popa","Dan", "1921009009988",5000,"fulltime","it");
		Angajat b=new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
		listaA.add(a);
		listaA.add(b);
		float imp=a.impozit()+b.impozit();
		
		Firma f= new Firma(listaA);
		assertEquals(imp,f.calculeazaImpozit(),0);
	}
	
	@Test
	public void calculeazaImpozitListaNula(){
		ArrayList<Angajat> listaA = null;
		Firma f=new Firma(listaA);
		try{
			System.out.println(f.calculeazaImpozit());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void calculeazaImpozitListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Firma f= new Firma(listaA);
		assertEquals(0, f.calculeazaImpozit(),0);
	}
}
