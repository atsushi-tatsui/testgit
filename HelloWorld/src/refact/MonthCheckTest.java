package refact;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthCheckTest {

    @Test
    public void testStr() {
        MonthCheck Mc = new MonthCheck();
        assertEquals("文字列が一致しません", "OK", Mc.str("xyz"));
    }

    @Test
    public void testtax() {
        MonthCheck Mc = new MonthCheck();
        assertEquals("誤差が許容範囲ではありません",1058, Mc.tax(980),0.3);
    }
}
