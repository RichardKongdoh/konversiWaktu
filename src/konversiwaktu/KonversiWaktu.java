package konversiwaktu;

import java.util.Scanner;

public class KonversiWaktu {

    public static void main(String[] args) {
        int no;
        double jam, detik, menit,waktu;
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("pilih waktu yang mau dikonversi : \n" + "1. detik\n" + "2. menit\n" + "3. jam ");
        System.out.print("= ");
        no = key.nextInt();
        System.out.println();
        
        if ( no == 1){
                System.out.print("masukkan waktu = ");
                waktu = key.nextDouble();
                
                menit = waktu/60;
                System.out.println(" hasil konversi detik ke menit = " + menit + " menit");
                
                jam  = waktu/3600;
                System.out.println(" hasil konversi detik ke jam = " + jam + " jam"); 
                
        } else if ( no == 2){
                System.out.print("masukkan waktu = ");
                waktu = key.nextDouble();
                
                detik = waktu*60;
                System.out.println(" hasil konversi menit ke detik = " + detik + "detik");
                
                jam  = waktu/60;
                System.out.println(" hasil konversi menit ke jam = " + jam + "jam"); 
                
        } else {
                System.out.print("masukkan waktu = ");
                waktu = key.nextDouble();
                
                detik = waktu*3600;
                System.out.println(" hasil konversi jam ke detik = " + detik + " detik");
                
                menit  = waktu*60;
                System.out.println(" hasil konversi jam ke menit = " + menit + " menit");
        }
        
    }
    
}
