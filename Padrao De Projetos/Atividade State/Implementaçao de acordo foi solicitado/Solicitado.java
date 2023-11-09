public class Solicitado extends Estado {


    @Override  public Estado cotacao(){
        //System.out.println("Teste para ver se mudou ou nao de estado");
        return new Cotado();

    }


}