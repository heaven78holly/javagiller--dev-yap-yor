import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random rand=new Random();
        int n = rand.nextInt(100);
        Long select;
        boolean isWrong= false, isWin= false;
        Long[] list= new Long[5];
        for(int i=0; i<5;i++){
            System.out.print("enter your guess:");
            select=scan.nextLong();
            if(select<0 || select>100){
                System.out.println("please enter from between 0 and 100 numbers");
                if(isWrong){
                    System.out.println("you entered lots of number at the wrong average. your remaining life:"+(4-i));
                }else{
                    isWrong= true;
                    System.out.println("if you will enter the wrong number for one more time, your remaining life will decrease by 1");
                    i-=1;
                }continue;
            }
            if(select==n){
                System.out.println("conguratilations! you find the number.");
                isWin=true;
                break;
            }else{
                list[i]=select;
                System.out.println("wrong guess. remaining life:"+(4-i));
                if(select <n){
                    System.out.println("your guess is smaller than the secret number");
                }else{
                    System.out.println("your guess is greater than the secret number");
                }
            }
        } if(isWin){
            System.out.println("you won!");
        }else{
            System.out.println("you lost");
            if(!isWrong){
                System.out.println("your all guesses:"+ Arrays.toString(list));
            }
        }
    }
}
