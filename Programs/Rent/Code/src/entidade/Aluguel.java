package entidade;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import entidade.Automovel;

public abstract class Aluguel {
   private Cliente cliente;
   private Veiculo veiculo;
   private double valorD;
   private double valorP;
   private boolean ativo=true;
   LocalDateTime dtRetirada;
   LocalDateTime dtDevolucao;

   
   public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Veiculo getVeiculo() {
	return veiculo;
}
public void setVeiculo(Veiculo veiculo) {
	this.veiculo = veiculo;
}
public double getValorD() {
	return valorD;
}
public void setValorD(double valorD) {
	this.valorD = valorD;
}
public double getValorP() {
	return valorP;
}
public void setValorP(double valorP) {
	this.valorP = valorP;
}
public boolean isAtivo() {
	return ativo;
}
public void setAtivo(boolean ativo) {
	this.ativo = ativo;
}
public LocalDateTime getDtRetirada() {
	return dtRetirada;
}
public void setDtRetirada(LocalDateTime dtRetirada) {
	this.dtRetirada = dtRetirada;
}
public LocalDateTime getDtDevolucao() {
	return dtDevolucao;
}
public void setDtDevolucao(LocalDateTime dtDevolucao) {
	this.dtDevolucao = dtDevolucao;
}

public void devolucao() {
	if(ativo=false) {
		System.out.println("concluido");
	}
	LocalDateTime dtDevolucao = LocalDateTime.now();
	 calcularValorAPagar();
	}
public void calcularValorAPagar() {
	int horas = (int) ChronoUnit.HOURS.between(dtRetirada, dtDevolucao);
	int dias = (int) ChronoUnit.DAYS.between(dtRetirada, dtDevolucao);
	 double valorDiaria=(10*dias);
	
	
}

@Override
public String toString() {
	return "Aluguel [cliente=" + cliente + ", veiculo=" + veiculo + ", valorD=" + valorD + ", valorP=" + valorP
			+ ", ativo=" + ativo + ", dtRetirada=" + dtRetirada + ", dtDevolucao=" + dtDevolucao + "]";
}
public String getPlaca() {
	// TODO Auto-generated method stub
	return null;
}
   
   
   
   
  
   
}
