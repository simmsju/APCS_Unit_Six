public class EnhancedForLoops {

    public static String printStandardFor(String[] arr){
        String done = "";
        for (int x = 0; x < arr.length; x++) {
            done += arr[x] + " ";
        }
        return done;
    }

    public static String printStandardFor(int[] arr){
        String done = "";
        for (int x = 0; x < arr.length; x++) {
            done += arr[x] + " ";
        }
        return done;
    }

    public static String printStandardFor(double[] arr) {
        String done = "";
        for (int x = 0; x < arr.length; x++) {
            done += arr[x] + " ";
        }
        return done;
    }

    public static String printEnhancedFor(String[] arr){
        String done = "";
        for (String a: arr) {
            done += a + " ";
        }
        return done;
    }

    public static String printEnhancedFor(int[] arr){
        String done = "";
        for (int a: arr) {
            done += a + " ";
        }
        return done;
    }

    public static String printEnhancedFor(double[] arr){
        String done = "";
        for (double a: arr) {
            done += a + " ";
        }
        return done;
    }

    public static String printStandardWhile(String[] arr) {
        String done = "";
        int x = 0;
        while (x < arr.length) {
            done += arr[x] + " ";
            x++;
        }
        return done;
    }

    public static String printStandardWhile(int[] arr) {
        String done = "";
        int x = 0;
        while (x < arr.length) {
            done += arr[x] + " ";
            x++;
        }
        return done;
    }

    public static String printStandardWhile(double[] arr) {
        String done = "";
        int x = 0;
        while (x < arr.length) {
            done += arr[x] + " ";
            x++;
        }
        return done;
    }

    // In the space below, make sure to create your main method and your arrays to test each of your loop methods.
    public static void main(String[] args) {
        int[] intArr = {1, 6, 90, 45, 3};
        double[] doubleArr = {1.0, 63.6, 9.9, 4.5, 7.3};
        String[] stringArr = {"ah", "car", "bread", "long", "yes"};
        System.out.println(printStandardWhile(intArr));
        System.out.println(printStandardFor(intArr));
        System.out.println(printEnhancedFor(intArr));
        System.out.println(printStandardWhile(doubleArr));
        System.out.println(printStandardFor(doubleArr));
        System.out.println(printEnhancedFor(doubleArr));
        System.out.println(printStandardWhile(stringArr));
        System.out.println(printStandardFor(stringArr));
        System.out.println(printEnhancedFor(stringArr));
    }
}
