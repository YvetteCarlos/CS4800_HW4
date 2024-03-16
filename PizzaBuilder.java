
public class PizzaBuilder {
    private String pepperoni;
    private String sausage;
    private String chicken;
    private String bacon;
    private String ham;
    private String spicyPork;
    private String beef;
    private String mushrooms;
    private String onions;
    private String extraCheese;
    private String peppers;
    private String olives;
    private String spinach;
    private String tomatoBasil;
    private String pesto;
    private String hamPineapple;
    private String size;
    private String chain;

    public PizzaBuilder(){
    }
    public PizzaBuilder setPepperoni(String pepperoni){
       this.pepperoni = pepperoni;
       return this;
    }

    public PizzaBuilder setSausage(String sausage){
        this.sausage = sausage;
        return this;
    }

    public PizzaBuilder setChicken(String chicken){
        this.chicken = chicken;
        return this;

    }

    public PizzaBuilder setBacon(String bacon){
        this.bacon = bacon;
        return this;

    }

    public PizzaBuilder setHam(String ham){
        this.ham = ham;
        return this;

    }

    public PizzaBuilder setSpicyPork(String spicyPork){
        this.spicyPork = spicyPork;
        return this;

    }

    public PizzaBuilder setBeef(String beef){
        this.beef = beef;
        return this;

    }

    public PizzaBuilder setMushrooms(String mushrooms){
        this.mushrooms = mushrooms;
        return this;
    }

    public PizzaBuilder setOnions(String onions){
        this.onions = onions;
        return this;
    }

    public PizzaBuilder setExtraCheese(String extraCheese){
        this.extraCheese = extraCheese;
        return this;

    }

    public PizzaBuilder setPeppers(String peppers){
        this.peppers = peppers;
        return this;

    }

    public PizzaBuilder setOlives(String olives){
        this.olives = olives;
        return this;

    }

    public PizzaBuilder setSpinach(String spinach){
        this.spinach = spinach;
        return this;

    }

    public PizzaBuilder setPesto(String pesto){
        this.pesto = pesto;
        return this;

    }

    public PizzaBuilder setTomatoBasil(String tomatoBasil){
        this.tomatoBasil = tomatoBasil;
        return this;

    }

    public PizzaBuilder setHamPineapple(String hamPineapple){
        this.hamPineapple = hamPineapple;
        return this;

    }

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder chain(String chain){
        this.size = size;
        return this;
    }


    public Pizza eat(){
        return new Pizza(pepperoni, sausage, ham, mushrooms,bacon,onions,extraCheese,peppers,chicken, olives,spinach,tomatoBasil,beef,pesto,spicyPork,hamPineapple,size,chain );
    }

    }





