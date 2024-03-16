//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pizza{
    String sausage;
    String pepperoni;
    String chicken;
    String bacon;
    String ham;
    String spicyPork;
    String beef;
    String mushrooms;
    String onions;
     String extraCheese;
     String peppers;
     String olives;
     String spinach;
     String tomatoBasil;
     String pesto;
     String hamPineapple;
     String size;
     String chain;


    public String getSausage() {
        return sausage;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public String getChicken() {
        return chicken;
    }

    public String getBacon() {
        return bacon;
    }

    public String getHam() {
        return ham;
    }

    public String getSpicyPork() {
        return spicyPork;
    }

    public String getBeef() {
        return beef;
    }

    public String getMushrooms() {
        return mushrooms;
    }

    public String getOnions() {
        return onions;
    }

    public String getExtraCheese() {
        return extraCheese;
    }

    public String getPeppers() {
        return peppers;
    }

    public String getOlives() {
        return olives;
    }

    public String getSpinach() {
        return spinach;
    }

    public String getTomatoBasil() {
        return tomatoBasil;
    }

    public String getPesto() {
        return pesto;
    }

    public String getHamPineapple() {
        return hamPineapple;
    }

    public String getSize() {
        return size;
    }

    public String getChain() {
        return chain;
    }

    public Pizza(String hamPineapple, String chain, String size, String pepperoni, String sausage, String ham, String mushrooms, String bacon, String onions, String extraCheese, String peppers, String chicken, String olives, String spinach, String tomatoBasil, String beef, String pesto, String spicyPork) {

        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.ham = ham;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.tomatoBasil = tomatoBasil;
        this.spinach = spinach;
        this.spicyPork = spicyPork;
        this.beef = beef;
        this.pesto = pesto;
        this.hamPineapple = hamPineapple;
        this.size = size;
        this.chain = chain;



    }

    public String getOrder1() {
        return "Pizza Size: " + size + " Pizza with: " + pepperoni + " " + sausage;
    }
    public String getOrder2() {

        return "Pizza Size: " + size + " Pizza with: " + pepperoni + " " + bacon + " " + sausage;
    }

    public String getOrder3(){
        return "Pizza Size: " + size + " Pizza with: " + pepperoni + " " + sausage + " " +chicken + " " + ham + " " +spinach+ " "+ onions;
    }

    public String getOrder4(){
        return "Pizza Size: " + size + " Pizza with: " + pepperoni + " " + sausage + " " +bacon + " " + pesto + " " +peppers + " " + sausage + " " + olives + " "+ mushrooms;
    }

    public String getOrder5(){
        return "Pizza Size: " + size + " Pizza with: " + chicken;
    }

    public String getOrder6(){
        return "Pizza Size: " + size + " Pizza with: " + pepperoni + " " + sausage + " " +bacon;
    }
}
