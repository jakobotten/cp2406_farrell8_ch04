public class SandwichFilling {
    private String fillingType;
    private int caloriesPerServe;
    public SandwichFilling(String fillingType, int caloriesPerServe){
        this.fillingType = fillingType;
        this.caloriesPerServe = caloriesPerServe;
    }
    public String getFillingType() {
        return this.fillingType;
    }
    public int getCaloriesPerServe() {
        return this.caloriesPerServe;
    }
}
