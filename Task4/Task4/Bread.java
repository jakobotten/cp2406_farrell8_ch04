public class Bread {

    private String type;
    private int caloriesPerSlice;
    public final static String MOTTO = "The staff of life";

    public Bread(String type, int caloriesPerSlice) {
        this.type = type;
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public String getType() {
        return this.type;
    }

    public int getCaloriesPerSlice() {
        return this.caloriesPerSlice;
    }
}
