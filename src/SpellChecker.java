import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SpellChecker {
    public static String[] getDictionary() throws IOException {
        String[] dictionary = new String[61336];
        Scanner s = new Scanner(new File("files/words.txt"));
        int count = 0;
        while (s.hasNext()) {
            dictionary[count] = s.next();
            count++;
        }
        return dictionary;
    }

    public static boolean wordInDictionary(String word, String[] dictionary) {
        int min = 0;
        int max = dictionary.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (word.compareTo(dictionary[mid])== 0) {
                return true;
            } else if (word.compareTo(dictionary[mid]) < 0) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        Scanner scan = new Scanner(new File("files/alice.txt"));
        FileWriter fw = new FileWriter("files/corrected.txt");
        String word = "";
        String[] dictionary = getDictionary();
        while (scan.hasNext()) {
            word = scan.next();
            if (!(wordInDictionary(word, dictionary))) {
                System.out.print("Do you want to correct \"" + word + "\" (y/n): ");
                if (s.nextLine().equals("y")) {
                    System.out.print("Please enter the corrected word: ");
                    fw.write(s.nextLine() + " ");
                } else {
                    fw.write(word + " ");
                }
            } else {
                fw.write(word + " ");
            }
        }
        fw.close();
    }
}
