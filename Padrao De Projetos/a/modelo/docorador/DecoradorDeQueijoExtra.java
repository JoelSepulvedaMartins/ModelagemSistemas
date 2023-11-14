
package a.modelo.docorador;

import a.iinterface.EstrategiaDePreparo;
import a.iinterface.PizzaDeQueijo;


public class DecoradorDeQueijoExtra extends DecoradorDePizza {

    public DecoradorDeQueijoExtra(PizzaDeQueijo pizza, 
            EstrategiaDePreparo estrategiaDePreparo) 
    {
        super(estrategiaDePreparo);
        
        System.out.println(pizza.preparar());
        System.out.println("Queijo Extra");
    }
}
