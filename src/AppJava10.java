import java.util.Scanner;
 
public class AppJava10 {
 
    public static void main(String[] args) {
        int number, count = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập vào 1 số nguyên dương bất kỳ: ");
            number = scanner.nextInt();
 
            while (number <= 0) {
                System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
                number = scanner.nextInt();
            }
        }
         
        while (number > 0) {
            number /= 10;
            count++;  
        }
         
        System.out.println("Số các chữ số = " + count);
    }
 
}
