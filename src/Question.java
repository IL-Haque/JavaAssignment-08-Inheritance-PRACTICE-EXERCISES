public class Question {
    private String text;
    private String answer;

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    public String getText() {
        return text;
    }
}

class NumericQuestion extends Question {
    private double answer;

    // Set the correct answer as a double
    public void setAnswer(double correctAnswer) {
        this.answer = correctAnswer;
    }

    // Override checkAnswer to allow a small tolerance
    @Override
    public boolean checkAnswer(String response) {
        try {
            double responseValue = Double.parseDouble(response);
            return Math.abs(responseValue - answer) <= 0.01;
        } catch (NumberFormatException e) {
            System.out.println("Invalid response format.");
            return false;
        }
    }
}
