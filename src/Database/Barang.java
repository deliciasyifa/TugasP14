package Database;

public class Barang implements Penjualan  {
    public Integer noFaktur;
    public String namaBarang;
    public Integer hargaBarang;
    public Integer jumlah;
    public Integer subTotal;
    public Integer discount;
    public Integer totalHarga; 
    public String Kasir;


    public void Kasir()
    {
        Kasir = "LALALA";
    }
    
    public void noFaktur() {
        noFaktur = 2011522027;
    }
    
    public void namaBarang() {
        namaBarang = "Minyak Kayu Putih";
    }
    
    public void hargaBarang() {  
        hargaBarang = 20000;
    }

    public void jumlah() {
        jumlah = 5;
    }

    public void subTotal() {
        subTotal = null;
    }
 
    public void discount() {
        discount = null;
    }
 
    public void totalHarga() {
        totalHarga = null;
    }
    
   
}
