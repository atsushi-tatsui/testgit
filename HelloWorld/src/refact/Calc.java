package refact;

public class Calc {
    public static void main(String[] args) {
        int year = 2018;
        int month = 4;
        int days = 30;

        days = MonthCheck.chkDays(year, month);
        System.out.println("その月の日数は" + days + "です！");
    }
}
