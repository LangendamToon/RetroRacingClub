import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginCheckTest {

    @Test
    public void check() {
        LoginCheck loginCheck1 = new LoginCheck("john@doe.nl",false,false);
        LoginCheck loginCheck2 = new LoginCheck("john@doe.nl",true,false);
        LoginCheck loginCheck3 = new LoginCheck("john@doe.nl",false,true);
        Assert.assertFalse(loginCheck1.check("john@doe.nl"));
        Assert.assertTrue(loginCheck1.check("john@do.nl"));
        Assert.assertTrue(loginCheck2.check("john@doe.nl"));
        Assert.assertTrue(loginCheck3.check("john@doe.nl"));
    }
}