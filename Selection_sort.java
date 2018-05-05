import java.io.*;
import java.util.*;

class Selection_sort{
  
  public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      int s[]={2,1,4,5,6,7};
      int n=s.length;
      int result[]=new int[s.length];
      int max=s[0];
      int temp;

      for(int i=0;i<n-1;i++){
          for(int j=i+1;j<n;j++){
                if(s[j]>s[i]){
                    temp = s[j];
                    s[j]=s[i];
                    s[i]=temp;
                }  
                    
          }
          System.out.println(s[i]);
        
      } 
  }
}