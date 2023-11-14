
package a.modelo.gaucho;

import a.iinterface.PizzaDeMignon;


public class PizzaDeMignonGaucho implements PizzaDeMignon {

    @Override
    public String preparar() {
        return "Pizza Gaúcha de Mignon";
    }
}