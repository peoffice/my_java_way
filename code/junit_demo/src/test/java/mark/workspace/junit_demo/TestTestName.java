package mark.workspace.junit_demo;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.Description;
 
import static org.junit.Assert.assertEquals;
 
public class TestTestName
{
    @Rule
    public TestName testName = new TestName()
    {
        @Override
        public void starting(Description d)
        {
            System.out.println(
                    String.format("%s starting ...", d.getMethodName()));
            super.starting(d);
        }
    };
 
    @Test
    public void testMethodA()
    {
        System.out.println(
                String.format("%s running ...", testName.getMethodName()));
        assertEquals("testMethodA", testName.getMethodName());
    }
 
    @Test
    public void testMethodB()
    {
        System.out.println(
                String.format("%s running ...", testName.getMethodName()));
        assertEquals("testMethodB", testName.getMethodName());
    }
}

