import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int maxFrequency = 0;
        char mostFrequentChar = '?';
        boolean isDuplicate = false;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentChar = entry.getKey();
                isDuplicate = false;
            } else if (frequency == maxFrequency) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? "?" : mostFrequentChar);
    }
}