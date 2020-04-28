package loja.entity;

import java.math.BigDecimal;

public class Custo {
	private Integer id;
	private BigDecimal custoReal;
	private BigDecimal custoLiquido;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getCustoReal() {
		return custoReal;
	}
	public void setCustoReal(BigDecimal custoReal) {
		this.custoReal = custoReal;
	}
	public BigDecimal getCustoLiquido() {
		return custoLiquido;
	}
	public void setCustoLiquido(BigDecimal custoLiquido) {
		this.custoLiquido = custoLiquido;
	}
	
	
}
