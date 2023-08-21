package Atividades.ficha6udemy2023.DesafioVetores.util;

public class PessoaDadosQuartos {
    private String nome;
    private String email;




    
    public void PessoaDadosQuarto(){
        
    }
    public void PessoaDadosQuarto(String name, String email){
        this.nome = name;
        this.email = email;
    }


    public String getNome() {return nome;}
    public void setNome(String nome) { this.nome = nome;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    
    @Override
    public String toString() {
        return "PessoaDadosQuartos [nome=" + nome + ", email=" + email + "]";
    }
    

}
