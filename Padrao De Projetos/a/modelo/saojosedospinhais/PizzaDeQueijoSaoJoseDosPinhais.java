
package a.modelo.saojosedospinhais;

import a.iinterface.PizzaDeQueijo;


// Concrete Products para Pizza Catarinense
public class PizzaDeQueijoSaoJoseDosPinhais implements PizzaDeQueijo {

    @Override
    public String preparar() {
        return "Pizza SaoJoseDosPinhais de Quatro Queijos";
    }
}
