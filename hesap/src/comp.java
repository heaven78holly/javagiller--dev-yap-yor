import java.util.Scanner;
public class comp {
    static void add(){
        Scanner scan=new Scanner(System.in);
        int result=0;
        System.out.print("how many number will you use?");
        int a=scan.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print("please enter the number");
            int b=scan.nextInt();
            result+=b;
        }

            System.out.print("result:"+result);
    }
    static void minus(){
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.print("how many number will you use?");
        int a=scan.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print("please enter the number");
            int b=scan.nextInt();
            result*=b;
        }

        System.out.print("result:"+result);

    }
    static void divide(){
        Scanner scan=new Scanner(System.in);
        double result=1;
        System.out.print("how many number will you use?");
        int a=scan.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print("please enter the number");
            int b=scan.nextInt();
            if (i==1){
                result=b;
            }else{
                if(b==0){
                    System.out.print("undefined!"); // a little technical problems
                }else{

            result/=b;}
        }}

        System.out.print("result:"+result);
    }
    static void times(){
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.print("how many number will you use?");
        int a=scan.nextInt();
        for(int i=1;i<=a;i++) {
            System.out.print("please enter the number");
            int b = scan.nextInt();
            result*=b;
        }

        System.out.print("result:"+result);
    }
    static void power(){
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.print("enter the base number:");
        int base=scan.nextInt();
        System.out.print("enter the power number:");
        int power=scan.nextInt();
        for (int i=1;i<=power;i++){
            result*=base;
        } System.out.print("result:"+result);
    }
    static void rect(){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the long edge:");
        int a=scan.nextInt();
        System.out.print("enter the short edge:");
        int b=scan.nextInt();
        int area,perimeter;
        area =a*b;
        perimeter=2*(a+b);
        System.out.println("perimeter:"+perimeter);
        System.out.print("area:"+area);
    }
    static void mod(){
        Scanner scan=new Scanner(System.in);

        System.out.print("enter the mod number:");
        int base=scan.nextInt();
        System.out.print("enter the other number:");
        int power=scan.nextInt();
        int result=power%base;
        System.out.print("result:"+result);
    }
    static void factorial(){
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.print("enter the number:");
        int n=scan.nextInt();
        for (int i=2;i<=n;i++){
            result*=i;
        }System.out.print("result:"+result);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String menu= "\n 1-add\n 2-minus\n 3-divide\n 4-times\n 5-power\n 6-area and perimeter of rectangle\n 7-modulo\n 8-factorial\n 0-exit";
        int select;
        do{
            System.out.print(menu +"\n please select an option:");
            select=scan.nextInt();

            switch (select){
                case 1:
                    add();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    divide();
                    break;
                case 4:
                    times();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    rect();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    factorial();
                    break;
                case 0:
                    System.out.print("exit");
                    break;
                default:
                    System.out.print("you entered the wrong number");
            }

        }while(select!=0);

    }
}

