import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    // Constructor to initialize the wordList
    public WordChecker(ArrayList<String> words) {
        wordList = words;
    }


    public boolean isWordChain() {
        // Loop through the list starting from the second element
        for (int i = 1; i < wordList.size(); i++) {
            String previousWord = wordList.get(i - 1);
            String currentWord = wordList.get(i);

            // Check if the current word contains the previous word as a substring
            if (!currentWord.contains(previousWord)) {
                return false; // Return false if condition is not met
            }
        }
        return true; // If all words meet the condition, return true
    }


    public ArrayList<String> createList(String target) {
        ArrayList<String> resultList = new ArrayList<>(); // Create an empty result list

        // Loop through each word in wordList
        for (String word : wordList) {
            // Check if the word starts with the target
            if (word.startsWith(target)) {
                // Remove the first occurrence of the target and add the result to resultList
                resultList.add(word.replaceFirst(target, ""));
            }
        }

        return resultList; // Return the modified list
    }
}
