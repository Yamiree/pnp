import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Arrays;

public class dsrt{
    public static void main(String[] args){
        System.out.println("=======Array multidimention=======");
        String nama[]={"Indomie", "Laptop", "Aqua", "Smart TV", "Headphone", "Very Smart TV"};
        int harga[]={3000, 4000000, 3000, 4000000, 4000000}, likes[]={150, 123, 250, 42, 90, 87};
//       initialize and add values all at once using float
       float rating[]={5, 4.5f, 4, 4.5f, 3.5f, 3.5f};

//       initialize and add values one by one
       float angka1;
       final int stack_of_rating = 6;
       float rating2[] = new float[stack_of_rating];
       rating2[0] = 5;
       rating2[1] = 4.5f;
       rating2[2] = 4;
       rating2[3] = 4.5f;
       rating2[4] = 3.5f;
       rating2[5] = 3.5f;

//        initialize and add values all at once using double
        double dataproduk[][] = {{3000, 4000000, 3000, 4000000, 4000000, 4000000}, {5, 4.5, 4, 4.5, 3.5, 3.5}, {150, 123, 250, 42, 90, 87}};
//        input dataproduk(colum) into i variable
        for (int i = 0; i < dataproduk.length; i++) {
//            System.out.println(dataproduk[i]);
//            input dataproduk(row) into j variable and now can to print all dataproduk array's
            for (int j = 0; j < dataproduk[i].length; j++) {
        
                // System.out.println("Data ke-"+j+"="+dataproduk[i][j]);
            }
        }

//        for (int i=0; i<dataproduk.length; i++)
//            for (int j=0; j<dataproduk.length; j++){
//                
//            }
        System.out.println("\n=======Sorting array not multidimensi=======");
        // item name
        System.out.println("##Nama barang##");
        String nama2[]={"Indomie", "Laptop", "Aqua", "Smart TV", "Headphone", "Very Smart TV"};
        for(int i=0; i<nama2.length; i++){
            // System.out.println(nama2[i]);
        }

        // price
        System.out.println("\n##harga##");
        int nilaiharga[]={3000, 4000000, 3000, 4000000, 4000000, 4000000};
        for(int i=0; i<nilaiharga.length; i++){//pemanggilan array pake perulangan for biar simple
            // System.out.println(nilaiharga[i]);
        }
        // for(int i=0; i<nilaiharga.length; i++)
        // for(int j=0; j<nilaiharga.length; j++)
        // if(nilaiharga[i]<nilaiharga[j]){
        //     int hasil=data[i];
        //     data[i]=
        // }

        System.out.println("\n##rating##");
        double rating3[]={5, 4.5, 4, 4.5, 3.5, 3.5};
        for(int i=0; i<rating3.length; i++){
            // System.out.println(rating3[i]);
        }

        System.out.println("\n##pengurutan##");
        
        String nama4[]={"Indomie", "Laptop", "Aqua", "Smart TV", "Headphone", "Very Smart TV"};
        for(int i=0; i<nama4.length; i++){
            // 
        }

        
        // set penyortingan
        double rating4[]={5, 4.5, 4, 4.5, 3.5, 3.5};
        for(int i=0; i<rating4.length; i++){
            // 
        }
        
        int harga4[]={3000, 4000000, 3000, 4000000, 4000000, 4000000};
        for(int i=0; i<harga4.length; i++)
        // System.out.println(harga4[i]);
        for(int j=0; j<harga4.length; j++)
        // System.out.println(harga4[j]);
        if(harga4[i]<harga4[j]){//jika harga i tidak boleh lebih dari harga j
            // System.out.println("i ke "+i+"="+harga4[i]);
            // System.out.println(""+j+"="+harga4[j]);
            int hasil=harga4[i];//int hasil sama dengan harga i
            // System.out.println("###"+harga4[i]);
            // System.out.println(harga4[j]);
            harga4[i]=harga4[j];//harga i sama dengan harga j
            // System.out.println("###*"+harga4[i]);
            // System.out.println(harga4[j]);
            harga4[j]=hasil;//harga j sama dengan hasil
            // System.out.println("###**"+harga4[i]);
            // System.out.println(harga4[j]);
        }
        System.out.println("\nData Setelah di urutkan:");
        for(int j=0; j<harga4.length; j++){
            System.out.println(harga4[j]);
        }

        // double rating4[]={5, 4.5, 4, 4.5, 3.5, 3.5};
        // for(int i=0; i<rating4.length; i++){
        //     // 
        // }

        int likes4[]={150, 123, 250, 42, 90, 87};
        for(int i=0; i<likes4.length; i++){
            // 
        }
    }
}