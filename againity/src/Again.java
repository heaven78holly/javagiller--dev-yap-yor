public class Again {
    static boolean isHas(int[]arr, int val){
        for (int i:arr){
            if(i==val){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] list={5,6,6,8,4,3,8,8,9,4,5};
        int[] duplicate= new int[list.length];
        int ındex=0;
        for(int i=0;i<list.length;i++){
            for(int j =0;j<list.length;j++){
                if(i!=j && list[i]==list[j]){
                    if(!isHas(duplicate,list[i])){
                        duplicate[ındex++]=list[i];
                    }
                }
            }
        }
        for( int i: duplicate){
            if(i!=0){
                System.out.println(i);
            }
        }
    }
}
