import java.util.*;

public class largestnum {
    public static int largestnum(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        return largest;
    }
    
    public static void main(String args[]){
        int num[]={100,1,10,15,20,25,30,35,40,45,50};
        System.out.println("the given array is:"+Arrays.toString(num));
        int largest=largestnum(num);
        System.out.println("the largest number in the array is:"+largest);
    }
}
