public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr= new int[]{12,32,43,23,45,78,98,100};
        int sum = 0;

        for (int i=0;i<arr.length;i++) {

            sum = sum + arr[i];

        }
        double Average = sum/arr.length;
        System.out.println("The average of the array is : " + Average);
    }
}