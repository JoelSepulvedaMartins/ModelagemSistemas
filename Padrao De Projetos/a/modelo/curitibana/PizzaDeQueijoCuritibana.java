
package a.modelo.curitibana;

import a.iinterface.PizzaDeQueijo;


// Concrete Products para Pizza Catarinense
public class PizzaDeQueijoCuritibana implements PizzaDeQueijo {

    @Override
    public String preparar() {
        return "Pizza curitibana de Quatro Queijos";
    }
}
