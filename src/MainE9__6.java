public class MainE9__6 {
    public static void main(String[] args) {
        FillInQuestion q = new FillInQuestion("The inventor of Java was _James Gosling_");

        System.out.println(q.getText());  // Should display: "The inventor of Java was _____"

        System.out.println("User response: James Gosling - " + q.checkAnswer("James Gosling"));  // true
        System.out.println("User response: james gosling - " + q.checkAnswer("james gosling"));  // true
        System.out.println("User response: Gosling - " + q.checkAnswer("Gosling"));  // false
    }
}
