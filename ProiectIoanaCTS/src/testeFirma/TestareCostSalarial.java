package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareCostSalarial {

	
	@Test
	public void testCalculezaCostSalarial() {
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a=new Angajat("Popa","Dan", "1921009009988",5000,"fulltime","it");
	    listaA.add(a);
	    float bonus=(float) (a.getSalariu() * 0.2);
	    float cost=bonus+a.getSalariu();
	    
	  Firma f=new Firma(listaA);
	  double d=f.costSalarial();
	  assertEquals(cost,d,0);
	  
	
	}
	
	@Test
	public void testCalculeazaCostSalarialListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Firma f=new Firma(listaA);
		assertEquals(0,f.costSalarial(),0); 
		
	}
	
	@Test
	public void testCalculeazaCostSalarialListaNula(){
		ArrayList<Angajat> listaA = null;
		Firma f=new Firma(listaA);
		try{
			System.out.println(f.costSalarial());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

}
