public class TestBread {
    public static void main(String[] args) {
        Bread white = new Bread("White", 120);
        Bread rye = new Bread("Rye", 80);
        Bread wholemeal = new Bread("Wholemeal", 95);
        System.out.println(white.getType() + " bread has " + white.getCaloriesPerSlice() + " calories per slice.");
        System.out.println(rye.getType() + " bread has " + rye.getCaloriesPerSlice() + " calories per slice.");
        System.out.println(wholemeal.getType() + " bread has " + wholemeal.getCaloriesPerSlice() + " calories per slice.");
        System.out.println(Bread.MOTTO);
    }
}
