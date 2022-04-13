public class Harmonia {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5,6};
        double total=0;
        for(int i=0;i< list.length;i++){
            total+= 1/list[i];
        }
        System.out.print(list.length/total);
    }
}
