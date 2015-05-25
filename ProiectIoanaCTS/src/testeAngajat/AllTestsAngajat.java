package testeAngajat;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testBonus.class, testComision.class, testImpozit.class })
public class AllTestsAngajat {

}
