import java.util.List;

public abstract class ABSFrete {
   public double frete;
   public double valor_carga;
   public List<String> documentos;
   public String nome;
   public String tipo;

    public void setCarga(double valor_carga,String nome) {
        this.valor_carga = valor_carga;
        this.nome=nome;
        frete_calc();
    }

    public String resumo(){
      return String.format("Nome:"+nome+"\n"+"Tipo:"+tipo+"\n"+"valor frete:"+this.frete+"\n"+"valor carga:"+valor_carga+"\n"+"Documentos:"+documentos);
    }
    public abstract void frete_calc();
}
