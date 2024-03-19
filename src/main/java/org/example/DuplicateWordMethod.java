package org.example;

public class DuplicateWordMethod {
    public static void findDuplicateWords(String text) {

        String[] sentences = text.split("\\.");

        System.out.println("Duplicate words in the text starting from the second sentence are : ");
        boolean foundDuplicates = false;

        if (sentences.length <= 1) {
            try {
                throw new Exception("No sentences beyond the first one to check for duplicates");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        for (int i = 1; i < sentences.length; i++) {
            String sentence = sentences[i].trim();
            if (!sentence.isEmpty()) {
                String[] words = sentence.toLowerCase().split("\\s+");
                for (int j = 0; j < words.length; j++) {
                    int count = 1;
                    if (!words[j].equals("0")) {
                        for (int k = j + 1; k < words.length; k++) {
                            if (words[j].equals(words[k])) {
                                count++;
                                words[k] = "0";
                            }
                        }
                        if (count > 1) {
                            System.out.println(words[j] + ": " + count);
                            foundDuplicates = true;
                        }
                    }
                }
            }
        }

        if (!foundDuplicates) {
            try {
                throw new Exception("No repeated words");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
