package persistencia;

import java.io.IOException;



import cadastro.CadastroCliente;

import cadastro.CadastroVeiculo;

import cadastro.ControleAluguel;

public interface Persistencia {

	public void exportar(CadastroCliente cadCliente, CadastroVeiculo cadVeiculo, ControleAluguel contAluguel) throws IOException;

	public void importarCadastroCliente(CadastroCliente cadCliente);

	public void importarCadastroVeiculo(CadastroVeiculo cadVeiculo);

	public void importarControleAluguel(CadastroCliente cadCliente, CadastroVeiculo cadVeiculo, ControleAluguel contAluguel);
}
