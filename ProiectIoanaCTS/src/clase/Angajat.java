package clase;

public class Angajat {
	private String nume;
	private String prenume;
	private String cnp;
	private int salariul;
	private String status;
	private String departament;

	public Angajat() {
		/*
		 * this.nume = "Anonim"; this.prenume = "Anonim"; this.cnp =
		 * "0000000000000"; this.salariul=100; this.status="FullTime";
		 * this.functie="Conducere";
		 */
		this.salariul = 100;

	}

	public Angajat(String num, String pre, String cnp, int salariul,
			String status, String dep) {
		this.nume = num;
		this.prenume = pre;

		this.cnp = cnp;
		this.salariul = salariul;
		this.status = status;
		this.departament = dep;
	}

	public String getNume() {
		return this.nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public String getCnp() {
		return this.cnp;
	}

	public int getSalariu() {
		return this.salariul;
	}

	public String getStatus() {
		return this.status;
	}

	public String getDepartament() {
		return this.departament;
	}
	
	public void setNume(String n){
		this.nume=n;
	}
	
	public void setPrenume(String p){
		this.prenume=p;
	}
	
	public void setCNP(String c){
		
		if (c.length() == 13) {
			switch (c.charAt(0)) {
			case '1':
				cnp = c;
			case '2':
				cnp = c;
			case '3':
				cnp = c;
			case '4':
				cnp = c;
			case '5':
				cnp = c;
			case '6':
				cnp = c;
			case '7':
				cnp = c;
			case '8':
				cnp = c;
			}

			
		} else System.out.println("nu a fost introdus un cnp corect");
		
	}
	
	public void setSalariul(int s){
		this.salariul=s;
	}
	
	public void setDepartament(String dep){
		this.departament=dep;
	}
	
	public void setStatus(String st){
		this.status=st;
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else {
			if (o instanceof Angajat) {
				Angajat a = (Angajat) o;
				return this.cnp.equals(a.cnp);
			} else {
				return false;
			}
		}

	}

	public String toString() {

		return this.nume + " " + this.prenume + " " + this.cnp + " "
				+ this.salariul + " ";

	}

	// calcularea bonusului unui angajat
	public float bonus() {
		float bonus = 0;

		if (status.equalsIgnoreCase("FullTime")) {
			bonus = (float) (salariul * 0.2);
			return bonus;
		} else {
			if (status.equalsIgnoreCase("PartTime")) {
				bonus = (float) (salariul * 0.1);
				return bonus;

			} else {

				bonus = (float) (salariul * 0.05);
				return bonus;
			}

		}

	}

	// calcularea impozitului in care vom presupune niste valori aleatoare ale
	// impozitului
	public float impozit() {
		float impozit = 0;
		if (departament.equalsIgnoreCase("IT")) {

			impozit = (float) (salariul * 0.07);
		} else {
			impozit = (float) (salariul * 0.2);
		}

		return impozit;
	}
	
	//calcularea comisionului celor din vanzari
	public float comision(){
		float comision=0;
		if(departament.equalsIgnoreCase("vanzari")){
			comision=(float) (salariul*0.15);
			return comision;
		}
		else{
			return 0;
		}
		
		
	}
	

}
