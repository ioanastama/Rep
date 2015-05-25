package clase;

import interfete.IAdaptat;

public class AngajatAdaptat implements IAdaptat{
	public Angajat angajat;
	
	public AngajatAdaptat(Angajat a){
		this.angajat=a;
		
	}
	public void incaseazaBani(){
		System.out.println(angajat.bonus()+angajat.getSalariu());
	}
	
	public void calculeazaContributii(){
		System.out.println(angajat.impozit());
		
	}

}
