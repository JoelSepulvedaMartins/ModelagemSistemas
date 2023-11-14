
package a.modelo.docorador;

import a.iinterface.EstrategiaDePreparo;
import a.iinterface.PizzaDeCostela;
import a.iinterface.PizzaDeMignon;
import a.iinterface.PizzaDeQueijo;
import a.iinterface.PizzaVegetariana;


// Decorator: Decoradores para Pizzas
public abstract class DecoradorDePizza 
        implements  PizzaDeQueijo, 
                    PizzaVegetariana, 
                    PizzaDeCostela, 
                    PizzaDeMignon {

    protected EstrategiaDePreparo estrategiaDePreparo;

    public DecoradorDePizza(EstrategiaDePreparo estrategiaDePreparo) {
        this.estrategiaDePreparo = estrategiaDePreparo;
    }

    @Override
    public String preparar() {
        return ("Preparando a pizza com:\n" + estrategiaDePreparo.preparar());
    }
}