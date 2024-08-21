package java_test;

public class b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input2 = scanner.nextLine();
        String[] array={"a","e","i","o","u"};
        boolean tmp=false;
        for(int i=0;i<5;i++){
            if (input2.equals(array[i])) {
                tmp = true;
                break;
            }
        }
        if(tmp){
            System.out.println("O");
        }else{
            System.out.println("X");
        }
    }

}
