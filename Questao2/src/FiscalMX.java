public class FiscalMX implements IFiscal{
    public String descrever(double v) {
        return "CDFI com IVA de 16%"+v * 0.16;
    }

}
