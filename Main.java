public class Main{

    public static void main(String[] args) {
        Pizza order1 = new PizzaBuilder().setSize("small").setPepperoni("Pepperoni").setSausage("Sausage").eat();
        Pizza order2 = new PizzaBuilder().setSize("Large").setPepperoni("pepperoni").setBacon("bacon").eat();
        Pizza order3 = new PizzaBuilder().setSize("Medium").setPepperoni("Pepperoni").setSausage("Sausage").setBacon("bacon").eat();
        Pizza order4 = new PizzaBuilder().setSize("small").setPepperoni("Pepperoni").setSausage("Sausage").eat();
        Pizza order5 = new PizzaBuilder().setSize("small").setPepperoni("Pepperoni").setSausage("Sausage").eat();
        Pizza order6= new PizzaBuilder().setSize("large").setPepperoni("Pepperoni").setSausage("Sausage").eat();

        System.out.println(order1.getOrder1());
        System.out.println(order2.getOrder2());
        System.out.println(order3.getOrder3());
        System.out.println(order4.getOrder4());
        System.out.println(order5.getOrder5());
        System.out.println(order6.getOrder6());
    }

}