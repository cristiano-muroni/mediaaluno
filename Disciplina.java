package mediaaluno;

/* essa classe servir� para todos os objetos e instancias de notas e mat�rias */
public class Disciplina {

	private double nota;
	private String disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "--*-- Disciplina: " + getDisciplina() + ", nota: " + getNota() + " --*--";
	}

}
