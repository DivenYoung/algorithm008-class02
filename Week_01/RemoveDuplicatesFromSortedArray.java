public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slowIndicator = 0;
        for (int quickIndicator = 1; quickIndicator < nums.length; quickIndicator++) {
            if (nums[quickIndicator] != nums[slowIndicator]) {
                slowIndicator++;
                nums[slowIndicator] = nums[quickIndicator];
            }
        }
        return slowIndicator + 1;
    }
}
