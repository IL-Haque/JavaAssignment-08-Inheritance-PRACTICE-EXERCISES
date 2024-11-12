public class MainE9_8 {
    public static void main(String[] args) {
        AnyCorrectChoiceQuestion q = new AnyCorrectChoiceQuestion();
        q.setText("Name a programming language created in the 1990s");
        q.setAnswer("Java Python Ruby");

        System.out.println(q.getText());
        System.out.println("User response: Java - " + q.checkAnswer("Java"));  // true
        System.out.println("User response: python - " + q.checkAnswer("python"));  // true
        System.out.println("User response: ruby - " + q.checkAnswer("ruby"));  // true
        System.out.println("User response: c++ - " + q.checkAnswer("c++"));  // false
    }
}
