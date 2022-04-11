public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    double chance;

    Match(Fighter f1,Fighter f2,int maxWeight,int minWeight){
        this.f1= f1;
        this.f2=f2;
        this.maxWeight= maxWeight;
        this.minWeight= minWeight;

}
    boolean isCheck(){
        return (f1.weight<= this.maxWeight&& f1.weight>=this.minWeight)&&(f2.weight<=this.maxWeight&& f2.weight>=this.minWeight);
    }
    boolean isWin(){
        if(f1.health==0){
            System.out.print("winner:"+f2.name);
            return true;
        }else if(f2.health==0){
            System.out.print("winner:"+f1.name);
            return true;
        }else{
            return false;
        }
    }
    void score(){
        System.out.println("------------");
        System.out.println(f1.name + "remaining life \t:"+f1.health);
        System.out.println(f2.name + "remaining life \t:"+f2.health);
    }
    double chance(){
        double chance= Math.random()*100;
        return chance= this.chance;
    }
    void come(){
        if(this.chance<50){
            Fighter ex;
            ex = this.f1;
            this.f1=this.f2;
            this.f2=ex;

        }
        if(isCheck()){
            while(f1.health>0&&f2.health>0){
                System.out.print("------------new round ---------------");
                f1.health=f2.hit(f2);
                if (isWin()){
                        break;
                }
                f2.health=f1.hit(f2);
                if (isWin()){
                    break;
                }

                    score();
            }

        }
        else{
            System.out.print("athletes are not in the appropriate range");
        }
    }

}
