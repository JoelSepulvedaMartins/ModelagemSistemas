
package a.modelo.gaucho;

import a.iinterface.PizzaDeCostela;


public class PizzaDeCostelaGaucho implements PizzaDeCostela {
 
    @Override
    public String preparar() {
        return "Pizza Gaúcha de Costela";
    }
}