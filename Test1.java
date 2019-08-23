public class Test1 {

    public static void main(String[] args) {

        Address a1= new Address("111", "aaaaa", "EKM", "KL");
        Address a2= new Address("222", "bbbbb", "TCR", "KL");
        Student s1 = new Student("123", "ANIL", 22, 33,44,55, a1);
        Student s2 = new Student("456", "KABEER", 21, 45, 55, 65, a2);
        s1.display();
        s2.display();
    }

}
