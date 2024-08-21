package java_test;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input4=scanner.nextLine();
            try{
                int number=Integer.parseInt(input4);
                int answer=0;
                if(number>0){
                    for(int i=1;i<=number;i++){
                        answer+=i;
                    }
                    System.out.println(answer);
                    break;
                }
                else{
                    System.out.println("X");
                }
            }catch (NumberFormatException e){
                System.out.println("X");
            }
        }
    }
}
