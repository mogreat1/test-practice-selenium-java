package questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFileAndCountWords {

    public static void main(String[] args) throws FileNotFoundException {
        String text = readFile("src/foo.txt");
        String[] strings = convertToArray(text);
        Map<String, Integer> words = countWords(strings);
        printResult(words);
    }

    private static String readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }

        return stringBuilder.toString();
    }

    private static String[] convertToArray(String text) {
        String updatedText = text
                .replaceAll("\\W", " ");
        return updatedText.split(" ");
    }

    private static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            if (map.containsKey(word)) {

                var count = map.get(word) + 1;
                map.replace(word, count);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    private static void printResult(Map<String, Integer> map) {
        map.forEach((x, y) -> System.out.println(x + ":" + y));
    }
}
