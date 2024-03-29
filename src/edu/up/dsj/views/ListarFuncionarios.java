package edu.up.dsj.views;

import java.text.SimpleDateFormat;

import edu.up.dsj.controller.FuncionarioController;
import edu.up.dsj.models.Funcionario;
import edu.up.dsj.models.FuncionarioHora;
import edu.up.dsj.models.FuncionarioMes;

/**
 * Classe para imprimir a lista de colaboradores na tela para os usu�rios.
 * @author Leandro Zeni
 */
public class ListarFuncionarios {

	private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy '�s' HH:mm");
	
	public static void renderizarTodos() {

		System.out.println("\n========= TODOS OS COLABORADORES =========\n");
		for (Funcionario colaborador : FuncionarioController.retornarListaFuncionarios()) {
			System.out.println("Nome: " + colaborador.getNome() + " | Setor: "
					+ colaborador.getSetor().getNome() + " | Cadastrado em: "
					+ formatter.format(colaborador.getCadastradoEm()) + " | Endere�o: " + colaborador.getEndereco()
					+ "\n");
		}
		System.out.println("\n=================================\n");
	}
	
	public static void renderizarHoristas() {

		System.out.println("\n========= COLABORADORES HORISTAS =========\n");
		for (FuncionarioHora colaborador : FuncionarioController.retornarListaHoristas()) {
			System.out.println("Nome: " + colaborador.getNome() + " | Setor: "
					+ colaborador.getSetor().getNome() + " | Cadastrado em: "
					+ formatter.format(colaborador.getCadastradoEm()) + " | Endere�o: " + colaborador.getEndereco()
					+ "\n");
		}
		System.out.println("\n=================================\n");
	}
	
	public static void renderizarMensalistas() {

		System.out.println("\n========= COLABORADORES MENSALISTAS =========\n");
		for (FuncionarioMes colaborador : FuncionarioController.retornarListaMensalistas()) {
			System.out.println("Nome: " + colaborador.getNome() + " | Setor: "
					+ colaborador.getSetor().getNome() + " | Cadastrado em: "
					+ formatter.format(colaborador.getCadastradoEm()) + " | Endere�o: " + colaborador.getEndereco()
					+ "\n");
		}
		System.out.println("\n=================================\n");
	}
}