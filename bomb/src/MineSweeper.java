import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int row;
    int col;
    int size,success;
    int [][] map;
    int[][] board;
    boolean game= true;
    Random rand= new Random();
    Scanner scan= new Scanner(System.in);
    MineSweeper(int row,int col){
        this.col=col;
        this.row=row;
        this.size=col*row;
        this.map=new int[row][col];
        this.board=new int[row][col];
    }
    void prepare(){
        int ranRow,ranCol,count =0;
        while( count !=(this.size/4)) {
            ranCol = rand.nextInt(this.col);
            ranRow = rand.nextInt(this.row);
            if (this.map[ranRow][ranCol]!=-1 ){
                this.map[ranRow][ranCol] = -1;

            }
            count++;
        }
    }
    void checkMine(int r,int c){
        if(board[r][c]==0){
        if(( c>0&&r>0)&&this.map[r-1][c-1] ==-1){
            board[r][c]++;
        }
        if((r>0)&& this.map[r-1][c] ==-1){
            board[r][c]++;
        }
        if((r>0&&c<this.col-1) &&this.map[r-1][c+1] ==-1){
            board[r][c]++;
        }
        if( (c<0) &&this.map[r][c-1] ==-1){
            board[r][c]++;
        }
        if((c<this.col-1) &&this.map[r][c+1] ==-1){
            board[r][c]++;
        }
        if((r<this.row-1 && c>0)  &&this.map[r+1][c-1] ==-1){
            board[r][c]++;
        }
        if( (r<this.row-1) &&this.map[r+1][c] ==-1){
            board[r][c]++;
        }
        if((r<this.row-1&&c<this.col-1)&&this.map[r+1][c+1] ==-1){
            board[r][c]++;
        }
        if(board[r][c]==0){
            board[r][c]=-2;
        }}
    }
    void run(){
        int row,col;
        prepare();
      //  print(map);
        System.out.println("the game just begun");
        while(this.game){
            print(board);
            System.out.println("row:");
            row=scan.nextInt();
            if(row>this.row-1){
            System.out.println("wrong number");}
            System.out.println("column:");
            col= scan.nextInt();
            if(col>this.col-1){
            System.out.println("wrong number");
            continue;}
            if(map[row][col]!=-1){
                checkMine(row,col);
                success++;
                if(success==(size-(size/4))){
                    System.out.print("you won");
                    break;
                }
            }else{
                game=false;
                System.out.print("you lost,game over");
            }
        }

    }
    void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>=0)
                    System.out.print(" ");
                    System.out.print(arr[i][j]+" ");

            }System.out.println();
        }
    }





   /* static void board(){
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("-");
            }System.out.println();
        }



    }*/
}
