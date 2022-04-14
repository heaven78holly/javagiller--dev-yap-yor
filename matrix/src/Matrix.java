public class Matrix {
    public static void main(String[] args) {
        int[][] list= {
                {6,4,8},
                {9,3,7}
        };
        int[][] duplicate= new int[3][2];
        for (int x = 0; x < list.length; x++)
        {
            for (int y = 0; y < list[x].length; y++)
            {
                duplicate[y][x]=list[x][y];


            }
    }
               for (int i=0;i<duplicate.length;i++){
                   for(int j=0; j<duplicate[i].length;j++){
                       System.out.print(duplicate[i][j]+" ");
                   }
                   System.out.println();

               }


    }}


