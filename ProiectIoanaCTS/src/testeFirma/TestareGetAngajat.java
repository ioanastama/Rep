package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareGetAngajat {

	@Test
	public void testGetAngajatNotNull(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it"));
		Angajat a= new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
		listaA.add(a);
		Firma f= new Firma(listaA);
		assertEquals(a,f.getAngajat(a));
		
	}
	
	@Test
	public void testAngajatInexistent(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it"));
		Angajat a= new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
		Firma f= new Firma(listaA);
		assertNull(f.getAngajat(a));
	}
	
	@Test
	public void getCuListaNula(){
		ArrayList<Angajat> listaA=null;
		try{
			Firma f=new Firma(listaA);
			f.getAngajat(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
			fail("e null");
		}
		catch(NullPointerException ex){
			
		}
	}
	
	@Test
	public void getCuListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		try{
			Firma f=new Firma(listaA);
			f.getAngajat(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
			fail("lista goala");
			
		}
		catch(EmptyStackException ex){}
		}
	
	@Test
	public void getAngajatNull(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a= new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it");
		Angajat b=null;
		listaA.add(a);
		listaA.add(b);
		try{
			Firma f=new Firma(listaA);
			f.getAngajat(b);
		}
		catch(NullPointerException ex){}
		
	}
		
	}


