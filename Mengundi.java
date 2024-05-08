
package mengundi;
import java.util.Scanner;
public class Mengundi {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int umur;
        boolean status;
        
        System.out.print("Masukkan umur anda: ");
               umur = input.nextInt();
               
        System.out.println("Adakah anda sudah mengundi? (true/false)");
        status = input.nextBoolean();
        
        if (umur >= 18 && status==true){
            System.out.println("Anda layak mengundi.");
        }else if (status==false){
            System.out.println("Anda perlu mendaftar dahulu sebelum mengundi!");
        }else {
            System.out.println("Anda terlalu muda dan tidak layak untuk mengundi.");
    }
   }
}
