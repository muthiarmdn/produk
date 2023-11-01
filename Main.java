package TokoABC;

public class Main {
    public static void main(String[] args) {
        //Produk Habis Pakai (ATK)
        String [] merekKertas = {"Kertas HVS A4 sidu 70 gsm","Kertas HVS Ekon 75 gsm","Kertas HVS Paper One 75 gsm",
                                 "Kertas HVS Natural 70 gsm","Kertas HVS PPLite 75 gsm","Kertas HVS PPLite 80 gsm",
                                 "Bola Dunia Kertas HVS 80 gsm","Bola Dunia Kertas HVS 75 gsm","Kertas Hvs Copy Paper 70 gsm",
                                 "Kertas Hvs CopyPaper 80 gsm"};
        int [] jumlahKertas = {12, 13, 14, 10, 20, 50, 11, 23, 10, 22};

        ProdukHabisPakai kertas = new ProdukHabisPakai("ATK", "K01", merekKertas, jumlahKertas);
        kertas.tampilDataProduk();
        kertas.hitungDataProduk();

        //Produk Tidak Habis Pakai (Printer)
        String [] merekPrinter = {"HP Laser Jet Pro M12w","Canon Pixma MG2570S","Brother DCP-T300",
                                  "Canon Selphy CP1200","HP Color Laser Jet Pro MFP M1777fwK"};
        int [] stokPrinter = {10, 5, 3, 4, 6};
        
        ProdukTidakHabisPakai printer = new ProdukTidakHabisPakai("Printer","P02", merekPrinter, stokPrinter);
        printer.tampilDataProduk();
        printer.hitungDataProduk();
    }
}
