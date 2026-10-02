public class FactoryFreteAr implements IFreteFactory{
    public ABSFrete criarFrete(){
        return new FreteAr();
    }
}
