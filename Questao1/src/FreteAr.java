import java.util.List;

public class FreteAr extends ABSFrete {
    private final double frete_porc=0.6;
    private final String type="Aereo";
    public void frete_calc(){
        this.frete=valor_carga*frete_porc;
        setTipoDetails();
    }
    public void setTipoDetails(){
        List<String> docs=List.of("AWB (AirWaybill)");
        this.documentos=docs;
        this.tipo=type;
    }

}
