public class Cliente {

    private int codigo;
    private String nome;
    private String cnpj;


    public Cliente() {
    }

    public Cliente(int codigo, String nome, String cnpj) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return " Cliente {" +
                "Código do Cliente : " + codigo +
                ", Nome:'" + nome + '\'' +
                ", CNPJ:'" + cnpj + '\'' +
                '}';
    }

}
