import java.util.*;

public class linearSearch {
    public static int linearSearch(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={0,1,10,15,20,25,30,35,40,45,50};
        System.out.println("the given array is:"+Arrays.toString(num));
        System.out.println("enter the key to be searched:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = linearSearch(num,key);
        if(index==-1){
            System.out.println("key not found");
        } else {
            System.out.println("key found at index: "+index);
        }

    }
    
}
