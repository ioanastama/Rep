package testeFirma;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class testNrAngajati {

	@Test
	public void testNrSal(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",5500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Mihai", "1293849327455",8000,"fulltime","it"));
		listaA.add(new Angajat("Caramihai","Mihaela", "2933849327455",4000,"fulltime","it"));
		listaA.add(new Angajat("Calagiu","Teodora", "2293849327455",3800,"fulltime","it"));
		Firma f= new Firma(listaA);
		assertEquals(3,f.numarSalariati(4500));
	}
	

	@Test
	public void testareNrAngListaNull(){
		ArrayList<Angajat> listaA=null;
		try{
			Firma f=new Firma(listaA);
			System.out.println(f.numarSalariati(4000));
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareNrAngListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Firma f= new Firma(listaA);
		assertEquals(0,f.numarSalariati(6000));
	}
	
	@Test
	public void testNrAng(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		listaA.add(new Angajat("Popa","Dan", "1921009009988",5500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Ion", "3293849327455",4500,"fulltime","it"));
		listaA.add(new Angajat("Popa","Mihai", "1293849327455",8000,"fulltime","it"));
		listaA.add(new Angajat("Caramihai","Mihaela", "2933849327455",4000,"fulltime","it"));
		listaA.add(new Angajat("Calagiu","Teodora", "2293849327455",3800,"fulltime","it"));
		Firma f= new Firma(listaA);
		assertEquals(0,f.numarSalariati(9500));
	}
}
