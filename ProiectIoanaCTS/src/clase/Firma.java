package clase;

import interfete.AscultatoriAngajati;
import interfete.SubiectAngajati;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.EmptyStackException;





public class Firma implements SubiectAngajati {

	private ArrayList<Angajat> lista = new ArrayList<Angajat>();
	private ArrayList<AscultatoriAngajati> ascultatori = new ArrayList<AscultatoriAngajati>();

	CareTaker c = new CareTaker();
	private static Firma singleton = null;

	public static Firma getInstance() {
		if (singleton == null) {
			singleton = new Firma();
		}
		return singleton;
	}

	private Firma() {
	}

	// Crearea unei firme cu angajati
	public Firma(ArrayList<Angajat> listaNoua) {
		if (listaNoua != null) {
			lista = new ArrayList<Angajat>();
			for (int i = 0; i < listaNoua.size(); i++)
				lista.add(listaNoua.get(i));
			anuntaAscultatori();
		} else
			lista = null;
	}

	// Toti angajatii din firma
	public ArrayList<Angajat> getListaAngajati() {
		if (lista != null) {
			return lista;
		} else
			throw new NullPointerException();
	}

	// Setarea unei liste de angajati
	public void setListaAngajati(ArrayList<Angajat> list) {
		if (list != null) {
			lista = list;
			anuntaAscultatori();
		} else
			throw new NullPointerException();

	}

	// returnarea unui angajat
	public Angajat getAngajat(Angajat a) {
		int index = 0;
		
		if (lista != null) {
			if (lista.size() != 0) {
				if (a != null) {
					index = lista.indexOf(a);
					if (index != -1) {
						return lista.get(index);
					} else {
						return null;
					}
				} else
					throw new NullPointerException();
			} else {
				throw new EmptyStackException();
			}
		} else
			throw new NullPointerException();

	}

	// adaugarea unui angajat
	public void adaugaAngajat(Angajat a) {
		int k = 0;
		if (a != null) {
			for (int i = 0; i < lista.size(); i++) {
				if (a.equals(lista.get(i))) {
					k++;
				}
			}
			if (k == 0) {
				lista.add(a);
				anuntaAscultatori();
			} else

				System.out
						.println("angajatul exista deja. Nu s-a adaugat nimic.");

		}

		else
			throw new NullPointerException();

	}

	// eliminarea unui angajat
	public void eliminaAngajat(Angajat a) {
		int k = 0;
		if (lista != null) {
			if (lista.size() != 0) {
				if (a != null) {
					for (Angajat a1 : lista) {
						if (a.equals(a1)) {
							k++;
						}

					}
					if (k != 0) {
						lista.remove(a);
						anuntaAscultatori();
					} else
						System.out
								.println("nu exista nagajatul. Lista nu a suferit nicio modificare");
				} else
					throw new NullPointerException();
			} else
				throw new EmptyStackException();
		} else
			throw new NullPointerException();
	}

	
	// calcularea angajatului cu salariul cel mai mare
	public Angajat celMaiBinePlatit() {
		int sal = 0;
		int index = 0;
		if (lista != null) {
			if(lista.size()!=0){
			for (int i = 0; i < lista.size(); i++) {
				if (sal < lista.get(i).getSalariu()) {
					sal = lista.get(i).getSalariu();
					index = i;

				}

			}
			return lista.get(index);

		}
			else throw new EmptyStackException();
			}

		else
			throw new NullPointerException();

	}

	// calcularea costului slaraial al firmei in care se include si bonusul
	// angajatului
	public float costSalarial() {
		float cost = 0;
		if (lista != null) {
			if (lista.size() != 0) {
				for (int i = 0; i < lista.size(); i++) {
					cost = cost + lista.get(i).bonus()
							+ lista.get(i).getSalariu();

				}
				return cost;

			} else {
				return 0;
			}

		}

		else
			throw new NullPointerException();

	}

	// calculeaza impozitul platiti de firma

	public float calculeazaImpozit() {
		float impozit = 0;
		if (lista != null) {
			if (lista.size() != 0) {
				for (int i = 0; i < lista.size(); i++) {
					impozit = impozit + lista.get(i).impozit();

				}
				return impozit;
			} else {
				return 0;
			}

		}

		else
			throw new NullPointerException();

	}

	// calculeaza comisionul
	public float calculeazaComision() {
		float com = 0;
		if (lista != null) {
			if (lista.size() != 0) {
				for (int i = 0; i < lista.size(); i++) {
					com = com + lista.get(i).comision();
				}
				return com;
			} else {
				return 0;
			}
		} else
			throw new NullPointerException();
	}

	// calculeaza plati totale
	public float calculeazaPlatiTotale() {
		float plati = 0;
		if(lista!=null){
			if(lista.size()!=0){
		plati = this.costSalarial() + this.calculeazaImpozit()
				+ this.calculeazaComision();
		return plati;}
			else return 0;}
		else
			throw new NullPointerException();

	}

	// afisarea tutror angajatilor din firma
	public void afiseazaAngajati() {
		if (lista != null) {
			if (lista.size() != 0) {
				for (Angajat a : lista) {
					System.out.println(a);
				}

			} else {
				System.out.println("Nu exista angajati in firma");
			}

		} else
			throw new NullPointerException();

	}

	// modifica salariu angajat
	public void modificaSalariu(Angajat a, int s)  {
		
		int k=0;
		if(lista!=null){
			if(lista.size()!=0){
		if (a != null) {
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).equals(a)) {
					
					k++;
				}	
				}
			if(k!=0){
				Originator o=new Originator();
				Memento m=o.saveToMemento(a);
				c.adaugaMemento(m);
				a.setSalariul(s);
				anuntaAscultatori();
			}
			
			else System.out.println("angajatul nu exista");
		}
		

		else
			throw new NullPointerException();

	}
			else throw new EmptyStackException();
			}

		else
			throw new NullPointerException();
		}

	// afisarea schimbarilo din firma
	public void afiseazaAngajatiModificati() {

		for (int i = 0; i < c.mementos.size(); i++) {
			System.out.println(c.getMemento(i).getAngajat());
		}
	}
	
	//citire angajat din fisier
	public void citireAngDinFisier(){
		FileReader fi;
        BufferedReader in = null;
        try {
            fi = new FileReader("angajat.txt");
            in = new BufferedReader(fi);
            String linie=in.readLine();
            while (linie!= null)  {
                String[] elemente = linie.split(",");
                if(elemente.length!=6){
                    throw new Exception("Linie invalida!");
                }
                Angajat a = new Angajat();
                a.setNume(elemente[0]);
                a.setPrenume(elemente[1]);
                a.setCNP(elemente[2]);
                a.setSalariul(Integer.parseInt(elemente[3].trim()));
                a.setStatus(elemente[4]);
                a.setDepartament(elemente[5]);;
                
                linie = in.readLine();
                                
               lista.add(a);
            }
        } catch (Exception ex) {
           
        } finally {
            try {
                in.close();
            } catch (Exception ex) {
            }
        }
	}

	@Override
	public void adaugaAscultator(AscultatoriAngajati ascult) {
		// TODO Auto-generated method stub
		ascultatori.add(ascult);

	}

	@Override
	public void anuntaAscultatori() {
		// TODO Auto-generated method stub
		for (AscultatoriAngajati ascult : ascultatori) {
			ascult.modificareListaAngajati();
		}

	}
	
	//afisarea numarului de femei din firma
	public int numarFemei(){
		int nr=0;
		if(lista!=null){
			if(lista.size()!=0){
				for(Angajat a:lista){
					String n=a.getCnp();
					if(n.charAt(0)=='2' || n.charAt(0)=='4' || n.charAt(0)=='6' || n.charAt(0)=='8' ){
						nr=nr+1;
					}
				}
				return nr;
			}
			else return 0;
		}
		else throw new NullPointerException();
	}
	
	// afisare numar barbati din firma
	public int numarBarbati(){
		int nr=0;
		if(lista!=null){
			if(lista.size()!=0){
				for(Angajat a:lista){
					String n=a.getCnp();
					if(n.charAt(0)=='1' || n.charAt(0)=='3' || n.charAt(0)=='5' || n.charAt(0)=='7' ){
						nr=nr+1;
					}
				}
				return nr;
			}
			else return 0;
		}
		else throw new NullPointerException();
	}
	
	//afisare numar salariat cu salariul mai mare sau egal decat un salariu dat
	
	public int numarSalariati(int s){
		int nr=0;
		if(lista!=null){
			if(lista.size()!=0){
				for(Angajat a:lista){
					if(a.getSalariu()>=s){
						nr=nr+1;
					}
				}
				return nr;
			}
			else return 0;
		}
		else throw new NullPointerException();
	}
}
