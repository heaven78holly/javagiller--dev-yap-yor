import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter a number:");
        int a =scan.nextInt();
        int temp= a-1;
        System.out.print(prime(a,temp));

    }
    static String prime(int a,int temp){
        String result="";

        if (a%temp==0){
            return "Not Prime Number";
        }else{
            if (temp==2){
                return "Prime Number";
            }
        }
        return prime(a,temp-1);

    }
}
