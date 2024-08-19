public class Professor extends Funcionario {
  private String Titulacao;
  
  public Professor(String login, String senha, int numFuncional, String Titulacao) {
    super(login, senha, numFuncional);
    this.Titulacao = Titulacao;
  }
  public void digitarNotas(int turma) {
    
  }
}  