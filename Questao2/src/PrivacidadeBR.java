public class PrivacidadeBR implements IPrivacidade{
    private String priv_term="LGPD";

    public String descrever(){
        return String.format("Termo de privacidade segue:"+this.priv_term);
    }
}
