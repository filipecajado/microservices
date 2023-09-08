package br.com.alura.microservice.loja.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long pedidoId;
	
	private Integer tempoDePreparo;
	
	private String enderecoDestino;
	
	private Long voucher;
	
	private LocalDate dataParaEntrega;
	
	@Enumerated(EnumType.STRING)
	private CompraState state;

	public CompraState getState() {
		return state;
	}

	public void setState(CompraState state) {
		this.state = state;
	}

	public Long getVoucher() {
		return voucher;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setVoucher(Long voucher) {
		this.voucher = voucher;
	}

	public LocalDate getDataParaEntrega() {
		return dataParaEntrega;
	}

	public void setDataParaEntrega(LocalDate dataParaEntrega) {
		this.dataParaEntrega = dataParaEntrega;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	
	
}
