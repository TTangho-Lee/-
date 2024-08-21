package java_test;
import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input3_1=scanner.nextInt();
        scanner.nextLine();
        int input3_2=scanner.nextInt();
        scanner.nextLine();
        if(input3_1>=14||input3_2>=160){
            System.out.println("X");
        }else{
            System.out.println("O");
        }
    }
}
