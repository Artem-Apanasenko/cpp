import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SubstringFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line:");
        String input = scanner.nextLine();
        findUniqueSubstrings(input);
    }

    public static void findUniqueSubstrings(String input) {
        Map<String, Integer> substringCountMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                substringCountMap.put(substring, substringCountMap.getOrDefault(substring, 0) + 1);
            }
        }
        System.out.println("Unique substrings and the number of their occurrences:");
        for (Map.Entry<String, Integer> entry : substringCountMap.entrySet()) {
            System.out.println("Substring: \"" + entry.getKey() + "\" appears " + entry.getValue() + " times(s)");
        }
    }
}
