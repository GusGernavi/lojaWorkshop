package loja.entity;

import java.math.BigDecimal;

public class Desconto {
	private Integer id;
	private BigDecimal valorDesconto;
	private String cupomDesconto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public String getCupomDesconto() {
		return cupomDesconto;
	}

	public void setCupomDesconto(String cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}

}
