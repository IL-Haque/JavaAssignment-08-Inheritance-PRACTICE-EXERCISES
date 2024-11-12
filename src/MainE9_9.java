public class MainE9_9 {
    public static void main(String[] args) {
        MultiChoiceQuestion q = new MultiChoiceQuestion();
        q.setText("Name the primary colors");
        q.setAnswer("Red Blue Yellow");

        System.out.println(q.getText());
        System.out.println("User response: Red Blue Yellow - " + q.checkAnswer("Red Blue Yellow"));  
        System.out.println("User response: Blue Red Yellow - " + q.checkAnswer("Blue Red Yellow"));  
        System.out.println("User response: Red Yellow - " + q.checkAnswer("Red Yellow"));  
        System.out.println("User response: Red Blue Green - " + q.checkAnswer("Red Blue Green"));  
    }
}
