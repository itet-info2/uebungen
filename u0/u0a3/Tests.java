package u0a3;

import org.junit.Test;
import junit.framework.Assert;

public class Tests {
    @Test public void negative() {
        Assert.assertEquals(-1, Signum.signum(-3));
    }

    @Test public void zero() {
        Assert.assertEquals(0, Signum.signum(0));
    }

    @Test public void positive() {
        Assert.assertEquals(1, Signum.signum(7));
    }
}
