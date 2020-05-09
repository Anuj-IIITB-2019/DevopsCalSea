
import org.junit.*;
public class CalCoolAteTest {


    private CalCoolAte calCoolAte;

    @Before
    public void setUp() {
        calCoolAte = new CalCoolAte();
    }

    @Test
    public void testAdd() {
        char ch = 'a';
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = calCoolAte.add(a, b);
        ch ='q';
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        char ch = 's';
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = calCoolAte.subtract(a, b);
        ch = 'q';
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void testMultiply() {
        char ch = 'm';
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = calCoolAte.multiply(a, b);
        ch ='q';
        Assert.assertEquals(expectedResult, result);
        ;
    }

    @Test
    public void testDivide() {
        char ch ='d';
        int a = 56;
        int b = 10;
        int expectedResult = 5;
        int result = calCoolAte.divide(a, b);
        ch ='q';
        Assert.assertEquals(expectedResult, result, 0.00005);
    }

}
