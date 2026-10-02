public class FactoryFreteMar implements IFreteFactory{
    public ABSFrete criarFrete(){
        return new FreteMar();
    }
}
