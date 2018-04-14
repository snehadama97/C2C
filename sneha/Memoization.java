import java.io.*;
import java.util.*;

class Memoization{
     public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int array[]=new int[n];
        
         
          
         for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
         }

         int max_n = Maximum.max(array);
          
        
        // System.out.println(max_n);
        int mem[]=new int[max_n + 1];
        mem[0]=1;
        
         for(int i=1;i<=max_n;i++){
              mem[i] = i * mem[i-1];
              mem[i] = mem[i] % (10000000 + 7);
            
         }

          for(int j=0;j<array.length;j++){
              System.out.println(mem[array[j]]);
          } 
        
     }

}