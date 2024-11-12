class QuestionE9_6 {
    private String text;
    private String answer;

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    public String getText() {
        return text;
    }
}

class FillInQuestion extends Question {

    public FillInQuestion(String questionWithAnswer) {
        parseQuestionAndAnswer(questionWithAnswer);
    }

    private void parseQuestionAndAnswer(String questionWithAnswer) {
        int start = questionWithAnswer.indexOf("_");
        int end = questionWithAnswer.lastIndexOf("_");

        if (start != -1 && end != -1 && start < end) {
            String questionText = questionWithAnswer.substring(0, start) + "_____"
                    + questionWithAnswer.substring(end + 1);
            String answer = questionWithAnswer.substring(start + 1, end);

            setText(questionText);
            setAnswer(answer);
        } else {
            System.out.println("Invalid format for FillInQuestion.");
        }
    }
}
