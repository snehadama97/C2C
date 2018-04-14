import java.util.*;
import java.io.*;

class Maximum{

    public static int max(int[] array){
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
  
         System.out.println(max(array));
        
    }
}