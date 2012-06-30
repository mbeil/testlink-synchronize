package de.eimb.testlink.citrus;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.consol.citrus.testng.AbstractTestNGCitrusTest;

/**
 * &lt;p&gt;Dieser Testfall dient dazu, das er nie durchgeht. D.h. das Ergebniss muss immer negativ sein, damit dieser Testfall als ok markiert werden kann.&lt;/p&gt;
 *
 * @author Matthias Beil
 * @since 2012-06-30
 */
public class CTL3V1 extends AbstractTestNGCitrusTest {
    @Test
    public void cTL3V1(ITestContext testContext) {
        executeTest(testContext);
    }
}
