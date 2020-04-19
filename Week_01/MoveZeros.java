public class MoveZeros {
    /**
     * one loop
     *
     */
    public void moveZerosOneLoop(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                if (pos != i) {
                    nums[i] = 0;
                }
                pos++;
            }
        }
    }

    /**
     * two loop
     *
     */
    public void moveZeroTwoLoop(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
