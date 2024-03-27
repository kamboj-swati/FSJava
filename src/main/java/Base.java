public class Base {

    public static void main(String[] args){

        School sc1 = new School();
        sc1.name = "DAV";
        sc1.address = "Delhi";
        sc1.displayResult();

        Teacher t1 = new Teacher();
        t1.name = "Akhil";
        t1.subject = "Computer";
        t1.teaches();

        Student s1 = new Student();
        s1.name = "Swati";
        s1.sports = "Badminton";

        s1.play();

        Student s2 = new Student();
        s2.name = "Rahat";
        s2.sports = "cricket";
        s2.play();

        ClassRoom c1 = new ClassRoom();
        c1.floorNo = 3;
        c1.seatingCapacity = 100;
        c1.cleanClassRoom();
    }
}
