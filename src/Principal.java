import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCodigo(100);
        cliente.setNome("Lanchonete Salgado e Cia");
        cliente.setCnpj("200.200.0002/20");


        Produto milho = new Produto();
        milho.setCodigo(110);
        milho.setDescricao("Milho");
        milho.setValor(4.00f);

        Produto arroz = new Produto();
        arroz.setCodigo(220);
        arroz.setDescricao("Arroz");
        arroz.setValor(5.00f);

        Produto soja = new Produto();
        soja.setCodigo(330);
        soja.setDescricao("Soja");
        soja.setValor(3.00f);


        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setCodigo(1);
        notaFiscal.setData(new Date());
        notaFiscal.setCliente(cliente);


        ItemNotaFiscal itemNotaFiscal1 = new ItemNotaFiscal();
        itemNotaFiscal1.setItem(1);
        itemNotaFiscal1.setQuantidade(10);
        itemNotaFiscal1.setProduto(milho);

        ItemNotaFiscal itemNotaFiscal2 = new ItemNotaFiscal();
        itemNotaFiscal2.setItem(2);
        itemNotaFiscal2.setQuantidade(20);
        itemNotaFiscal2.setProduto(arroz);


        }




}
