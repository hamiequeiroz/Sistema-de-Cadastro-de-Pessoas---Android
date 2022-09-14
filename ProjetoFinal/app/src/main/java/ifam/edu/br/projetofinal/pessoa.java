//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M4DADM
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Hamie Queiroz Tomas
//******************************************************

package ifam.edu.br.projetofinal;


//classe pessoa para guarda dados dos cliente
public class pessoa {

    private String nome;
    private String cpf;
    private String idade;
    private String telfone;
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelfone() {
        return telfone;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //construtor da classe
    pessoa(String nome,String cpf,String idade,String telfone,String email){

        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telfone = nome;
        this.email = nome;


    }
}
