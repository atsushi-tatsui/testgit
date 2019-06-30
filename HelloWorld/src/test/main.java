package test;

public class main {
    public static void MainCalc(String[] args) {
    System.out.print("税込み金額出力");
    TaxSample ts = new TaxSample();
    ts.setTax(1000,1.08);

//    InputCheck sleInputCk = new InputCheck();

    }


}

class TaxSample{
    public void setTax(int m,double t) {
        System.out.println((int)(m * t));
    }
}