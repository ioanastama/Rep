package testeAngajat;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Angajat;

public class testImpozit {

	@Test
	public void testImpozitIT() {
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","IT");
		float imp=(float) (0.07*9087);
		assertEquals(imp,a.impozit(),0);
	}
	
	@Test
	public void testComisionAltceva(){
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","HR");
		float imp=(float) (0.2*9087);
		assertEquals(imp,a.impozit(),0);
	}
	
	@Test
	public void testComisionGeneral(){
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","Vanzari");
		float imp=0;
		if (a.getDepartament().equalsIgnoreCase("IT")) {

			imp = (float) (a.getSalariu() * 0.07);
		} else {
			imp = (float) (a.getSalariu() * 0.2);
		}

		
		
		assertEquals(imp,a.impozit(),0);
	}

}
