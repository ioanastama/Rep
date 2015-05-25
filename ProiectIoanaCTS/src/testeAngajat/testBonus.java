package testeAngajat;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Angajat;

public class testBonus {

	@Test
	public void testBonusGeneral() {
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","Vanzari");
	
		float bonus = 0;

		if (a.getStatus().equalsIgnoreCase("FullTime")) {
			bonus = (float) (a.getSalariu() * 0.2);
			
		} else {
			if (a.getStatus().equalsIgnoreCase("PartTime")) {
				bonus = (float) (a.getSalariu() * 0.1);
				

			} else {

				bonus = (float) (a.getSalariu() * 0.05);
				
			}

	}

		assertEquals(bonus,a.bonus(),0);
}
	
	@Test
	public void testBonusFull(){
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","Vanzari");
		
		float bonus = (float) (a.getSalariu() * 0.2);
		assertEquals(bonus,a.bonus(),0);
	}
	
	@Test
	public void testBonusPart(){
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"partTime","Vanzari");
		
		float bonus = (float) (a.getSalariu() * 0.1);
		assertEquals(bonus,a.bonus(),0);
	}
	
	@Test
	public void testBonusAltcveva(){
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"Internship","Vanzari");
		
		float bonus = (float) (a.getSalariu() * 0.05);
		assertEquals(bonus,a.bonus(),0);
	}
}
