public class Brioche extends Bread {
    private double eggs;
    private double butter;

    public Brioche() {
        super(3.00, 0.0, 0.25, 1.00, 0.0, 1.00, "Brioche",
                "1. Mix flour, sugar, yeast, eggs, and butter.\n" +
                        "2. Knead the dough until smooth.\n" +
                        "3. Let the dough rise.\n" +
                        "4. Shape the dough and let it rise again.\n" +
                        "5. Preheat oven to 350°F.\n" +
                        "6. Bake the brioche at 350°F for 30-35 minutes, until golden brown.\n" +
                        "7. Let the brioche cool before eating."
        );
        this.eggs = 2.00;
        this.butter = 0.50;
    }

    public double getEggs() { return eggs; }
    public void setEggs(double eggs) { this.eggs = eggs; }

    public double getButter() { return butter; }
    public void setButter(double butter) { this.butter = butter; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + eggs + " eggs\n" + butter + " cups of butter";
    }

    @Override
    public String toString() {
        return "Ingredients of Brioche are:\n" + getIngredients() + "\n\nA recipe of Brioche:\n" + recipe;
    }
}
