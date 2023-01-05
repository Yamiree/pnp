import java.util.Scanner;
// import java.util.Scanner;
public class dsrtipt {
    public static void main(String[] args){
        Scanner scan1=new Scanner(System.in);
        int jumlahdata;
        System.out.print("masukkan jumlah data: ");
        jumlahdata=scan1.nextInt();
        // System.out.print("Kalimat :");
        // String kalimat=scan1.next();

        String nama[]=new String[jumlahdata];
        int harga[]=new int[jumlahdata];
        double rating[]=new double[jumlahdata];
        int likes[]=new int[jumlahdata];        
        System.out.println("Masukkan data produk: ");
        for(int i=0; i<jumlahdata; i++){
            System.out.print("Nama barang ke-"+(i+1)+": ");
            nama[i]=scan1.next();
            // System.out.print("Harga "+nama[i]+": ");
            // harga[i]=scan1.nextInt();
            // System.out.print("Rating "+nama[i]+": ");
            // rating[i]=scan1.nextDouble();
            // System.out.print("Likes "+nama[i]+": ");
            // likes[i]=scan1.nextInt();
        }
        
        System.out.println("====Data produk====");
        System.out.println("Nama\t\tHarga\t\tRating\tLikes");
        for(int i=0; i<jumlahdata; i++){
            System.out.println(nama[i]+"\t\t"+harga[i]+"\t\t"+rating[i]+"\t"+likes[i]);
        }

        // for(int){

        // }
        String cek1;
        System.out.println("Lihat pengurutan data produk:\n1. Barang\n2. Harga\n3. Rating\n4. Likes");
        System.out.print("Pilihan anda: ");
        cek1=scan1.next();
        // if(){

        // }
    }
}
