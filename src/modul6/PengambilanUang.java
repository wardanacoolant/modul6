package modul6;

import perbankan.Tabungan;

public class PengambilanUang extends Tabungan
{
    public PengambilanUang(int Tabungan, int Proteksi)
    {
        this.Tabungan = Tabungan;
        this.Proteksi = Proteksi;
    }
    public Boolean ambilUang(int Ambil)
    {
        int bolehAmbil = Tabungan - Proteksi;
        if(Ambil > bolehAmbil)
        {
            this.Saldo = this.Tabungan;
            return false;
        }
        else
        {
            this.Saldo = this.Tabungan - Ambil;
            return true;
        }
    }
    int getSaldo()
    {
        return Saldo;
    }
}

