public class LetterCount {
    
    public static String letterCount(String str) {
        String[] words = str.split("\\s+");
        String resultWord = "";
        int maxRepeats = 0;

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            if (cleanedWord.isEmpty()) continue;

            int[] letterCounts = new int[26];
            for (char c : cleanedWord.toCharArray()) {
                letterCounts[c - 'a']++;
            }
            
            int maxCount = 0;
            for (int count : letterCounts) {
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            
            if (maxCount > 1) {
                if (maxCount > maxRepeats) {
                    maxRepeats = maxCount;
                    resultWord = word;
                }
            }
        }
        
        return resultWord.isEmpty() ? "-1" : resultWord;
    }

    public static void main(String[] args) {
        System.out.println(letterCount("Hello apple pieeee"));
    }
}