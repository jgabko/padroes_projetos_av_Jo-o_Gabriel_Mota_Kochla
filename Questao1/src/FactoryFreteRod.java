public class FactoryFreteRod implements IFreteFactory {
    public ABSFrete criarFrete(){
        return new FreteRod();
    }
}
