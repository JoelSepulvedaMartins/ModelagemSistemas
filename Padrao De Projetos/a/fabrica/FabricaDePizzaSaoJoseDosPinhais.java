
package a.fabrica;

import a.iinterface.PizzaDeCostela;
import a.iinterface.PizzaDeMignon;
import a.iinterface.PizzaDeQueijo;
import a.iinterface.PizzaVegetariana;

import a.modelo.saojosedospinhais.PizzaDeQueijoSaoJoseDosPinhais;
import a.modelo.saojosedospinhais.PizzaDeCostelaSaoJoseDosPinhais;
import a.modelo.saojosedospinhais.PizzaVegetarianaSaoJoseDosPinhais;
import a.modelo.saojosedospinhais.PizzaDeMignonSaoJoseDosPinhais;


// Concrete Factory para Pizza
public class FabricaDePizzaSaoJoseDosPinhais implements FabricaDePizza {
    @Override
    public PizzaDeQueijo criarPizzaDeQueijo() {
        return new PizzaDeQueijoSaoJoseDosPinhais();
    }

    @Override
    public PizzaVegetariana criarPizzaVegetariana() {
        return new PizzaVegetarianaSaoJoseDosPinhais();
    }

    @Override
    public PizzaDeCostela criarPizzaDeCostela() {
        return new PizzaDeCostelaSaoJoseDosPinhais();
    }

    @Override
    public PizzaDeMignon criarPizzaDeMignon() {
        return new PizzaDeMignonSaoJoseDosPinhais();
    }
}