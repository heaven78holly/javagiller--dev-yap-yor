import java.util.Arrays;
public class Sorter {
    public static void main(String[] args) {
        int[] list={5,9,7,63,8,8,8,9,9,1,1,6};
        int[] duplicate= new int[list.length];
        int index=0;
        for(int i=0;i<list.length;i++){
            int sort=0;
            for(int j=0;j<list.length;j++){
                if(j!=i && list[j]== list[i]){
                    sort++;
                }
            }
            Arrays.sort(list);
            if(sort>0 && list[i]!=list[i+1]) System.out.println("Number "+list[i]+" for "+(sort+1)+" times ");

        }

    }
}
