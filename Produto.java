package cursojava.classe;

public class Produto {
	public String nome;
	public double valor;
	public int quantidade;
	
	
	public double totalProdutoEstoque() {
		return valor * quantidade;
		
	}
    public void adicionaProdutos(int quantidade) {
    	this.quantidade+=quantidade;
    }
    public void removeProduto(int quantidade) {
    	this.quantidade-=quantidade;
    }
}
