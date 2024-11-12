public class MainE9_5 {
    public static void main(String[] args) {
        NumericQuestion q = new NumericQuestion();
        q.setText("What is 3.14159 rounded to two decimal places?");
        q.setAnswer(3.14);

        System.out.println(q.getText());
        System.out.println("User response: 3.14 - " + q.checkAnswer("3.14")); 
        System.out.println("User response: 3.15 - " + q.checkAnswer("3.15")); 
        System.out.println("User response: 3.13 - " + q.checkAnswer("3.13"));  
        System.out.println("User response: 3.12 - " + q.checkAnswer("3.12"));  
    }
}
