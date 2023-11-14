
package a.fabrica;

import a.iinterface.PizzaDeCostela;
import a.iinterface.PizzaDeMignon;
import a.iinterface.PizzaDeQueijo;
import a.iinterface.PizzaVegetariana;
import a.modelo.gaucho.PizzaDeCostelaGaucho;
import a.modelo.gaucho.PizzaDeMignonGaucho;
import a.modelo.gaucho.PizzaDeQueijoGaucho;
import a.modelo.gaucho.PizzaVegetarianaGaucho;


// Concrete Factory para Pizza Gaúcha

public class FabricaDePizzaGaucho implements FabricaDePizza {

    @Override
    public PizzaDeQueijo criarPizzaDeQueijo() {
        return new PizzaDeQueijoGaucho();
    }

    @Override
    public PizzaVegetariana criarPizzaVegetariana() {
        return new PizzaVegetarianaGaucho();
    }

    @Override
    public PizzaDeCostela criarPizzaDeCostela() {
        return new PizzaDeCostelaGaucho();
    }

    @Override
    public PizzaDeMignon criarPizzaDeMignon() {
        return new PizzaDeMignonGaucho();
    }
}
