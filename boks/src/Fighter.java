public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    Fighter(String name, int damage,int health,int weight,double dodge){
        this.name= name;
        this.damage=damage;
        this.health= health;
        this.weight=weight;
        this.dodge=dodge;

    }
    boolean dodge(){
        double randomchoice= Math.random()*100;
        return randomchoice<= this.dodge;
    }
    int hit(Fighter foe){
        System.out.print(this.name + " => "+ foe.name+" "+"damage done" );
        if(foe.dodge()){
            System.out.print(foe.name +" dodges incoming damage");

        }if(foe.health-this.damage<0){
            return 0;
        } return foe.health-this.damage;
    }

}
