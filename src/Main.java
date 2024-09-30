public class Main {
    public static void main(String[] args) {
        // subclasses of Bread
        SourdoughBread sourdough = new SourdoughBread();
        Pastry pastry = new Pastry();

        // Display recipes and ingredients
        System.out.println("Sourdough Bread class testing");
        System.out.println("Ingredients of Sourdough Bread are:\n" + sourdough.getIngredients());
        System.out.println("A recipe of Sourdough Bread:\n" + sourdough.getRecipe());
        sourdough.bake();
        sourdough.bake();

        System.out.println("\nPastry class testing");
        System.out.println("Ingredients of Pastry are:\n" + pastry.getIngredients());
        System.out.println("A recipe of Pastry:\n" + pastry.getRecipe());
        pastry.bake();
    }
}
