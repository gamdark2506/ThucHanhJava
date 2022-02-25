import java.util.Scanner;

 
public class AppJava3 {
    
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            if (n < 2) {
                System.out.println("n không phải là số nguyên tố");
            }
            
            boolean isSoNguyenTo = true;
            
            for (int i = 2; i < Math.sqrt(n); i++){
                if(n%i == 0){
                    isSoNguyenTo = false;
                    break;
                }
            }
            
            if (isSoNguyenTo) {
                System.out.println("n là số nguyên tố");
            } else {
                System.out.println("n không phải là số nguyên tố");
            }
        }
          
    }
  
   
}