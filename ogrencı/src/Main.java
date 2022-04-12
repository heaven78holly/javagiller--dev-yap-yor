public class Main {
    public static void main(String[] args) {
    Course mat= new Course("mathematics","MAT");
    Course phy = new Course("Physics","PHY");
    Course che = new Course (" Chemistry","CHE");

    Teacher t1= new Teacher("Mahmut Hoca", "90550000000", "MAT");
    Teacher t2= new Teacher("Fatma Ayşe", "90550000001", "PHY");
    Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHE");

    mat.addTeacher(t1);
    phy.addTeacher(t2);
    che.addTeacher(t3);


    Student s1 = new Student("Ali Veli", "90550000002",4,mat,phy,che);
    s1.rating(99,33,99);
    s1.checkViva(10,10,10);
    s1.isPass();
    Student s2= new Student("Güdük Necmi",  "2211133",4,mat,phy,che);
        s2.rating(85,30,66);
        s2.checkViva(96,101,20);
        s2.isPass();
    Student s3 = new Student("Hayta İsmail", "221121312",4,mat,phy,che);
        s3.rating(102,88,99);
        s3.checkViva(10,94,35);
        s3.isPass();
    }
}
