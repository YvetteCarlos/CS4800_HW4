import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface MacroFactory{
    String createCarb();
    String createProtein();
    String createFat();
}
class CarbsFactory implements MacroFactory{
        private static CarbsFactory instance;
        private CarbsFactory(){}

        public static CarbsFactory getInstance(){
            if (instance == null){
                instance = new CarbsFactory();
            }
            return instance;
        }
        @Override
        public String createCarb(){
            String[] options = {"Bread", "Lentils", "Pistachio", "Cheese"};
            return options[new Random().nextInt(options.length)];
        }
        @Override
        public String createProtein(){
            String[] options = {"Fish", "Chicken", "Beef", "Tofu"};
            return options[new Random().nextInt(options.length)];
        }
        @Override
        public String createFat(){
            String[] options = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
            return options[new Random().nextInt(options.length)];
        }

    }

    class ProteinFactory implements MacroFactory{
        private static ProteinFactory instance;
        private ProteinFactory(){}
        public static ProteinFactory getInstance(){
            if (instance == null){
                instance = new ProteinFactory();
            }
            return instance;
        }

        @Override
        public String createCarb(){
            String[] options = {"Bread", "Lentils", "Pistachio", "Cheese"};
            return options[new Random().nextInt(options.length)];
        }
        @Override
        public String createProtein(){
            String[] options = {"Fish", "Chicken", "Beef", "Tofu", "Cheese"};
            return options[new Random().nextInt(options.length)];
        }
        @Override
        public String createFat(){
            String[] options = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
            return options[new Random().nextInt(options.length)];
        }
    }

    class FatsFactory implements MacroFactory{
        private static FatsFactory instance;
        private FatsFactory(){}

        public static FatsFactory getInstance(){
            if (instance == null){
                instance = new FatsFactory();
            }
            return instance;
        }

        @Override
        public String createCarb(){
            String[] options = {"Bread", "Lentils", "Pistachio", "Cheese"};
            return options[new Random().nextInt(options.length)];
        }
        @Override
        public String createProtein(){
            String[] options = {"Fish", "Chicken", "Beef", "Tofu"};
            return options[new Random().nextInt(options.length)];
        }
        @Override
        public String createFat(){
            String[] options = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
            return options[new Random().nextInt(options.length)];
        }
    }
abstract class Categories {
    public abstract void makeDiet(MacroFactory factory);
    public static class NoRestrictions extends Categories {
        @Override
        public void makeDiet(MacroFactory factory){
            System.out.println("No Restrictions meal plan: ");
            System.out.println("Carb: " + factory.createCarb());
            System.out.println("Protein: " + factory.createProtein());
            System.out.println("Fat: " + factory.createFat());

        }

    }

    public static class Vegan extends Categories {
        @Override
        public void makeDiet(MacroFactory factory){
            System.out.println("Vegan meal plan: ");
            System.out.println("Carb: " + factory.createCarb());
            System.out.println("Protein: " + factory.createProtein());
            System.out.println("Fat: " + factory.createFat());
        }

    }

    public static class Paleo extends Categories {
        @Override
        public void makeDiet(MacroFactory factory){
            System.out.println("Paleo meal plan: ");
            System.out.println("Carb: " + factory.createCarb());
            System.out.println("Protein: " + factory.createProtein());
            System.out.println("Fat: " + factory.createFat());
        }

    }

    public static class NutAllergy extends Categories {
        @Override
        public void makeDiet(MacroFactory factory){
            System.out.println("Nut allergy meal plan: ");
            System.out.println("Carb: " + factory.createCarb());
            System.out.println("Protein: " + factory.createProtein());
            System.out.println("Fat: " + factory.createFat());
        }

    }
}
public class MacroNutrients {
    static class Customer{
        String name;
        Categories dietPlan;

        public Customer(String name, Categories dietPlan){
            this.name = name;
            this.dietPlan = dietPlan;
        }

        public void makeMealPlan(MacroFactory factory){
            System.out.println("Meal Plan for customer: " + name);
            dietPlan.makeDiet(factory);
        }
    }
    public static void main(String[] args) {
        MacroFactory factory = CarbsFactory.getInstance();
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Yvette", new Categories.NoRestrictions()));
        customers.add(new Customer("Jason", new Categories.Paleo()));
        customers.add(new Customer("Malia", new Categories.NutAllergy()));
        customers.add(new Customer("Alex", new Categories.Vegan()));
        customers.add(new Customer("Joe", new Categories.NoRestrictions()));
        customers.add(new Customer("Tom", new Categories.NoRestrictions()));


        for (Customer customer : customers) {

            customer.makeMealPlan(factory);
        }
    }
}
