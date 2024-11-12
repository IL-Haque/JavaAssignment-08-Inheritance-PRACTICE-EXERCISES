
class AnyCorrectChoiceQuestion extends QuestionE9_8 {
    @Override
    public void setText(String questionText) {
        // Adding instructions for multiple correct answers in the question text
        super.setText(questionText + " (Answer with any one of the correct choices)");
    }

    @Override
    public void setAnswer(String correctAnswers) {
        super.setAnswer(correctAnswers);
    }

    @Override
    public boolean checkAnswer(String response) {

        String normalizedResponse = response.trim().toLowerCase();

        // Split the correct answers and check if any matches the response
        String[] correctAnswers = super.answer.toLowerCase().split(" ");
        for (String correctAnswer : correctAnswers) {
            if (correctAnswer.equals(normalizedResponse)) {
                return true;
            }
        }

        return false;
    }
}
