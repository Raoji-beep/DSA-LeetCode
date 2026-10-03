import java.util.Arrays;
class Solution {
    public int maxProduct(int n) {
    //     int length = String.valueOf(n).length();
    //     int[] arr = new int[length];
    //     int largest_num = 0;
    //     int second_largest_num = 0;
    //     int i = 0;
    //     while(n > 0){
    //         int d = n % 10;
    //         arr[i++] = d;
    //         n /=10;
    //     }
    //     Arrays.sort(arr);
    //     largest_num = arr[length-1];
    //     second_largest_num = arr[length -2];

    // return largest_num * second_largest_num;
        int largest_num = 0;
        int second_largest_num = 0;
        int temp = 0;

        while(n > 0){
            temp = n % 10;
            if(temp > largest_num){
                second_largest_num = largest_num;
                largest_num = temp;
            } else if(temp > second_largest_num){
                second_largest_num = temp;
            }
              n /=10;
        }
    return largest_num * second_largest_num;
    }
}