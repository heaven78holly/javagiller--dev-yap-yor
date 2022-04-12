public class Course {
    String prefix;
    int note;
    Teacher x;
    String name;
    int viva;
    double ava;

    Course(String name, String prefix){
        this.name=name;
        this.prefix=prefix;
        int note=0;
        int viva=0;
        double ava=0;
    }
    void addTeacher(Teacher x ){
        if(this.prefix.equals(x.branch)){
            this.x=x;
            System.out.println("succesflully done");
        }else{
            System.out.println(x.name +" can not be the teacher of this class");
        }

    }

}
