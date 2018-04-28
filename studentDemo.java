import java.util.*;
import java.io.*;

class student{
    String fname , lname;
    int marks;

}

class studentDemo{

  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      student s =new student();
      s.fname=sc.nextLine();
      System.out.println(s.fname);
  }
   
}