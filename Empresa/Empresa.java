package Empresa;

public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private String fone;

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getFone(){
        return this.fone;
    }
}
