package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareCelMaiBinePlatit {

	@Test
	public void testCelMaiBinePlatit() {
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a=new Angajat("Popa","Dan", "1921009009988",5000,"fulltime","it");
		Angajat b=new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
		listaA.add(a);
		listaA.add(b);
		
		Firma f= new Firma(listaA);
		assertEquals(a,f.celMaiBinePlatit());
	}
	
	@Test
	public void testCMBPListaNula(){
		ArrayList<Angajat> listaA=null;
		try{
			Firma f=new Firma(listaA);
			System.out.println(f.celMaiBinePlatit());
			fail("lista e nula");
		}catch(NullPointerException ex){}
		
	}
	
	@Test
	public void testCMBPListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		try{
			Firma f=new Firma(listaA);
			System.out.println(f.celMaiBinePlatit());
			fail("lista e goala");
		}catch(EmptyStackException ex){}
	}

}
