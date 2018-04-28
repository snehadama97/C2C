import java.util.*;
import java.io.*;

class Student{
    String fname , lname;
    int grade;
    public static int count=0;
    

    public static void decrement(){
        count--;
    }


    //constructor
    public Student(){
        count++;
    }
    public void clearedSemester(){
          grade++;
          //System.out.println("nonstatic grade "+grade);
    }
}

class Student1Demo{

  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      Student s1 =new Student();
      s1.clearedSemester();
      Student s2 =new Student();
      s2.clearedSemester();
      Student s3 =new Student();
      s3.clearedSemester();
      Student s4 =new Student();
      s4.clearedSemester();
      Student s5 =new Student();
      s5.clearedSemester();

      System.out.println("static count "+Student.count);
      
      s2.clearedSemester();

     Student.decrement();
      Student.decrement();
      System.out.println("static count decrement by 2: "+Student.count);
  }
   
}