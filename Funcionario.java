public class Funcionario extends Usuario {
  private int numFuncional;
  
  public Funcionario(String login, String senha, int numFuncional) {
    super(login, senha);
    this.numFuncional = numFuncional;
  }  

  public void registrarHorario(Date hora) {
    
  }
}