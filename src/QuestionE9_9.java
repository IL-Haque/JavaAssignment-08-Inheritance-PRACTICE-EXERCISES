import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class QuestionE9_9 {
    protected String text;
    protected String answer;

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        String normalizedAnswer = answer.trim().replaceAll("\\s+", " ").toLowerCase();
        String normalizedResponse = response.trim().replaceAll("\\s+", " ").toLowerCase();

        return normalizedResponse.equals(normalizedAnswer);
    }

    public String getText() {
        return text;
    }
}

class MultiChoiceQuestion extends Question {
    private Set<String> correctAnswers;

    public MultiChoiceQuestion() {
        correctAnswers = new HashSet<>();
    }

    @Override
    public void setText(String questionText) {
        // Adding instructions for multiple correct answers in the question text
        super.setText(questionText + " (Provide all correct choices separated by spaces)");
    }

    @Override
    public void setAnswer(String correctAnswersString) {
        // Split correct answers and add to the set
        correctAnswers = new HashSet<>(Arrays.asList(correctAnswersString.toLowerCase().split(" ")));
    }

    @Override
    public boolean checkAnswer(String response) {
        // Split the user's response into individual answers and store in a set
        Set<String> responseAnswers = new HashSet<>(Arrays.asList(response.toLowerCase().trim().split("\\s+")));

        // Check if the response contains exactly the same correct answers
        return responseAnswers.equals(correctAnswers);
    }
}
