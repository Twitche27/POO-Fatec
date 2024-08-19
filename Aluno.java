public class Aluno extends Usuario {
  private int matricula;
  private String curso;
  
  public Aluno(String login, String senha, int matricula, String curso) {
    super(login, senha);
    this.matricula = matricula;
    this.curso = curso;
  }

  public void matricularSe() {
    
  }

  public void trancarMatricula() {
    
  }
}