public class PagamentoBR implements IPagamento {
    public String descrever(double v) { return String.format("Pagamento via Pix (R$ %.2f)", v); }

}
