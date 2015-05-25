package clase;



public class Main {

	public static void main(String[] args) {
		Firma f= Firma.getInstance();
		Angajat a=new Angajat("Popa","Ioana", "2931012440080", 4500, "FullTime", "IT");
		Angajat a1=new Angajat("Coco","Eduard", "1931012440080", 5000, "FullTime", "FR");
		// Angajat a2=new Angajat("lala","lala","123456789101",2023,"FullTime","HR");
		System.out.println(a.bonus());
		System.out.println(a.impozit());
		f.adaugaAngajat(a1);
		f.adaugaAngajat(a);
		f.adaugaAngajat(a);
		f.afiseazaAngajati();
		System.out.println(f.celMaiBinePlatit());
		System.out.println(f.costSalarial());
		System.out.println(f.calculeazaImpozit());
		System.out.println(f.calculeazaPlatiTotale());
		f.modificaSalariu(a1, 6000);
		f.afiseazaAngajati();
		System.out.println(f.celMaiBinePlatit());
		System.out.println(f.costSalarial());
		System.out.println(f.calculeazaImpozit());
		System.out.println(f.calculeazaPlatiTotale());
		f.afiseazaAngajatiModificati();
		
		
		String c="1900909990090";
		System.out.println(c.length());
		f.citireAngDinFisier();
		f.afiseazaAngajati();
		

	}

}
