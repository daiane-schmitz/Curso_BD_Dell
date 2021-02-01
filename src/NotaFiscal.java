import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {

    private int codigo;
    private Date data;
    private Cliente cliente;
    private List<ItemNotaFiscal> itens = new ArrayList<ItemNotaFiscal>();
    private float valor;

    public NotaFiscal() {
    }

    public NotaFiscal(int codigo, Date data, Cliente cliente) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemNotaFiscal> getItens() {
        return itens;
    }

    public void setItens(List<ItemNotaFiscal> itens) {
        this.itens = itens;
    }

    public float calcularValor(ItemNotaFiscal itemNotaFiscal, Produto produto) {
       return valor = (itemNotaFiscal.getQuantidade()* produto.getValor());
    }

    public void inserirItem(ItemNotaFiscal itemNotaFiscal){
        itens.add(itemNotaFiscal);
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "Código da Nota Fiscal: " + codigo +
                ", Data: " + data +
                '}';
    }


}