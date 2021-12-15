public class ArrayAlgorithms {

    public static boolean checkForAllNegatives(int[] list) {
        int negatives = 0;
        for (int num : list)
            if (num < 0)
                negatives++;
        if (negatives == list.length)
            return true;
        return false; // placeholder to avoid errors. You may need to change this.
    }

    public static boolean hasDupes(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int x = 0; x < list.length; x++) {
                if (list[i] == list[x] && i != x) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int[] leftShift(int[] nums, int shift) {
        int index = 0;
        int[] numsNew = new int[nums.length + shift];
        for (int num : nums) {
            numsNew[index] = num;
            index++;
        }
        return numsNew; // placeholder to avoid errors. You may need to change this.
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 1};
        int[] arr2 = {1, 1, 1};
        int[] arr3 = leftShift(arr, 6);
        int [] arr4 = leftShift(arr2, 3);
    }
}
