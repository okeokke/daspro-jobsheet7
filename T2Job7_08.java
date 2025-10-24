import java.util.Scanner;
public class T2Job7_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jenis, durasi, total=0;

    do {
        System.out.println("Masukkan jenis kendaraan");
        System.out.print("(1 = Mobil, 2 = Motor, 0 = Keluar): ");
        jenis = sc.nextInt();
        if (jenis==1 || jenis==2) {
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            if (durasi>5) {
                total+=12500;
                continue;
            } else if (jenis==1) {
                total+=durasi*3000;
                continue;
            } else if (jenis==2) {
                total+=durasi*2000;
                continue;
            }
        }
    } while (jenis!=0);
    sc.close();
    System.out.println("Total biaya parkir adalah = Rp. "+total);
  }
}
// Sebuah  tempat  parkir  ingin  membuat  program  untuk  menghitung  total  pembayaran 
// parkir dari beberapa kendaraan. Tarif parkir adalah Rp 3.000 per jam untuk mobil dan Rp 
// 2.000  per  jam  untuk  motor.  Namun,  jika  durasi  parkir  lebih  dari  5  jam,  diberikan  tarif 
// tetap sebesar Rp 12.500 untuk semua kendaraan. Program akan terus meminta masukan 
// selama  input  bukan  0.  Implementasikan  flowchart  tersebut  ke  dalam  bentuk  kode 
// program Java! 