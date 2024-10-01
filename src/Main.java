public class Main {
    public static void main(String[] args) {
        SourdoughBread sourdough = new SourdoughBread();
        Pastry pastry = new Pastry();
        Muffins muffins = new Muffins();
        Brioche brioche = new Brioche();

        // Display recipes and ingredients for Sourdough Bread
        System.out.println(sourdough);
        sourdough.bake();  // First bake
        sourdough.bake();  // Second bake attempt (should say already baked)

        // Display recipes and ingredients for Pastry
        System.out.println("\n" + pastry);
        pastry.bake();  // First bake as well
        pastry.bake();  // Second bake attempt (should say already baked)

        // Display recipes and ingredients for Muffins
        System.out.println("\n" + muffins);
        muffins.bake();  // First bake for the next
        muffins.bake();  // Second bake attempt (should say already baked)

        // Display recipes and ingredients for Brioche
        System.out.println("\n" + brioche);
        brioche.bake();  // First bake
        brioche.bake();  // Second bake attempt (should say already baked)
    }
}
