import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner input=new Scanner(System.in);
        System.out.println("input number search");
        int number=input.nextInt();
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                index=i;
            }
        }
        if(index!=0){
            for(int i=index;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}