package testeAngajat;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Angajat;

public class testComision {

	@Test
	public void testComisionVanzari() {
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","Vanzari");
		float com=(float) (0.15*9087);
		assertEquals(com,a.comision(),0);
	}
	
	@Test
	public void testComisionAltceva(){
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","IT");
		
		assertEquals(0,a.comision(),0);
	}
	
	@Test
	public void testComisionGeneral(){
		Angajat a=new Angajat("Ion","Dana","2901019990089",9087,"FullTime","Vanzari");
		float comision=0;
		if(a.getDepartament().equalsIgnoreCase("vanzari")){
			comision=(float) (a.getSalariu()*0.15);
			
		}
		else{
			comision= 0;
		}
		
		assertEquals(comision,a.comision(),0);
	}
	
	

}
