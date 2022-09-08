package day32_arrays;
import java.util.Arrays;
public class sort_Arrays {
    public static void main(String[] args) {

        int[] nums = {1,4,7,8,9,3,2,-1,3,5,6};
        Arrays.sort(nums);

        char[] aplhabet ={'a','c','e','d','g','f','b'};


        Arrays.sort(aplhabet);
        System.out.println(Arrays.toString(aplhabet));
        System.out.println(Arrays.toString(nums));

        System.out.println("smallest number " + nums[0]);
        System.out.println("biggest number " + nums[nums.length -1]);

    }
}
