package loja.entity;

import java.util.List;

public class Produto {
	private Integer id;
	private String nome;
	private Categoria categoria;
	private List<Fornecedor> fornecedor;
	private Fabricante fabricante;
	private Pais nacionalidade;
	private Custo custo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Pais getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Pais nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Custo getCusto() {
		return custo;
	}
	public void setCusto(Custo custo) {
		this.custo = custo;
	}
	
}
