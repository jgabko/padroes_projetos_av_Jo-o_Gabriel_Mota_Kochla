public class Assinatura {
    private final IFiscal dfiscal;
    private final IPagamento pagamento;
    private final IPrivacidade privacidade;

    public Assinatura(IFactoryAssin fabrica) {
        this.dfiscal = fabrica.criarFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.privacidade = fabrica.criarPriv();
    }

    public void resumo(double valorPedido) {
        System.out.println("=== Relatorio do Pedido ===");
        System.out.println("Documento fiscal: " + dfiscal.descrever(valorPedido));
        System.out.println("Pagamento: " + pagamento.descrever(valorPedido));
        System.out.println("Privacidade: " + privacidade.descrever());
        System.out.println();
    }
}
