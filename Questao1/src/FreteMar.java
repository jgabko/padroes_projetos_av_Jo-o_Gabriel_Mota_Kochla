import java.util.List;

public class FreteMar  extends ABSFrete{
    private final double frete_porc=0.1;
    private final String type="Maritimo";
    public void frete_calc(){
        this.frete=valor_carga*frete_porc;
        setTipoDetails();
    }
    public void setTipoDetails(){
        List<String> docs=List.of("BL (Bill of Lading)"," fatura comercial.");
        this.documentos=docs;
        this.tipo=type;
    }

}
