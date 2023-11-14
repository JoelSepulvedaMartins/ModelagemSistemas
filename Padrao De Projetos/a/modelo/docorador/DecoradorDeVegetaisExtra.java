
package a.modelo.docorador;

import a.iinterface.EstrategiaDePreparo;
import a.iinterface.PizzaVegetariana;


public class DecoradorDeVegetaisExtra extends DecoradorDePizza {
    public DecoradorDeVegetaisExtra(PizzaVegetariana pizza, EstrategiaDePreparo estrategiaDePreparo) {
        super(estrategiaDePreparo);
        
        System.out.println(pizza.preparar());
        System.out.println("Vegetais Extras");
    }
}