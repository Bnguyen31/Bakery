public class Bread {
    // Variables for Bread
    protected double flour;
    protected double water;
    protected double salt;
    protected double sugar;
    protected double bakingPowder;
    protected double yeast;
    protected String breadName;
    protected String state;  // either "baked" or "not baked"
    protected String recipe;

    //constructor
    public Bread() {
        this.flour = 0;
        this.water = 0;
        this.salt = 0;
        this.sugar = 0;
        this.bakingPowder = 0;
        this.yeast = 0;
        this.breadName = "Generic Bread";
        this.state = "not baked";
        this.recipe = "General bread recipe";
    }

    // Constructor with parameters for the bread types
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = "not baked";
        this.recipe = recipe;
    }

    // Getters and setters for the ingredients
    public double getFlour() { return flour; }
    public void setFlour(double flour) { this.flour = flour; }

    public double getWater() { return water; }
    public void setWater(double water) { this.water = water; }

    public double getSalt() { return salt; }
    public void setSalt(double salt) { this.salt = salt; }

    public double getSugar() { return sugar; }
    public void setSugar(double sugar) { this.sugar = sugar; }

    public double getBakingPowder() { return bakingPowder; }
    public void setBakingPowder(double bakingPowder) { this.bakingPowder = bakingPowder; }

    public double getYeast() { return yeast; }
    public void setYeast(double yeast) { this.yeast = yeast; }

    public String getBreadName() { return breadName; }
    public void setBreadName(String breadName) { this.breadName = breadName; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getRecipe() { return recipe; }
    public void setRecipe(String recipe) { this.recipe = recipe; }

    @Override
    public String toString() {
        return "Bread: " + breadName + "\nState: " + state + "\nRecipe: " + recipe;
    }

    // Bake method
    public void bake() {
        if (state.equals("baked")) {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        } else {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        }
    }

    public String getIngredients() {
        return flour + " cups of flour\n" +
                water + " cups of water\n" +
                salt + " tsps of salt\n" +
                sugar + " tsps of sugar\n" +
                bakingPowder + " tsps of baking powder\n" +
                yeast + " tsps of yeast\n";
    }
}