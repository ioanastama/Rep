package testeFirma;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestareCalculeazaComision.class,
		TestareCalculeazaCostTotal.class, TestareCalculeazaImpozit.class,
		TestareCelMaiBinePlatit.class, TestareCitireFisier.class,
		TestareCostSalarial.class, TestareEliminareAngajat.class,
		TestareFirmaCreare.class, TestareGetAngajat.class,
		TestareGetLista.class, TestareModificaSalariu.class,
		TestFirmaAdaugareAngajat.class, testNrAngajati.class,
		testNrBarbati.class, testNrFemei.class })
public class AllTestsFirma {

}
