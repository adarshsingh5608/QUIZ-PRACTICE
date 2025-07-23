package recursionrewind;
import java.util.Scanner;

public class splash{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample questions and answers
        String[] questions = {
            "1. What is the capital of India?",
            "2. Who invented Java?",
            "3. Which planet is known as the Red Planet?",
            "4. What is 5 + 3?",
            "5. Which keyword is used to define a class in Java?"
        };

        String[][] options = {
            {"A. Mumbai", "B. Delhi", "C. Kolkata", "D. Chennai"},
            {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
            {"A. Earth", "B. Venus", "C. Mars", "D. Jupiter"},
            {"A. 6", "B. 7", "C. 8", "D. 9"},
            {"A. def", "B. class", "C. function", "D. object"}
        };

        char[] answers = {'B', 'A', 'C', 'C', 'B'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is " + answers[i]);
            }
        }

        System.out.println("\n🎉 You scored " + score + " out of " + questions.length);
        sc.close();
    }
}
