public class Cliente implements Autenticavel {
    String senha;

    @Override
    public boolean autentica(String senha) {
        return senha.equals(this.senha);
    }
}
