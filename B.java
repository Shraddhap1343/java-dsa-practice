import java.util.Arrays;

class B {
    public int removeDuplicates(int[] nums) {
        int j = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }

        return ++j;
    }

    public static void main(String[] args) {
        B obj = new B();

        int[] nums = {1,1,2,2,3};

        int k = obj.removeDuplicates(nums);

        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}