import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class testMethod {
    @Test
    public void test1(){
        assertEquals(method.product(1,2), 3);
    }
}
