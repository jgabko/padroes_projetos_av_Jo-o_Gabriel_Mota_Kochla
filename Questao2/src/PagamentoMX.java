public class PagamentoMX implements IPagamento{
    public String descrever(double v) { return String.format("Pagamento via SPEI (R$ %.2f)", v); }

}
