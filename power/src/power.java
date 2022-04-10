import java.util.Scanner;
public class power {
    static int pow(int a, int b){
        int result=1;
        if(b==0){
            if(a==0){
                System.out.print("undefined!");
            }else{
            return 1;}
        }else if(b>0){
             for (int i=1;i<=b;i++){
                result *=a;
         }
          }else{
            for (int i=1;i>=b;i--){
                result *=1/a;
        }
    }
              return result; }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {


            System.out.print("please enter the base number:");
            int a = scan.nextInt();
            System.out.print("please enter the power number:");
            int b = scan.nextInt();
            System.out.println("result:" + pow(a, b));
        }


    }

}
