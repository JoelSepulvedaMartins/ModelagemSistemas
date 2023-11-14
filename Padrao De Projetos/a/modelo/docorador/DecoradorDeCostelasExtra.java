
package a.modelo.docorador;

import a.iinterface.EstrategiaDePreparo;
import a.iinterface.PizzaDeCostela;


public class DecoradorDeCostelasExtra extends DecoradorDePizza {
    
    public DecoradorDeCostelasExtra(PizzaDeCostela pizza, 
            EstrategiaDePreparo estrategiaDePreparo) {
        
        super(estrategiaDePreparo);
        
        System.out.println(pizza.preparar());
        System.out.println("Costelas Extras");
    }
}