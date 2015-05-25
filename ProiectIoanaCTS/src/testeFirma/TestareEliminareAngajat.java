package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareEliminareAngajat {

	@Test
	public void eliminaAngajatExistent(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a= new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it");
		listaA.add(a);
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		Firma f=new Firma(listaA);
		int i= f.getListaAngajati().size();
		int rez=i-1;
		f.eliminaAngajat(a);
		int rez2=f.getListaAngajati().size();
		assertEquals(rez,rez2);
		
	}
	
	@Test
	
	public void eliminaAngajatNull(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a=null;
		listaA.add(a);
		try{
			Firma f=new Firma(listaA);
			f.eliminaAngajat(a);
			fail("angajatul e null");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void eliminaAngajatListaNula(){
		ArrayList<Angajat> listaA=null;
		try{
			Firma f=new Firma(listaA);
			Angajat a=new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
			f.eliminaAngajat(a);
			fail("lista e nula");
		}
		catch(NullPointerException ex){
			
		}
	}
	
	@Test
	public void eliminaAngajatListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		try{
			Firma f=new Firma(listaA);
		    Angajat a=new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
		    f.eliminaAngajat(a);
			fail("lista goala");
			
		}
		catch(EmptyStackException ex){}
		
		
	}
	

}
