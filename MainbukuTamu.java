package StaticdanFinal;
import java.util.Scanner;
/**
 *
 * @author Zedd
 */
public class MainbukuTamu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=================BUKU TAMU=================");
        int i=0;
        String pil;
        do{
            System.out.println("Buku Tamu");
            System.out.println("Masukkan nama   : ");        
            String nam = in.next();
            System.out.println("Alamat          : ");
            String al = in.next();
            BukuTamu.nama(nam,i);
            BukuTamu.alamat(al, i);
            BukuTamu.display();
            i++;
            System.out.println("Tammbah data (y/n)?");
            pil = in.next();
        }while(pil.equalsIgnoreCase("y"));
        System.out.println("Jumlah daftar tamu yang hadir adalah "+(BukuTamu.ID-1));
    }
}
