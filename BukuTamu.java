package StaticdanFinal;

/**
 *
 * @author Zedd
 */
public class BukuTamu {
    private static final String nama[] = new String[99];
    private static final String alam[] = new String[99];
    private static final int id[] = new int[99];
    static int ID = 1;
    public static void nama(String nam,int i){
        nama[i]= nam ;
        id[i] = ID;
    }
    public static void alamat(String al,int j){
        alam[j]= al ;
    }
    public static void display(){
        System.out.println("BUKU ALAMAT");
        System.out.println("ID\t| Nama\t\t\t\t| Alamat");
        System.out.println("------------------------------------------------------------");
        for(int i = 0;i<ID;i++){
            System.out.println(id[i]+"\t| "+nama[i]+"\t\t\t\t| "+alam[i]);
        }ID++;
    }
}
