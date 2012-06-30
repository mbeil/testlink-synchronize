package de.eimb.testlink.citrus;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.consol.citrus.testng.AbstractTestNGCitrusTest;

/**
 * &lt;p&gt;Um sicher zu stellen das die Anbindung an TestLink funktioniert, m&amp;uuml;ssen die Daten gelesen werden. Hierzu soll das Programm TestLinkInfo verwendet werden. Dieses wird mit der URL&amp;nbsp;und dem development key gestartet.&lt;/p&gt;
 *
 * @author Matthias Beil
 * @since 2012-06-30
 */
public class CTL1V2 extends AbstractTestNGCitrusTest {
    @Test
    public void cTL1V2(ITestContext testContext) {
        executeTest(testContext);
    }
}
