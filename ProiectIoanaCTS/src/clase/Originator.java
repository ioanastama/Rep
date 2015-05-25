package clase;

public class Originator {
	
	
	
	public Memento saveToMemento(Angajat a) {
		return new Memento(a);
	}

	public Angajat restoreMemento(Memento m) {
		return m.getAngajat();
	}
}
