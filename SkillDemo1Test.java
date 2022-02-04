import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void testMultiply(){
        assertEquals(10, SkillDemo1.multiply(2, 9)); //Test will fail
    }
}
