import java.util.*;
import java.io.*;

class Binary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int mid=0,start=0,ans=0,end=a.length;
        int x=5;
        while(true){
            mid = (start + end)/2;
            //System.out.println(start+" "+end+" "+mid);
            if(x == a[mid]){
                ans = mid;
                break;
            }
            else if(start>=end){ 
              ans = -1;
              break;
            }
            else if(x < a[mid]){
                end = mid;
            }
            else if(x > a[mid]) {
                start = mid;
                //System.out.println(start+" "+end+" "+mid);
            }
            
        }
        System.out.println(ans);
    }
}