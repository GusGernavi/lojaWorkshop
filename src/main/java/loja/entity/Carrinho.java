package loja.entity;

import java.math.BigDecimal;
import java.util.List;

public class Carrinho {
	private Integer id;
	private BigDecimal precoFrete;
	private Cliente cliente;
	private BigDecimal precoTotal;
	private Desconto desconto;
	private BigDecimal pesototal;
	private List<Produto> produtos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecoFrete() {
		return precoFrete;
	}

	public void setPrecoFrete(BigDecimal precoFrete) {
		this.precoFrete = precoFrete;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Desconto getDesconto() {
		return desconto;
	}

	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getPesototal() {
		return pesototal;
	}

	public void setPesototal(BigDecimal pesototal) {
		this.pesototal = pesototal;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
