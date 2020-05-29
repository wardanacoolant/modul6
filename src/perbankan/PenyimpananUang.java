package perbankan;

public class PenyimpananUang {
    private double tingkatBunga;
    public PenyimpananUang(int saldo, double tingkatBunga) {
        this.saldo = saldo;
    }

    public double cekUang() {
        return saldo;
    }
    
}
