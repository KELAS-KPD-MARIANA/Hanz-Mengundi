package kelayakamengundi;
import java.util.Scanner;

public class KelayakaMengundi {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int umur;
        boolean status;
        
        System.out.print("Masukkan umur anda: ");
        umur = input.nextInt();
 
        input.nextLine();
        
        System.out.println("Adakah anda sudah mendaftar (ya/tidak): ");
        status = inputBoolean(input.nextLine());
        
        if (umur >= 18 && status) {
            System.out.println("Anda layak mengundi");
        } else if (!status) {
            System.out.println("Anda perlu mendaftar sebelum mengundi");
        } else {
            System.out.println("Anda terlalu muda dan tidak layak mengundi");
        }
        
    }

    public static boolean inputBoolean(String userInput) {
        userInput = userInput.toLowerCase();
        if (userInput.equals("ya")) {
            return true;
        } else if (userInput.equals("tidak")) {
            return false;
        } else {
            System.out.println("Mohon masukkan 'ya' atau 'tidak'.");
            return inputBoolean(new Scanner(System.in).nextLine()); 
        }
    }
}