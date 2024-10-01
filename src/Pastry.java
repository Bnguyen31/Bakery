public class Pastry extends Bread {
    private double butter;

    // constructor for Pastry
    public Pastry() {
        super(3, 1, 0.5, 2, 1, 0, "Pastry", "Pastry recipe");
        this.butter = 1.5;
    }

    // Constructor with Pastry parameters
    public Pastry(double flour, double water, double salt, double sugar, double bakingPowder, double butter) {
        super(flour, water, salt, sugar, bakingPowder, 0, "Pastry", "Pastry recipe");
        this.butter = butter;
    }

    // Getters and setters for butter
    public double getButter() { return butter; }
    public void setButter(double butter) { this.butter = butter; }

    // Override getIngredients
    @Override
    public String getIngredients() {
        return super.getIngredients() + butter + " cups of butter\n";
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString();
    }

    // Recipe method
    public String getRecipe() {
        return "1. Mix flour, water, salt, sugar, and butter.\n" +
                "2. Fold the dough\n" +
                "3. Chill for 30 minutes\n" +
                "4. Roll and shape\n" +
                "5. Bake at 375°F for 15-20 minutes.";
    }
}
