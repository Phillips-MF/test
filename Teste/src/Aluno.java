import java.util.HashSet;
import java.util.Set;

public class Aluno {
	private String nome;
	private Set<Aluno> alunos = new HashSet();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void adiciona(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return this.alunos;
	}
	
	@Override
	public String toString() {
		
		return "Lista de alunos: " + this.nome;
		
	}
		
		
	}

