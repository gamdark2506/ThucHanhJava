import java.util.Scanner;

public class AppJava9{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen= ");
            int n = scanner.nextInt();

            int result = reverse_num(n);
            System.out.println("So dao nguoc: "+result );
        }
    }
    private static int reverse_num(int n){
        int reverse = 0; 
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }
}