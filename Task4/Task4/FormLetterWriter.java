public class FormLetterWriter {
    public static void displaySalutation(String lastName){
        System.out.println("Dear Mr. " + lastName);
        System.out.println("Thank you for your recent order.");
    }
    public static void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order.");
    }

    public static void main(String[] args) {
        displaySalutation("Otten");
        displaySalutation("Jake", "Otten");
    }
}
