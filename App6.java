import java.util.Scanner;
public class App6 {
    public static void main(String[] args) throws Exception{
        int n;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Nhap 1 so nguyen duong: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
            }
        } while (n < 0);
      
        int Giaithua,tmp;
        tmp = 1;
        Giaithua = 1;
        do {
            Giaithua = Giaithua * tmp;
            tmp++;
        } while (tmp <= n);
        
        System.out.println("Giai thua cua " + n + " la: " + Giaithua );
        sc.close();
    }
}