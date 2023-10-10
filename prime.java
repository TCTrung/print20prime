import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong in ra :");
        int n = scanner.nextInt();
        int count = 0;
        int c = 0;
        for (int i = 2; i < 1000 ; i++) {
            if (count < n) {
                for (int j = 1; j <=i ; j++) {
                    if(i%j == 0){
                        c++;
                    }
                }
                if (c == 2) {
                    System.out.println(i);
                    count++;
                }
                c = 0;
            }else{
                break;
            }
        }

    }
}
