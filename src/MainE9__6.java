public class MainE9__6 {
    public static void main(String[] args) {
        FillInQuestion q = new FillInQuestion("The inventor of Java was _James Gosling_");

        System.out.println(q.getText()); 

        System.out.println("User response: James Gosling - " + q.checkAnswer("James Gosling")); 
        System.out.println("User response: james gosling - " + q.checkAnswer("james gosling")); 
        System.out.println("User response: Gosling - " + q.checkAnswer("Gosling")); 
    }
}
