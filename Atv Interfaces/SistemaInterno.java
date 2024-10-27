public class SistemaInterno {
    public void login(Autenticavel usuario, String senha) {
        if (usuario.autentica(senha) == true) {
            System.out.println("Usuário Autenticado!");
        }
        else {
            System.out.println("Falha no login!");
        }
    }
}
