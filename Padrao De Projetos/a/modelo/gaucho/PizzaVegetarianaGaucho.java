
package a.modelo.gaucho;

import a.iinterface.PizzaVegetariana;


public class PizzaVegetarianaGaucho implements PizzaVegetariana {

    @Override
    public String preparar() {
        return "Pizza Gaúcha Vegetariana";
    }
}