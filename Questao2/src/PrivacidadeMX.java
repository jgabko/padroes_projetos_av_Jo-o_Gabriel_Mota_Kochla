public class PrivacidadeMX implements IPrivacidade{
    private String priv_term="LFPDPPP";

    public String descrever(){
        return String.format("Termo de privacidade segue:"+this.priv_term);
    }
}
