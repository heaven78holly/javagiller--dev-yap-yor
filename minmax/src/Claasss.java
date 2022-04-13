import java.util.Arrays;
import java.util.Scanner;


public class Claasss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = scan.nextInt();
        int[] list={5244,16,-649,-49,565,94,6};
        list[0]=a;
        Arrays.sort(list);
        int   b=  Arrays.binarySearch(list,a) ;
        System.out.print("list:"+list);
        System.out.println("smallest number greater than the entered number:"+ list[b+1]);
        System.out.print("largest number smaller than the entered number:"+ list[b-1]);




    }
}
