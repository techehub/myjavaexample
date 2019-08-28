package stu;

import p2.Address;

public class Student extends Object{
    static int pass_mark = 150;

    private String rollno;
    protected String name;
    Address address;
    int age;
    int mark1;
    int mark2;
    int mark3;

    public Student(){
        super();
    }

    public Student (String n, String r){
        super ();
        System.out.println(" CREATING NEW STUDENT OBJECT ");
        name= n;
        rollno = r;

    }


    public Student (String name, String rollno, int age){
        this (name, rollno);
        this.age =age;
    }

    public Student (String name, String rollno, int age, int mark1, int mark2, int mark3, Address address){
        this(name, rollno, age) ;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.address= address;

    }

    int totalMark(){
        return  mark3+ mark2+ mark1;
    }

    int avgMark(){
        return totalMark()/3;
    }

    public void  display (){
        System.out.println("Rollno :"+ rollno);
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
        System.out.println("Mark1 :"+ mark1);
        System.out.println("Mark2 :"+ mark2);
        System.out.println("Mark3 :"+ mark3);
        System.out.println("Address :"+ address);
        System.out.println("Total Mark :"+ totalMark());
        System.out.println("Avg Mark :"+ avgMark());
        String status = "NA";
        if (totalMark() > pass_mark) {
             status = "PASSED";
        }else{
             status = "FAIL";
        }

        System.out.println("Status :"+ status);
    }


     static String getGrade(int mark){
        if ( mark >200){
            return "A";
        }
        else{
            return "B";
        }

    }



    public static void main(String[] args) {

        System.out.println("Pass mark"+ pass_mark);




        Address a1= new Address("111", "aaaaa", "EKM", "KL");
        Address a2= new Address("222", "bbbbb", "TCR", "KL");
        Student s1 = new Student("123", "ANIL", 22, 33,44,55, a1);
        Student s2 = new Student("456", "KABEER", 21, 45, 55, 65, a2);

        System.out.println("Roll no"+ s1.rollno);
        System.out.println("Total"+ s1.totalMark());
        s1.display();
        s2.display();

        s2.totalMark();

        System.out.println(getGrade(233));
    }

}
