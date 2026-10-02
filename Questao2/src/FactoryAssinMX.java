public class FactoryAssinMX implements IFactoryAssin{
    public IPrivacidade criarPriv(){
        return new PrivacidadeMX();
    }
    public IFiscal criarFiscal(){
        return new FiscalMX();
    }
    public IPagamento criarPagamento(){
        return new PagamentoMX();
    }
}
