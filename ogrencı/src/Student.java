public class Student {
    String name, stdno;
    Course mat;
    Course fizik;
    Course kimya;
    int classes;
    double average;
    boolean isPass;
    Student(String name,String stdno,int classes, Course mat,Course fizik,Course kimya){
        this.name= name;
        this.classes=classes;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.stdno=stdno;
    }
    void rating(int mat,int fiz,int kim){
        if(mat<=100&&mat>=0){
            this.mat.note=mat;
        } if(fiz<=100&&fiz>=0){
            this.fizik.note=fiz;
        } if(kim<=100&&kim>=0){
            this.kimya.note=kim;
        }
    }
    void checkViva(int mat,int fiz,int kim){
        if(mat<=100&&mat>=0){
            this.mat.viva=mat;
        } if(fiz<=100&&fiz>=0){
            this.fizik.viva=fiz;
        } if(kim<=100&&kim>=0){
            this.kimya.viva=kim;
        }
    }
    void checkNote(){
        this.fizik.ava= (this.fizik.viva*0.2 + this.fizik.note*0.8);
        this.kimya.ava=(this.kimya.viva*0.3+this.kimya.note*0.7);
        this.mat.ava=(this.mat.viva*0.1+ this.mat.note*0.9);
    }

    void average(){
        checkNote();
        this.average=(this.fizik.ava + this.kimya.ava+ this.mat.ava)/3;
    }
    boolean checkPass(){
        average();
        return this.average>55;
    }
    void printNote(){
        System.out.println("=========================================");
        System.out.println("student:"+this.name);
        System.out.println("Physics:"+this.fizik.ava+ "\n 20% viva + 80% exam");
        System.out.println("Mathemathics:"+this.mat.ava+"\n 10% viva + 90% exam");
        System.out.println("Chemistry:"+this.kimya.ava+ "\n 30% viva+ 70% exam");
    }
    void isPass(){
            this.isPass=checkPass();
            printNote();
            System.out.println("Average:"+ this.average);
            if(this.isPass){
                System.out.println("Pass the class");
            }else{
                System.out.println("Fail the class");
            }
    }

}
