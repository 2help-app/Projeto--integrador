package Base;
//Profissional extende Cliente
public class Profissional extends Cliente{
    //Atributo de Profissional
    private String areaAtuacao;
//Contrutor
    public Profissional(String nome, String cpf, String email, String telefone, String areaAtuacao) {
        super(nome, cpf, email, telefone);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }


    public String toString() {
        return "Cliente{" +
                "nome='" + this.getNome() + '\'' +

                ", email='" + this.getEmail() + '\'' +
                ", telefone='" + this.getTelefone() + '\'' +
                ", Area de Atuação= " +areaAtuacao+
                '}';
    }
}
