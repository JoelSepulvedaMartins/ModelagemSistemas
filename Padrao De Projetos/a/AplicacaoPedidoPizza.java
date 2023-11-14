package a;

import a.fabrica.*;
import a.iinterface.EstrategiaDePreparo;
import a.iinterface.PizzaDeCostela;
import a.iinterface.PizzaDeMignon;
import a.iinterface.PizzaDeQueijo;
import a.iinterface.PizzaVegetariana;
import a.modelo.docorador.DecoradorDeCostelasExtra;
import a.modelo.docorador.DecoradorDeMignonExtra;
import a.modelo.docorador.DecoradorDeQueijoExtra;
import a.modelo.docorador.DecoradorDeVegetaisExtra;
import a.modelo.preparo.PreparoPremium;
import a.modelo.preparo.PreparoTradicional;



// Cliente: Exemplo de Uso
public class AplicacaoPedidoPizza {
    
    private static void print(String str){
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        
        // Abstract Factory: Criando uma fábrica para pizza gaúcha
        FabricaDePizza fabricaDePizzaGaucho = new FabricaDePizzaGaucho();


        // Produtos concretos Products para pizza gaúcha
        PizzaDeQueijo pizzaDeQueijoGaucho = fabricaDePizzaGaucho.criarPizzaDeQueijo();
        PizzaVegetariana pizzaVegetarianaGaucho = fabricaDePizzaGaucho.criarPizzaVegetariana();
        PizzaDeCostela pizzaDeCostelaGaucho = fabricaDePizzaGaucho.criarPizzaDeCostela();
        PizzaDeMignon pizzaDeMignonGaucho = fabricaDePizzaGaucho.criarPizzaDeMignon();



        // Exibindo os sabores de pizza gaúcha
        System.out.println("\nPizza Gaúcha:");
        print(pizzaDeQueijoGaucho.preparar());
        print(pizzaVegetarianaGaucho.preparar());
        print(pizzaDeCostelaGaucho.preparar());
        print(pizzaDeMignonGaucho.preparar());



         // Strategy: Aplicando uma estratégia específica
         EstrategiaDePreparo preparoTradicional = new PreparoTradicional();
         EstrategiaDePreparo preparoPremium     = new PreparoPremium();

         // Decorator: Personalizando as pizzas
         System.out.println("\nPersonalizando Pizzas:");

         // Decorando pizza gaúcha de quatro queijos com preparo tradicional
         PizzaDeQueijo extraQueijoPizzaDeQueijoGaucho = new DecoradorDeQueijoExtra(pizzaDeQueijoGaucho, preparoTradicional);
         print(extraQueijoPizzaDeQueijoGaucho.preparar());

         // Decorando pizza gaúcha vegetariana com vegetais extras e preparo premium
         PizzaVegetariana extraVegetaisPizzaVegetarianaGaucho = new DecoradorDeVegetaisExtra(pizzaVegetarianaGaucho, preparoPremium);
         print(extraVegetaisPizzaVegetarianaGaucho.preparar());

         // Decorando pizza gaúcha de costela com costelas extras
         PizzaDeCostela extraCostelasPizzaDeCostelaGaucho = new DecoradorDeCostelasExtra(pizzaDeCostelaGaucho, preparoTradicional);
         print(extraCostelasPizzaDeCostelaGaucho.preparar());

         // Decorando pizza gaúcha de mignon com mignon extra e preparo premium
         PizzaDeMignon extraMignonPizzaDeMignonGaucho = new DecoradorDeMignonExtra(pizzaDeMignonGaucho, preparoPremium);
         print(extraMignonPizzaDeMignonGaucho.preparar());

         // Abstract Factory: Criando uma fábrica para pizza catarinense
         FabricaDePizza fabricaDePizzaCatarinense = new FabricaDePizzaCatarinense();

         // Concrete Products para pizza catarinense
         PizzaDeQueijo pizzaDeQueijoCatarinense = fabricaDePizzaCatarinense.criarPizzaDeQueijo();
         PizzaVegetariana pizzaVegetarianaCatarinense = fabricaDePizzaCatarinense.criarPizzaVegetariana();
         PizzaDeCostela pizzaDeCostelaCatarinense = fabricaDePizzaCatarinense.criarPizzaDeCostela();
         PizzaDeMignon pizzaDeMignonCatarinense = fabricaDePizzaCatarinense.criarPizzaDeMignon();

         // Exibindo os sabores de pizza catarinense
         System.out.println("\nPizza Catarinense:");
         print(pizzaDeQueijoCatarinense.preparar());
         print(pizzaVegetarianaCatarinense.preparar());
         print(pizzaDeCostelaCatarinense.preparar());
         print(pizzaDeMignonCatarinense.preparar());
        
         // acrescente aqui as chamadas para testar o que foi feito


        System.out.println("\n\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Fim Cod Base*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        //Fabrica Curitibana
        FabricaDePizzaCuritibana fabricaDePizzaCuritibana = new FabricaDePizzaCuritibana();

        //Criando Sabores
        PizzaDeQueijo pizzaDeQueijoCuritibana = fabricaDePizzaCuritibana.criarPizzaDeQueijo();
        PizzaVegetariana pizzaVegetarianaCuritibana = fabricaDePizzaCuritibana.criarPizzaVegetariana();
        PizzaDeCostela pizzaDeCostelaCuritibana = fabricaDePizzaCuritibana.criarPizzaDeCostela();
        PizzaDeMignon pizzaDeMignonCuritibana = fabricaDePizzaCuritibana.criarPizzaDeMignon();


        // Exibindo os sabores de pizza gaúcha
        System.out.println("\n=====================Pizza Curitibana:=====================");
        print(pizzaDeQueijoCuritibana.preparar());
        print(pizzaVegetarianaCuritibana.preparar());
        print(pizzaDeCostelaCuritibana.preparar());
        print(pizzaDeMignonCuritibana.preparar());


        //Fabrica Sao Jose Dos Pinhais
        FabricaDePizzaSaoJoseDosPinhais fabricaDePizzaSaoJoseDosPinhais = new FabricaDePizzaSaoJoseDosPinhais();

        //Criando Sabores
        PizzaDeQueijo pizzaDeQueijoSaoJoseDosPinhais = fabricaDePizzaSaoJoseDosPinhais.criarPizzaDeQueijo();
        PizzaVegetariana pizzaVegetarianaSaoJoseDosPinhais = fabricaDePizzaSaoJoseDosPinhais.criarPizzaVegetariana();
        PizzaDeCostela pizzaDeCostelaSaoJoseDosPinhais = fabricaDePizzaSaoJoseDosPinhais.criarPizzaDeCostela();
        PizzaDeMignon pizzaDeMignonSaoJoseDosPinhais = fabricaDePizzaSaoJoseDosPinhais.criarPizzaDeMignon();


        // Exibindo os sabores de pizza gaúcha
        System.out.println("\n=====================Pizza de Sao Jose dos Pinhais:=====================");
        print(pizzaDeQueijoSaoJoseDosPinhais.preparar());
        print(pizzaVegetarianaSaoJoseDosPinhais.preparar());
        print(pizzaDeCostelaSaoJoseDosPinhais.preparar());
        print(pizzaDeMignonSaoJoseDosPinhais.preparar());

        System.out.println("\n=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>Fabrica de Pizzas:=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");

         // Decorator: Personalizando as pizzas
        System.out.println("\n**********************************Personalizando Pizzas Curitibanas:**********************************");
        System.out.println("\n");
         // Decorando pizza gaúcha de quatro queijos com preparo tradicional
         PizzaDeQueijo extraQueijoPizzaDeQueijoCuritibana = new DecoradorDeQueijoExtra(pizzaDeQueijoCuritibana, preparoTradicional);
         print(extraQueijoPizzaDeQueijoCuritibana.preparar());

         System.out.println("\n////////////////////////////////////////////////////////////////////////");

         // Decorando pizza gaúcha vegetariana com vegetais extras e preparo premium
         PizzaVegetariana extraVegetaisPizzaVegetarianaCuritibana = new DecoradorDeVegetaisExtra(pizzaVegetarianaCuritibana, preparoPremium);
         print(extraVegetaisPizzaVegetarianaCuritibana.preparar());
         System.out.println("\n////////////////////////////////////////////////////////////////////////");

        // Decorando pizza gaúcha de costela com costelas extras
         PizzaDeCostela extraCostelasPizzaDeCostelaCuritibana = new DecoradorDeCostelasExtra(pizzaDeCostelaCuritibana, preparoTradicional);
         print(extraCostelasPizzaDeCostelaCuritibana.preparar());
         System.out.println("\n////////////////////////////////////////////////////////////////////////");

        // Decorando pizza gaúcha de mignon com mignon extra e preparo premium
         PizzaDeMignon extraMignonPizzaDeMignonCuritibana = new DecoradorDeMignonExtra(pizzaDeMignonCuritibana, preparoPremium);
         print(extraMignonPizzaDeMignonCuritibana.preparar());

        // Decorator: Personalizando as pizzas
        System.out.println("\n**********************************Personalizando Pizzas Sao Jose Dos Pinhais:**********************************");
        System.out.println("\n");

        // Decorando pizza gaúcha de quatro queijos com preparo tradicional
        PizzaDeQueijo extraQueijoPizzaDeQueijoSaoJoseDosPinhais = new DecoradorDeQueijoExtra(pizzaDeQueijoSaoJoseDosPinhais, preparoTradicional);
        print(extraQueijoPizzaDeQueijoSaoJoseDosPinhais.preparar());
        System.out.println("\n////////////////////////////////////////////////////////////////////////");

        // Decorando pizza gaúcha vegetariana com vegetais extras e preparo premium
        PizzaVegetariana extraVegetaisPizzaVegetarianaSaoJoseDosPinhais = new DecoradorDeVegetaisExtra(pizzaVegetarianaSaoJoseDosPinhais, preparoPremium);
        print(extraVegetaisPizzaVegetarianaSaoJoseDosPinhais.preparar());
        System.out.println("\n////////////////////////////////////////////////////////////////////////");

        // Decorando pizza gaúcha de costela com costelas extras
        PizzaDeCostela extraCostelasPizzaDeCostelaSaoJoseDosPinhais = new DecoradorDeCostelasExtra(pizzaDeCostelaSaoJoseDosPinhais, preparoTradicional);
        print(extraCostelasPizzaDeCostelaSaoJoseDosPinhais.preparar());
        System.out.println("\n////////////////////////////////////////////////////////////////////////");

        // Decorando pizza gaúcha de mignon com mignon extra e preparo premium
        PizzaDeMignon extraMignonPizzaDeMignonSaoJoseDosPinhais = new DecoradorDeMignonExtra(pizzaDeMignonSaoJoseDosPinhais, preparoPremium);
        print(extraMignonPizzaDeMignonSaoJoseDosPinhais.preparar());








    }
}
