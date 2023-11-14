
package a.fabrica;

import a.iinterface.PizzaDeCostela;
import a.iinterface.PizzaDeMignon;
import a.iinterface.PizzaDeQueijo;
import a.iinterface.PizzaVegetariana;
import a.modelo.catarinense.PizzaDeCostelaCatarinense;
import a.modelo.catarinense.PizzaDeMignonCatarinense;
import a.modelo.catarinense.PizzaDeQueijoCatarinense;
import a.modelo.catarinense.PizzaVegetarianaCatarinense;


// Concrete Factory para Pizza Catarinense
public class FabricaDePizzaCatarinense implements FabricaDePizza {
    @Override
    public PizzaDeQueijo criarPizzaDeQueijo() {
        return new PizzaDeQueijoCatarinense();
    }

    @Override
    public PizzaVegetariana criarPizzaVegetariana() {
        return new PizzaVegetarianaCatarinense();
    }

    @Override
    public PizzaDeCostela criarPizzaDeCostela() {
        return new PizzaDeCostelaCatarinense();
    }

    @Override
    public PizzaDeMignon criarPizzaDeMignon() {
        return new PizzaDeMignonCatarinense();
    }
}