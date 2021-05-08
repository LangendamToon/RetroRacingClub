import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TagTest {

    @Test
    public void giveTag() {
        Integer int0 = 0;
        Integer int1 = 1;
        Integer int11 = 11;
        Integer int12 = 12;
        Integer int13 = 13;
        Integer int47 = 47;
        Integer int48 = 48;
        Integer int49 = 49;

        Assert.assertEquals("Amateur", new Tag (int0).giveTag());
        Assert.assertEquals("Amateur", new Tag (int1).giveTag());
        Assert.assertEquals("Amateur", new Tag (int11).giveTag());
        Assert.assertEquals("Hobbyist", new Tag (int12).giveTag());
        Assert.assertEquals("Hobbyist", new Tag (int13).giveTag());
        Assert.assertEquals("Hobbyist", new Tag (int47).giveTag());
        Assert.assertEquals("Professional", new Tag (int48).giveTag());
        Assert.assertEquals("Professional", new Tag (int49).giveTag());
    }
}