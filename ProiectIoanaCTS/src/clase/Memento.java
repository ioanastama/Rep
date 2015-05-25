package clase;

public class Memento {

	private Angajat angajat;

	public Memento(Angajat a) {
		angajat = new Angajat(a.getNume(), a.getPrenume(), a.getCnp(),
				a.getSalariu(), a.getStatus(), a.getDepartament());
	}

	public Angajat getAngajat() {
		return angajat;
	}

}
