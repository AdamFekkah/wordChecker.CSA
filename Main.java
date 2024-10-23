import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a sample wordList for testing
        ArrayList<String> words = new ArrayList<>();
        words.add("an");
        words.add("band");
        words.add("bandit");
        words.add("abandon");

        // Instantiate the WordChecker object
        WordChecker checker = new WordChecker(words);

        // Test isWordChain method
        System.out.println("Is word chain: " + checker.isWordChain()); // Expected output: true

        // Modify the list and test isWordChain again
        words.set(3, "bant");  // Change the last word to "bant" to break the chain
        System.out.println("Is word chain: " + checker.isWordChain()); // Expected output: false

        // Test createList method
        ArrayList<String> resultList = checker.createList("ban");
        System.out.println("Result of createList with 'ban': " + resultList); 
        // Expected output: [d, dit]
    }
}
