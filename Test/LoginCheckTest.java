import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginCheckTest {

    @Test
    public void check() {
        LoginCheck loginCheck = new LoginCheck("john@doe.nl",false,false);
        Assert.assertFalse(loginCheck.check("john@doe.nl"));
    }
}