package java_test;
import java.util.Scanner;
public class f1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan[] Fans = new Fan[3];
        for(int i=0;i<3;i++){
            String input6_1=scanner.nextLine();
            int input6_2=scanner.nextInt();
            scanner.nextLine();
            Fan fan=new Fan();
            fan.setModel(input6_1);
            fan.setPrice(input6_2);
            Fans[i]=fan;
        }
        if(Fans[0].getPrice()<=Fans[1].getPrice()&&Fans[0].getPrice()<=Fans[2].getPrice()){
            System.out.println(Fans[0].getModel());
        }
        if(Fans[1].getPrice()<=Fans[0].getPrice()&&Fans[1].getPrice()<=Fans[2].getPrice()){
            System.out.println(Fans[1].getModel());
        }
        if(Fans[2].getPrice()<=Fans[1].getPrice()&&Fans[2].getPrice()<=Fans[0].getPrice()){
            System.out.println(Fans[2].getModel());
        }
    }
    private static class Fan{
        private String model;
        private int price;
        public Fan() {}
        public String getModel() {return model;}
        public void setModel(String model) {this.model = model;}
        public int getPrice() {return price;}
        public void setPrice(int price) {this.price = price;}
    }
}
