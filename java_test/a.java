package java_test;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.println(new StringBuffer(input1).reverse());
    }
}
