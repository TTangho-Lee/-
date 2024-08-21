package java_test;
import java.util.Scanner;
public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input5_1=scanner.nextInt();
        scanner.nextLine();
        int input5_2=scanner.nextInt();
        scanner.nextLine();
        int[] array_30={4,6,9,11};
        int[] array_31={1,3,5,7,8,10,12};
        if(input5_2==2){
            if(input5_1%4==0&&input5_1%100!=0){
                System.out.println("29");
            }
            else if(input5_1%400==0){
                System.out.println("29");
            }
            else{
                System.out.println("28");
            }
        }
        for (int j : array_30) {
            if (input5_2 == j) {
                System.out.println("30");
            }
        }
        for (int j : array_31) {
            if (input5_2 == j) {
                System.out.println("31");
            }
        }
    }
}
