import java.util.*;

class Question {
    String question;
    String[] options = new String[4];
    int correctOption;

    // Constructor
    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    // Method to display question with option
    public void display() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    // Method to check the answer
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }
}

public class QuizGame {
    static final int MAX_QUESTIONS = 10;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize questions
        Question[] originalQuestions = new Question[MAX_QUESTIONS];

        originalQuestions[0] = new Question(
            "Which bird lays the largest egg?",
            new String[]{"Owl", "Ostrich", "Kingfisher", "Woodpecker"},
            2
        );

        originalQuestions[1] = new Question(
            "How many legs does a spider have?",
            new String[]{"7", "8", "6", "5"},
            2
        );

        originalQuestions[2] = new Question(
            "What does CPU stand for?",
            new String[]{"Central Process Unit", "Central Processing Unit", "Computer Personal Unit", "Central Print Unit"},
            2
        );

        originalQuestions[3] = new Question(
            "Which of the following is the capital of India?",
            new String[]{"Mumbai", "New Delhi", "Kolkata", "Bengaluru"},
            2
        );

        originalQuestions[4] = new Question(
            "What is a group of lions called?",
            new String[]{"Drift", "Pride", "Flock", "Drove"},
            2
        );

        originalQuestions[5] = new Question(
            "Which is the largest planet in our solar system?",
            new String[]{"Earth", "Mars", "Jupiter", "Venus"},
            3
        );

        originalQuestions[6] = new Question(
            "Which of these is a programming language?",
            new String[]{"HTML", "Python", "CSS", "SQL"},
            2
        );

        originalQuestions[7] = new Question(
            "Which Indian state is known as the 'Land of Rising Sun'?",
            new String[]{"Arunachal Pradesh", "Assam", "Sikkim", "Manipur"},
            1
        );

        originalQuestions[8] = new Question(
            "Who wrote the famous play 'Romeo and Juliet'?",
            new String[]{"Charles Dickens", "Mark Twain", "George Orwell", "William Shakespeare"},
            4
        );

        originalQuestions[9] = new Question(
            "Which gas is most abundant in the Earth's atmosphere?",
            new String[]{"Oxygen", "Hydrogen", "Nitrogen", "Carbon Dioxide"},
            3
        );

        List<Question> questionList = new ArrayList<>(Arrays.asList(originalQuestions));
        Collections.shuffle(questionList); // Randomize question order

        int score = 0;

        System.out.println("Hello! Here's your Quiz Game!\n");

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            Question q = questionList.get(i);
            q.display();

            System.out.print("Enter your answer (1-4): ");
            int userAnswer;

            try {
                userAnswer = Integer.parseInt(scanner.nextLine());

                if (userAnswer >= 1 && userAnswer <= 4) {
                    if (q.isCorrect(userAnswer)) {
                        System.out.println("-------Correct-------\n");
                        score++;
                    } else {
                        System.out.println("-------Sorry, Incorrect Answer-------");
                        System.out.println("The correct answer is " + q.correctOption + ". -- " + q.options[q.correctOption - 1] + "\n");
                    }
                } else {
                    System.out.println("\nInvalid choice!!! --Please enter a number between 1 and 4.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input! Please enter a number between 1 and 4.\n");
            }
        }

        System.out.println("************************************");
        System.out.println("Well Done Champ !!!!");
        System.out.println("Quiz completed!\nYour score: " + score + "/" + MAX_QUESTIONS);
    }
}
