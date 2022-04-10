import org.junit.Assert;
import org.junit.Test;

import com.ln.blog.main.Print;

/**
 * @author lining
 * @date 2022/4/10
 **/
public class JavaTest {

    @Test
    public void testSayHello() {
        Print print = new Print();
        String res = print.sayHello();
        Assert.assertTrue("Hello".equals(res));
    }
}
