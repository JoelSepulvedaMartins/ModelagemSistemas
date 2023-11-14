
package a.fabrica;


import a.iinterface.PizzaDeCostela;
import a.iinterface.PizzaDeMignon;
import a.iinterface.PizzaDeQueijo;
import a.iinterface.PizzaVegetariana;

// Abstract Factory

public interface FabricaDePizza {
    PizzaDeQueijo criarPizzaDeQueijo();
    PizzaVegetariana criarPizzaVegetariana();
    PizzaDeCostela criarPizzaDeCostela();
    PizzaDeMignon criarPizzaDeMignon();
}
