package TokoABC;

public abstract class Produk {
    protected String namaProduk;
    protected String kodeProduk;

    public Produk(String namaProduk, String kodeProduk){
        this.namaProduk = namaProduk;
        this.kodeProduk = kodeProduk;
    }

    public String getNamaProduk(){
        return namaProduk;
    }

    abstract void tampilDataProduk();

    abstract void hitungDataProduk();
}
