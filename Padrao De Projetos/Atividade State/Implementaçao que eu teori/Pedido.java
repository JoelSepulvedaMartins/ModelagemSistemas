public class Pedido {
    private Estado estado;

    public Pedido(long EstoqueMinimo){
        if (EstoqueMinimo < 1000) {
            solicita();
        }else{
        System.exit(0);
        }
    }
    
    public String solicita(){
        this.estado =  new Solicitado();
        return "Solicitado";

    }
    
    public String cotacao(){
        this.estado = this.estado.cotacao();
        return "Cotado";

    }
     public String encomenda(){
        this.estado = this.estado.encomenda();
        return "Encomendado";

    } 
    public String entrega(){
        this.estado = this.estado.entrega();
        return "Faturado";

    }
    public String paga(){
        this.estado = this.estado.paga();
        return "Pago";

    }
    public String rejeita(){
        this.estado = this.estado.rejeita();
        return "Rejeitado";

    }
    public String cancela(){
        this.estado = this.estado.cancela();
        return "Cancelado";

    }
    public String arquiva(){
        this.estado = this.estado.arquiva();
        
        return "FIM";
    }



public static void main(String[] args) {


    Pedido p1 = new Pedido(900);

    String str = p1.solicita(); // deve retornar “Solicitado”
    System.out.println("p1-Estado : " + str);

    
    str = p1.cotacao(); // deve retornar “Cotado”
    System.out.println("p1-Estado : "+str); // deve mostrar “p1-Estado : Cotado”
    
    str = p1.cotacao(); // deve retornar “Cotado” Aqui não houve mudança de estado
    System.out.println("p1-Estado : "+str); // deve mostrar “p1-Estado : Cotado”

    // str = p1.solicita();
    // System.out.println("p1-Estado : "+str); // deve mostrar “p1-Estado : Teste..... nao é pra ele mudar o estado, mas vai acabar printando errado

    str = p1.encomenda(); // deve retornar “Encomendado”
    System.out.println("p1-Estado : "+str); // deve mostrar “p1-Estado : Encomendado”
    
    str = p1.entrega(); // deve retornar “Faturado”
    System.out.println("p1-Estado : "+str);// deve mostrar “p1-Estado : Faturado”
    
    str = p1.paga(); // deve retornar “Pago”
    System.out.println("p1-Estado : "+str); // deve mostrar “p1-Estado : Pago”
    
    str = p1.arquiva(); // deve retornar “FIM”
    System.out.println("p1-Estado : "+str); // deve mostrar “p1-Estado : FIM
    

}


    
}