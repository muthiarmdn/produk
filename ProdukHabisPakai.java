package TokoABC;

public class ProdukHabisPakai extends Produk{
    private String [] merekKertas;
    private int [] jumlahKertas;
    
    ProdukHabisPakai(String namaProduk, String kodeProduk, String [] merekKertas, int [] jumlahKertas){
        super(namaProduk, kodeProduk);
        this.merekKertas = merekKertas;
        this.jumlahKertas = jumlahKertas;
    }

    @Override
    public void tampilDataProduk(){
        System.out.println("Nama Produk : " + getNamaProduk());
        System.out.println("Merk Kertas : " + String.join(", ", merekKertas));
        System.out.print("Jumlah Ketersedian Kertas dengan " + merekKertas.length + " macam merek : ");
        for (int i = 0; i < jumlahKertas.length; i++) {
            if (i > 0){
            System.out.print(", ");
            }
            System.out.print(jumlahKertas[i]);
        }
        System.out.println();
    }

    @Override
    public void hitungDataProduk() {
        int total = 0;
        for (int ketersediaan : jumlahKertas) {
            total += ketersediaan;
        }
        System.out.println("Total Kertas semua merek : " + total + " kertas rim");

        int min = jumlahKertas[0];
        for (int ketersediaan : jumlahKertas){
            if (ketersediaan < min) {
                min=ketersediaan;
            }
        }
        System.out.println("Jumlah ketersediaan kertas sedikit : " + min);
    }
}
