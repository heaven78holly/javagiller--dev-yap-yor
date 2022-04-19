import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome the game minesweeper\n the rules:\n-1=mine\n 0=not open yet\n-2=empty area\nother numbers=the mine numbers around the select\nenter the size you want to play");
        System.out.println("row:");
        int row= scan.nextInt();
        System.out.print("column:");
        int col= scan.nextInt();
        MineSweeper mine= new MineSweeper(row,col);
        mine.run();
    }

}
