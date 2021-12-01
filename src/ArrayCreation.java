public class ArrayCreation {

    public static double getAverage(double[] numbers) {
        if (numbers.length < 3) {
            return 0.0;
        }
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
       return total / numbers.length; // Make sure to update this line. It is a temporary placeholder to avoid an error.
    }

    public static String stringArray(String[] friends) {
        if (friends.length != 5) {
            return "";
        }
        String combined = "";
        for (int i = 0; i < friends.length; i++) {
            combined += friends[i].length() + " ";
        }
        return combined.trim(); // Make sure to update this line. It is a temporary placeholder to avoid an error.
    }

    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana",
                "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
        "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
        "Swahili", "Spanish", "English", "French", "English"};


        return "";
    }
}
