import java.util.Scanner;

public class MaxSubSumOfSequence {
    public static int MaxSubSumOfSequence(int a[]){
        int sum=0;
        int max=0;
        int n = a.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                    sum+=a[j];
                if(sum>max){
                    max=sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int maxsum;
        System.out.println("请输入几个任意整数(空格分隔):");
        Scanner input= new Scanner(System.in);
        String str = input.nextLine().toString();
        String[] arr=str.split(" ");
        int[] nums=new int[arr.length];
        for(int i =0;i<nums.length;i++)
            nums[i]=Integer.parseInt(arr[i]);
        maxsum=MaxSubSumOfSequence(nums);
        System.out.println(maxsum);
    }

}
