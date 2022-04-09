public class asl {
    public static void main(String[] args) {
        int sayac ;
        for (int i = 1; i <= 100; i++) {
            sayac=0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    sayac++;
                }
            }if (sayac == 0) {
                System.out.print(i + " ");

            }

        }
    }}
