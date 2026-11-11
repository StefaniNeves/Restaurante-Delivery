package Pessoa;

 import java.util.ArrayList;
 
public class RepositorioPessoa {
	 private ArrayList<Pessoa>pessoas;
	 
	 public RepositorioPessoa() {
		 pessoas = new ArrayList<>();
	 }
	 public void adicionarPessoa(Pessoa p) {
		 pessoas.add(p);
	 }
	 
	 public Pessoa buscarPorSenha(String senha) {
		 for(Pessoa p : pessoas) {
			 if(p.getSenha().equals(senha)) {
				 return p;
			 }
		 }
		 return null;
	 }
	 public Pessoa buscarPorEmail(String email) {
		 for(Pessoa p : pessoas) {
			 if(p.getEmail().equals(email)) {
				 return p;
			 }
		 }
		 return null;
	 }
	 public Pessoa buscarPorCodigo(int codigo) {
		 for(Pessoa p : pessoas) {
			 if(p.getCodigo() == codigo) {
				 return p;
			 }
		 }
		 return null;
	 }

	 public boolean removerPorCodigo(int codigo) {
		 for(Pessoa p : pessoas) {
			 if(p.getCodigo() == codigo) {
				 pessoas.remove(p);
				 return true;
			 }
		 }
		 return false;
	 }

	 public boolean removerPorSenha(String senha) {
		 for(Pessoa p : pessoas) {
			 if(p.getSenha() == senha) {
				 pessoas.remove(p);
				 return true;
			 }
		 }
		 return false;
	 }
	 public ArrayList<Pessoa>listarPessoas(){
		 return pessoas;
	 }
	 public ArrayList<Cliente>listaClientes(){
		 ArrayList<Cliente> clientes = new ArrayList<>();
		 for(Pessoa p : pessoas) {
			 if(p instanceof Cliente) {
				 clientes.add((Cliente)p);
			 }
		 }
		 return clientes;
	 }
	 public ArrayList<Funcionario>listaFuncionarios(){
		 ArrayList<Funcionario> funcionarios = new ArrayList<>();
		 for(Pessoa p : pessoas) {
			 if(p instanceof Funcionario) {
				 funcionarios.add((Funcionario)p);
			 }
		 }
		 return funcionarios;
	 }
} 
	 
	