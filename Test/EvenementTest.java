import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenementTest {

    @Test
    public void getTotalePrijs() {
        Assert.assertEquals(0,Evenement.getTotalePrijs(1,true,26,48),0.001);
        Assert.assertEquals(0,Evenement.getTotalePrijs(1,false,12,6),0.001);
        Assert.assertEquals(19.875,Evenement.getTotalePrijs(10,true,12,6),0.001);
        Assert.assertEquals(19.5,Evenement.getTotalePrijs(10,false,26,48),0.001);
        Assert.assertEquals(31.25,Evenement.getTotalePrijs(32,true,12,48),0.001);
        Assert.assertEquals(38.75,Evenement.getTotalePrijs(32,false,26,6),0.001);
    }
}