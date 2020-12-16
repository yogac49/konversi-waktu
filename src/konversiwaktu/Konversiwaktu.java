package konversiwaktu;
import java.util.Scanner;
public class Konversiwaktu {
//public static int detikmenit(int detik){
//    int hasil =0;
//    int menit = detik /60;
//    hasil = hasil + menit;
//    return hasil;
//}
//public static int detikjam(int detik){
//    int hasil =0;
//    int jam = detik/3600;
//    hasil = hasil + jam ;
//    return hasil;
//}
//public static int jamhari(int jam){
//    int hasil =0;
//    int jam = ((int )(detik/(60*60)));
//}
//        
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        System.out.println("masukkan angka berupa detik  :");  int detik =inp.nextInt();    
//        System.out.println("hasil konversi  :"+detik+" detik" +detikmenit(detik)+" menit");
//        System.out.println("hasil konversi  :"+detik+" detik" +detikjam(detik)+"jam");
//    }
    public static void detikkehari(long detik){
        int hari =(int) (detik /(60*60*24));
        detik %=(60 *60 * 24);
        int jam = (int) (detik / (60 * 60));
        
        detik %= (60 * 60);
        int menit = (int) (detik / 60);
        
        detik %= 60;
         System.out.println(hari + " Hari, " + jam + "jam , " +menit + " menit, " + detik + " detik");

}
   public static void  jamkemenit(long jam){
       long menit = jam *60;
       System.out.println("menit  :" +menit);
   }
    public static void main(String[] args) {
        System.out.println("pilihan konversi  : \n"
                +"1.jam ke menit"
                +"2.detik ke hari, jam , menit dan detik");
        System.out.println("masukkan pilihan ");
        try(Scanner input = new Scanner (System.in)){
            if(!input.hasNextInt()){
                System.out.println("alfabet salah");
            }else{
                if(!input.hasNextInt()){
                    System.out.println("masukkan jam");
                    jamkemenit ( input.nextInt());
                }else{
                    System.out.println("masukkan detik :");
                    try (Scanner detik =new Scanner(System.in)){
                        detikkehari(detik.nextLong());
                    }
                }
            }
        }

 

    }
    }


