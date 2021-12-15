public class ArrayTraversal {

    public static int[] buildArray(int desiredLength) {
        int[] arr = new int[desiredLength];
        for (int x = 0; x < desiredLength; x++) {
            arr[x] = x;
        }
        return arr;
    }

    public static int countEven(int[] nums) {
        int evens = 0;
        for (int num: nums) {
            if (num % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    public static boolean sum28(int[] numbers) {
        int sum = 0;
        for (int num: numbers) {
            if (num == 2)
                sum += 2;
        }
        if (sum == 8)
            return true;
        else
            return false;
    }
}
