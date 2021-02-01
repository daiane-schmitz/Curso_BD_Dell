public class ItemNotaFiscal {

    int item;
    int quantidade;
    Produto produto;

    public ItemNotaFiscal() {
    }

    public ItemNotaFiscal(int item, int quantidade, Produto produto) {
        this.item = item;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemNotaFiscal{" +
                "Item: " + item +
                ", Produto: " + produto +
                ", Quantidade: " + quantidade +
                '}';
    }
}
