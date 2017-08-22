public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling egg = new SandwichFilling("Egg", 120);
        SandwichFilling ham = new SandwichFilling("Ham", 300);
        SandwichFilling cheese = new SandwichFilling("Cheese", 630);
        System.out.println(egg.getFillingType() + " has " + egg.getCaloriesPerServe() + " calories per serve.");
        System.out.println(ham.getFillingType() + " has " + ham.getCaloriesPerServe() + " calories per serve.");
        System.out.println(cheese.getFillingType() + " has " + cheese.getCaloriesPerServe() + " calories per serve.");
    }
}
