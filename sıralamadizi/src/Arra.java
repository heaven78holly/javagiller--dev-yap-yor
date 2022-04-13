import java.util.Scanner;
import java.util.Arrays;
public class Arra {
    static void add(int[] list,int a,int i){
         list[i-1]=a;
    }
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("length of array:");
        int n = scan.nextInt();
        int[] list= new int[n];
        for(int i=1;i<=n;i++){
            System.out.print(i+". element:");
            int a= scan.nextInt();
            add(list,a,i);
        }
        Arrays.sort(list);
        System.out.print("sorted:"+Arrays.toString(list));
    }
}
