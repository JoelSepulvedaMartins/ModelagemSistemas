
package a.fabrica;

import a.iinterface.PizzaDeCostela;
import a.iinterface.PizzaDeMignon;
import a.iinterface.PizzaDeQueijo;
import a.iinterface.PizzaVegetariana;

import a.modelo.curitibana.PizzaDeQueijoCuritibana;
import a.modelo.curitibana.PizzaDeCostelaCuritibana;
import a.modelo.curitibana.PizzaVegetarianaCuritibana;
import a.modelo.curitibana.PizzaDeMignonCuritibana;


// Concrete Factory para Pizza
public class FabricaDePizzaCuritibana implements FabricaDePizza {
    @Override
    public PizzaDeQueijo criarPizzaDeQueijo() {
        return new PizzaDeQueijoCuritibana();
    }

    @Override
    public PizzaVegetariana criarPizzaVegetariana() {
        return new PizzaVegetarianaCuritibana();
    }

    @Override
    public PizzaDeCostela criarPizzaDeCostela() {
        return new PizzaDeCostelaCuritibana();
    }

    @Override
    public PizzaDeMignon criarPizzaDeMignon() {
        return new PizzaDeMignonCuritibana();
    }
}