package exercise3;

public class Median {
    public static void main(String[] args) {

        int[] arr = {2,43,534,645,64,142,1};
        int median;
        if (arr.length % 2 == 0)
            median = (arr[arr.length/2] + arr[arr.length/2 - 1])/2;
        else
            median = arr[arr.length/2];
        System.out.println(median);

    }

}
