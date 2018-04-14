import java.util.*;
import java.io.*;

class Max{

    public static int maximum(int[] array){
          int value = 0;
          int max=array[0];

                for(int i=0;i<array.length;i++){
                if(array[i]>max){
                    value = array[i];
                    }          
              } 

        return value;
    }

    public static void main(String args[]){

        int[]array = {10,20,50,2,100};
  
         System.out.println(maximum(array));
        
    }
}