public class SourdoughBread extends Bread {
    private double sourdoughStarter;

    // constructor
    public SourdoughBread() {
        super(5, 1.5, 2.5, 0, 0, 1, "Sourdough Bread", "Sourdough recipe");
        this.sourdoughStarter = 1.0;
    }

    // Constructor with SourdoughBread parameters
    public SourdoughBread(double flour, double water, double salt, double yeast, double sourdoughStarter) {
        super(flour, water, salt, 0, 0, yeast, "Sourdough Bread", "Sourdough recipe");
        this.sourdoughStarter = sourdoughStarter;
    }

    // Getters and setters for sourdoughStarter
    public double getSourdoughStarter() { return sourdoughStarter; }
    public void setSourdoughStarter(double sourdoughStarter) { this.sourdoughStarter = sourdoughStarter; }

    // Override getIngredients
    @Override
    public String getIngredients() {
        return super.getIngredients() + sourdoughStarter + " cup of ripe sourdough starter\n";
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString();
    }

    // Recipe method
    public String getRecipe() {
        return "1. Mix flour, water, salt, yeast, and sourdough starter.\n" +
                "2. Make the dough\n" +
                "3. Bulk rise\n" +
                "4. Stretch and fold\n" +
                "5. Second rise\n" +
                "6. Preheat oven to 450°F\n" +
                "7. Bake at 400°F for 20 minutes.";
    }
}
