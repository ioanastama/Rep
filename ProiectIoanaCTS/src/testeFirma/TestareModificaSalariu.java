package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareModificaSalariu {

	@Test
	public void testModificareSalAngajat(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a= new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it");
		listaA.add(a);
		Firma f=new Firma(listaA);
		f.modificaSalariu(a, 7000);
		assertEquals(7000,f.getAngajat(a).getSalariu());
		
		
		
	}
	
	
	@Test
	public void testModificaSalAngajatNull(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat a= null;
		Angajat b=new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it");
		listaA.add(a);
		listaA.add(b);
		try{
			Firma f=new Firma(listaA);
			f.modificaSalariu(a, 9000);
			fail("angajatul e null");
			
		}
		catch(NullPointerException ex){
			
		}
		
	}
	
	@Test
	public void testModificaListaNula(){
		ArrayList<Angajat> listaA=null;
		Angajat b=new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it");
		try{
			Firma f=new Firma(listaA);
			f.modificaSalariu(b, 5900);
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void testModificareListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Angajat b=new Angajat("Popa","Dan", "1921009009988",4500,"fulltime","it");
		try{
			Firma f=new Firma(listaA);
			f.modificaSalariu(b, 9089);
		}
		catch(EmptyStackException ex){}
		
		
	}
	

}
