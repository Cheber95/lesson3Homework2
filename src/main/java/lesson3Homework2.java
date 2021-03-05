import java.util.Scanner;

public class lesson3Homework2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int numberWord = (int) (Math.random()* (words.length - 1) );
        String magicWord = words[numberWord];

        do {
            System.out.println("Введите слово");
            String userWord = sc.next();
            String outWord = "";
            int i;
            int eqAns;
            boolean answerGood = true;
            if (magicWord.length() > userWord.length()) {
                eqAns = userWord.length();
            } else {
                eqAns = magicWord.length();
            }
            for (i = 0; i < eqAns; i++) {
                if (magicWord.charAt(i) == userWord.charAt(i)) {
                    outWord = outWord + magicWord.charAt(i);
                }
                else {
                    outWord = outWord + '#';
                    answerGood = false;
                }
            }
            if (answerGood) {
                break;
            }
            for (i = eqAns - 1; i < 15; i++) {
                outWord = outWord + '#';
            }
            System.out.println("Текущий результат: " + outWord);
        } while (true);
        System.out.println("Поздравляю, вы угадали слово " + magicWord);


        sc.close();
    }

}
