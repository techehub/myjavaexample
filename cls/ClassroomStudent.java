package cls;
import stu.Student;

public class ClassroomStudent extends Student {

    String roomno;

    public ClassroomStudent(String n, String r, String roomno) {
        super();
        this.roomno = roomno;
    }

    public void aaaa() {
        System.out.println(" Class room student");
        display();
    }


}
