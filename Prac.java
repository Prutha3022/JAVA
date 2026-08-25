import java.io.*;
import java.util.*;
import java.util.Scanner;



class student{

    private int id;
    private String name;

    public student(int id, String name){
        this.id = id;
        this.name = name;
    }

}

public class Prac{
    public static void main (String[] args){
        student s1 = new student(25, "Prutha");
        //student.s1();
        System.out.println("Student: "+s1(25, "Prutha"));
}

}
