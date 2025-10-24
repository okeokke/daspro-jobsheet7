import java.util.Scanner;
public class T1Job7_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int plgn=1, jmlPlgn=0, tiket, tiketTerjual=0, hrgTiket=50000;
    double hrgFinal=0, disc10=0.1, disc15=0.15, dailyIncome=0;
    //plgn = Pelanggan
    
    do {
        System.out.println("(Masukkan angka 0 untuk menyelesaikan input.)");
        System.out.print("Masukkan tiket yang dipesan oleh pelanggan ke-"+plgn+": ");
        tiket=sc.nextInt();
        if (tiket<0) {
            System.out.println("Tiket tidak valid!");
            continue;
        }
        if (tiket==0) {
            System.out.println("Program selesai.");
            break;
        }
        if (tiket>4 && tiket<11) {
            hrgFinal=(tiket*(hrgTiket-(hrgTiket*disc10)));
            System.out.println("Harga yang dibayar = Rp. "+(int)hrgFinal);
            System.out.println("Pelanggan menghemat = Rp. "+(int)(tiket*(hrgTiket*disc10))+" (10%)");
        }
        if (tiket>10) {
            hrgFinal=(tiket*(hrgTiket-(hrgTiket*disc15)));
            System.out.println("Harga yang dibayar = Rp. "+(int)hrgFinal);
            System.out.println("Pelanggan menghemat = Rp. "+(int)(tiket*(hrgTiket*disc15)));
        } else if (tiket<5 && tiket>0) {
            hrgFinal=(tiket*hrgTiket);
            System.out.println("Harga yang dibayar = Rp. "+(int)hrgFinal);
            System.out.println("Pelanggan tidak mendapatkan diskon.");
        }
        tiketTerjual=tiketTerjual+tiket;
        dailyIncome=dailyIncome+hrgFinal;
        plgn++;
        jmlPlgn=plgn-1;
    } while (true);
    int incomeInt = (int) dailyIncome;
    System.out.println("Tiket yang terjual hari ini sebanyak: "+tiketTerjual+" Tiket");
    System.out.println("Total pendapatan hari ini adalah sebesar: Rp. "+incomeInt);
    System.out.println("Jumlah pelanggan hari ini sebanyak: "+jmlPlgn);
    sc.close();
  }
}
// Seorang  pengelola  bioskop  ingin  membuat  program  untuk  menghitung  total  penjualan 
// tiket  dalam  satu  hari.  Tiket  dijual  dengan  harga  Rp  50.000  per  tiket.  Program  harus 
// menghitung  total  tiket  yang  terjual  dan  total  harga  penjualan  tiket  selama  satu  hari 
// dengan ketentuan sebagai berikut: 
// • Jika pelanggan membeli lebih dari 4 tiket, pelanggan mendapatkan diskon 10%. 
// • Jika pelanggan membeli lebih dari 10 tiket, pelanggan mendapatkan diskon 15%. 
// • Jika  input  jumlah  tiket  tidak  valid  (negatif),  program  akan  mengabaikan  input 
// tersebut dan meminta input ulang.