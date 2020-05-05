package mediaaluno;

public class Aluno {
	
	private int ra;
	private String nome;
	private String semestre;
		
	Disciplina disciplina = new Disciplina();
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return "O aluno ra: " + ra + ", nome: " + nome +"\n" + semestre  +" semestre";
	}
	
	
	
	
	
		
		
	
	
	

	

}
