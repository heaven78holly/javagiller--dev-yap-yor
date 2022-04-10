import java.util.Scanner;
public class pal {
    static int isPal(int a){
        int number = a,reverse=0,ton;
        while(number!=0){
            ton= number %10;
            reverse= (reverse*10)+ton;
            number /=10;


        }if(reverse==a){
            System.out.print("it is palindromic =>");

        }else{
            System.out.print("not palindromic => ");

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        System.out.print(isPal(n));
    }
}
