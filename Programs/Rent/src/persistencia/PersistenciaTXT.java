package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import cadastro.CadastroCliente;
import cadastro.CadastroVeiculo;
import cadastro.ControleAluguel;
import entidade.Aluguel;
import entidade.Cliente;
import entidade.Veiculo;


public class PersistenciaTXT implements Persistencia {

	@Override
	public void exportar(CadastroCliente cadCliente, CadastroVeiculo cadVeiculo, ControleAluguel contAluguel)
			throws IOException {
		
		FileWriter arq = new FileWriter("pessoaFisica.txt");

		  PrintWriter gravarArq = new PrintWriter(arq);

		  gravarArq.printf("%s", cadCliente.exportarTXTPessoaFisica());

		  gravarArq.close();

		   

		   

		  arq = new FileWriter("pessoaJuridica.txt");

		  gravarArq = new PrintWriter(arq);

		  gravarArq.printf("%s", cadCliente.exportarTXTPessoaJuridica());

		  gravarArq.close();

		   

		  arq = new FileWriter("automovel.txt");

		  gravarArq = new PrintWriter(arq);

		  gravarArq.printf("%s", cadVeiculo.exportarTXTAutomovel());

		  gravarArq.close();

		   

		  arq = new FileWriter("caminhao.txt");

		  gravarArq = new PrintWriter(arq);

		  gravarArq.printf("%s", cadVeiculo.exportarTXTCaminhao());

		  gravarArq.close();

		   

		  /*arq = new FileWriter("aluguel.txt");

		  gravarArq = new PrintWriter(arq);

		  gravarArq.printf("%s", contAluguel.exportarTXTAluguel());

		  gravarArq.close();*/

		   

		  System.out.printf("\nExportação realizada com sucesso.\n");

	}

	@Override
	public void importarCadastroCliente(CadastroCliente cadCliente) {
		FileReader arq;

		 BufferedReader lerArq;

		 String linha;

		 String[] vetTXT;

		  

		 try {

			 arq = new FileReader("pessoaFisica.txt");

			 lerArq = new BufferedReader(arq);



			 linha = lerArq.readLine();				    

			 while (linha != null) {

				 vetTXT = linha.split(";");

				 cadCliente.inserirPF(vetTXT[0], vetTXT[1], vetTXT[2], vetTXT[3]);

				  

				 linha = lerArq.readLine();

			 }

			 lerArq.close();



		 }catch(FileNotFoundException e) {

			 System.out.println("Arquivo pessoaFisica.txt não encontrado.");

		 }catch(IOException e) {

			 System.out.println(e.getMessage());

		 }catch(ArrayIndexOutOfBoundsException e) {

			 System.out.println("Erro na leitura do arquivo pessoaFisica.txt.");

		 }

		 catch(NumberFormatException e) {

			 System.out.println("Erro de conversão de String para número." + e.getMessage());

		 }


		  

		 try {

			 arq = new FileReader("pessoaJuridica.txt");

			 lerArq = new BufferedReader(arq);



			 linha = lerArq.readLine();		 		    

			 while (linha != null) {

				 vetTXT = linha.split(";");

				 cadCliente.inserirPJ(vetTXT[0], vetTXT[1], vetTXT[2], vetTXT[3]);

				  

				 linha = lerArq.readLine();

			 }

			 lerArq.close();



		 }catch(FileNotFoundException e) {

			 System.out.println("Arquivo pessoaJuridica.txt não encontrado.");

		 }catch(IOException e) {

			 System.out.println(e.getMessage());

		 }catch(ArrayIndexOutOfBoundsException e) {

			 System.out.println("Erro na leitura do arquivo pessoaJuridica.txt.");

		 }	  

	 

	}

	@Override
	public void importarCadastroVeiculo(CadastroVeiculo cadVeiculo) {
		 FileReader arq;

		 BufferedReader lerArq;

		 String linha;

		 String[] vetTXT;

		  

		 try {

			 arq = new FileReader("automovel.txt");

			 lerArq = new BufferedReader(arq);



			 linha = lerArq.readLine();				    

			 while (linha != null) {

				 vetTXT = linha.split(";");

				 cadVeiculo.inserirAutomovel(vetTXT[0], Integer.parseInt(vetTXT[1]), Double.parseDouble(vetTXT[2]), Integer.parseInt(vetTXT[3]));

				 linha = lerArq.readLine();

			 }

			 lerArq.close();



		 }catch(FileNotFoundException e) {

			 System.out.println("Arquivo automovel.txt não encontrado.");

		 }catch(IOException e) {

			 System.out.println(e.getMessage());

		 }catch(ArrayIndexOutOfBoundsException e) {

			 System.out.println("Erro na leitura do arquivo automovel.txt.");

		 }catch(NumberFormatException e) {

			 System.out.println("Erro de conversão de String para número. " + e.getMessage());

		 }

		  

		 try {

			 arq = new FileReader("caminhao.txt");

			 lerArq = new BufferedReader(arq);



			 linha = lerArq.readLine();				    

			 while (linha != null) {

				 vetTXT = linha.split(";");

				 cadVeiculo.inserirCaminhao(vetTXT[0], Integer.parseInt(vetTXT[1]), Double.parseDouble(vetTXT[2]));

				 linha = lerArq.readLine();

			 }

			 lerArq.close();



		 }catch(FileNotFoundException e) {

			 System.out.println("Arquivo caminhão.txt não encontrado.");

		 }catch(IOException e) {

			 System.out.println(e.getMessage());

		 }catch(ArrayIndexOutOfBoundsException e) {

			 System.out.println("Erro na leitura do arquivo automovel.txt.");

		 }catch(NumberFormatException e) {

			 System.out.println("Erro de conversão de String para número. " + e.getMessage());

		 } 


	}

	@Override
	public void importarControleAluguel(CadastroCliente cadCliente, CadastroVeiculo cadVeiculo,
			ControleAluguel contAluguel) {
		 FileReader arq;

		 BufferedReader lerArq;

		 String linha;

		 String[] vetTXT;

		 Cliente c;

		 Veiculo v;

		 boolean ativo;

		 LocalDateTime dtRetirada;

		 LocalDateTime dtDevolucao;

		 double valorDiaria;

		 Aluguel a;

		  

		 try {

			 arq = new FileReader("aluguel.txt");

			 lerArq = new BufferedReader(arq);



			 linha = lerArq.readLine();				    

			 while (linha != null) {

				 vetTXT = linha.split(";");			  

				 c = cadCliente.consultarCliente(vetTXT[0]);

				 v = cadVeiculo.consultarVeiculo(vetTXT[1]);

				 ativo = Boolean.parseBoolean(vetTXT[2]);

				  

				 DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy HH🇲🇲ss");

				 dtRetirada = LocalDateTime.parse(vetTXT[3], parser);

				 dtDevolucao = null;

				  

				 if(!ativo) {

					 dtDevolucao = LocalDateTime.parse(vetTXT[4], parser);

				 }

				  

				 valorDiaria = Double.parseDouble(vetTXT[5]);

				  

				 contAluguel.registrarAluguel(c, v, valorDiaria);

				 a = contAluguel.consultarAluguel(vetTXT[1]);

				  

				 a.setAtivo(ativo);

				 a.setDtRetirada(dtRetirada);

				 if(!ativo) {

					 a.setDtDevolucao(dtDevolucao);

					 a.calcularValorAPagar();

				 }

				  

				 linha = lerArq.readLine();

			 }

			 lerArq.close();



		 }catch(FileNotFoundException e) {

			 System.out.println("Arquivo aluguel.txt não encontrado.");

		 }catch(IOException e) {

			 System.out.println(e.getMessage());

		 }catch(ArrayIndexOutOfBoundsException e) {

			 System.out.println("Erro na leitura do arquivo automovel.txt.");

		 }

	 






}
	public String exportarTXTAluguel() {

		String s = "";

		String dtRetirada, dtDevolucao;

		

		for(Aluguel a: lista) {

			dtRetirada = a.getDtRetirada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH🇲🇲ss"));

			dtDevolucao = "null";

			

			if(!a.isAtivo()) {

				dtDevolucao = a.getDtDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH🇲🇲ss"));

		  }

			

			s += a.getCliente().getId() + ";" + a.getVeiculo().getPlaca() + ";" + a.isAtivo() + ";" + dtRetirada + ";" + dtDevolucao + ";" + a.getValorDiaria() + "\n";

		}

		

		return s;

	}

	}


