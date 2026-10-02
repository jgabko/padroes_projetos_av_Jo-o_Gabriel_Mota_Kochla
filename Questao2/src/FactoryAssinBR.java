public class FactoryAssinBR implements IFactoryAssin{
    public IPrivacidade criarPriv(){
        return new PrivacidadeBR();
    }
    public IFiscal criarFiscal(){
        return new FiscalBR();
    }
    public IPagamento criarPagamento(){
        return new PagamentoBR();
    }
}
