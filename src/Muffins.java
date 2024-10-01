public class Muffins extends Bread {
    private double milk;

    public Muffins() {
        super(2.50, 0.0, 0.25, 0.50, 1.00, 0.0, "Muffins",
                "1. Mix flour, sugar, baking powder, and milk.\n" +
                        "2. Spoon the batter into muffin cups.\n" +
                        "3. Preheat the oven to 375°F.\n" +
                        "4. Bake at 375°F for 18-20 minutes, until golden brown.\n" +
                        "5. Let the muffins cool before eating."
        );
        this.milk = 1.00;
    }

    public double getMilk() { return milk; }
    public void setMilk(double milk) { this.milk = milk; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + milk + " cups of milk";
    }

    @Override
    public String toString() {
        return "Ingredients of Muffins are:\n" + getIngredients() + "\n\nA recipe of Muffins:\n" + recipe;
    }
}
