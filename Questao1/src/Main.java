public class Main {
    public static void main(String[] args){
        IFreteFactory ar_fact=new FactoryFreteAr();
        IFreteFactory mar_fact= new FactoryFreteMar();
        IFreteFactory rod_fact= new FactoryFreteRod();
        //===============================================

        ABSFrete ar_frete= ar_fact.criarFrete();
        ABSFrete mar_frete= mar_fact.criarFrete();
        ABSFrete rod_frete= rod_fact.criarFrete();

        //===============================================

        ar_frete.setCarga(100,"João");
        mar_frete.setCarga(100,"Gabriel");
        rod_frete.setCarga(100,"João II");

        System.out.println(ar_frete.resumo());
        System.out.println("-------------------------------");
        System.out.println(mar_frete.resumo());
        System.out.println("-------------------------------");
        System.out.println(rod_frete.resumo());



    }
}
