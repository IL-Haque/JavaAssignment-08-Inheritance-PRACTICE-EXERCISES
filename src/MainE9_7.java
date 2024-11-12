public class MainE9_7 {
    public static void main(String[] args) {
        Question q = new Question();
        q.setText("Who is known as the inventor of Java?");
        q.setAnswer("James Gosling");

        System.out.println(q.getText());
        System.out.println("User response: JAMES gosling - " + q.checkAnswer("JAMES gosling"));
        System.out.println("User response:  james   gosling  - " + q.checkAnswer(" james   gosling ")); 
        System.out.println("User response: JamesGosling - " + q.checkAnswer("JamesGosling"));  
    }
}
