package TokoABC;

public class ProdukTidakHabisPakai extends Produk{
    protected String [] merekPrinter;
    protected int [] stokPrinter;
    
    ProdukTidakHabisPakai(String namaProduk, String kodeProduk, String [] merekPrinter, int [] stokPrinter){
        super(namaProduk, kodeProduk);
        this.merekPrinter = merekPrinter;
        this.stokPrinter = stokPrinter;
    }

    @Override
    public void tampilDataProduk(){
        System.out.println("\nNama Produk : " + getNamaProduk());
        System.out.println("Merk Printer : " + String.join(", ", merekPrinter));
        System.out.print("Jumlah Stok : ");
        for (int i = 0; i < stokPrinter.length; i++){
            if (i > 0){
            System.out.print(", ");
            }
            System.out.print(stokPrinter[i]);
        }
        System.out.println();
    }

    @Override
    public void hitungDataProduk() {
        int total = 0;
        for (int stok : stokPrinter) {
            total += stok;
        }
        System.out.println("Total stok : " + total);

        int maxStok = 0;
        for (int stok : stokPrinter) {
            if (stok > maxStok) {
                maxStok = stok;
            }
        }
        System.out.println("Jumlah stok terbanyak : " + maxStok);
    }
}
