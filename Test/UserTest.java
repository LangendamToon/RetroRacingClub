import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user = new User("Toon","t.langendam@gmail.com","kiwi2000","ADMIN");

    @Test
    public void getName() {
        Assert.assertEquals("Toon",user.getName());
    }

    @Test
    public void getEmail() {
        Assert.assertEquals("t.langendam@gmail.com",user.getEmail());
    }

    @Test
    public void getPassword() {
        Assert.assertEquals("kiwi2000",user.getPassword());
    }

    @Test
    public void getRole() {
        Assert.assertEquals("ADMIN",user.getRole());
    }
}