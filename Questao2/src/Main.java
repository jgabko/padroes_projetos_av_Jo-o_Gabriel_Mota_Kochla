public class Main {
    public static void main(String[] args) {
      //  new Assinatura(new FactoryAssinBR()).finalizar(1000.00);
       // new Assinatura(new FactoryAssinMX()).finalizar(1000.00);

        IFactoryAssin fact_br=new FactoryAssinBR();
        IFactoryAssin fact_mx=new FactoryAssinMX();



        Assinatura assin_br= new Assinatura(fact_br);
        Assinatura assin_mx= new Assinatura(fact_mx);

        assin_br.resumo(100);
        assin_mx.resumo(100);


    }
}
