import java.util.List;

public class FreteRod extends ABSFrete {
    private final double frete_porc=0.2;
    private final String type="Rodoviario";
    public void frete_calc(){
        this.frete=valor_carga*frete_porc;
        setTipoDetails();
    }
    public void setTipoDetails(){
        List<String> docs=List.of("CT-e","MDF-e");
        this.documentos=docs;
        this.tipo=type;
    }
}
