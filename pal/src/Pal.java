import java.util.Scanner;
public class Pal {
        static boolean isPalindrom(String str){
           int i=0;
           int  j= str.length() -1;
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)) return false;
                i++;
                j--;
            }return true;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("enter a word:");
            String s= scan.next();
            System.out.print(isPalindrom(s));
        }
    }


