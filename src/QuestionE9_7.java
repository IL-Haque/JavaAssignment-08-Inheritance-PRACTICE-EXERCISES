class QuestionE9_7 {
    private String text;
    private String answer;

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        // Normalize both answer and response by removing spaces and converting to lowercase
        String normalizedAnswer = answer.trim().replaceAll("\\s+", " ").toLowerCase();
        String normalizedResponse = response.trim().replaceAll("\\s+", " ").toLowerCase();

        return normalizedResponse.equals(normalizedAnswer);
    }

    public String getText() {
        return text;
    }
}
