public class Sandwich {

    private Bread myBread;
    private SandwichFilling myFilling;


    public Sandwich(String breadType, int breadCalories, String fillingType, int fillingCalories){
        myBread = new Bread(breadType, breadCalories);
        myFilling = new SandwichFilling(fillingType, fillingCalories);
    }

    public int getTotalCalories(){
        return myBread.getCaloriesPerSlice()*2 + myFilling.getCaloriesPerServe();
    }
    public String getFilling(){
        return myFilling.getFillingType();
    }

    public String getBreadType() {
        return myBread.getType();
    }


}
