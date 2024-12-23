import java.util.Scanner;
public class LargestSmallestNumber {

    Scanner sc=new Scanner(System.in);
    int i;
    int arr[] = new int[10];
    public void input() {

        for (i = 0; i < arr.length; i++) {
            System.out.println("enter your number" + (i + 1));
            arr[i] = sc.nextInt();
        }
    }
        public void Find(){
        int largest =arr[0];
        int smallest =arr[0];

            for(int i=1;i<arr.length;i++){
                if(arr[i]<smallest)
                    smallest=arr[i];
                else if(arr[i]>largest)
                    largest=arr[i];
            }
            System.out.println("largest number is "+largest);

            System.out.println("smallest number is "+smallest );

        }

    public static void main(String[] args) {

        LargestSmallestNumber obj= new LargestSmallestNumber();
        obj.input();
        obj.Find();
    }



}
