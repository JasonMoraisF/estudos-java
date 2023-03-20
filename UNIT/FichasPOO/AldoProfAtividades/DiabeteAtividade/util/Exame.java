package UNIT.FichasPOO.AldoProfAtividades.DiabeteAtividade.util;

public class Exame {
    private int idExame;
	private String nomePaciente;
	private int nivelGlicose;

	public void Exame(int idExame, String nome, int nivelGlicose ) {
		setIdExame(idExame);
		setNomePaciente(nome);
		setNivelGlicose(nivelGlicose);
	}

	public String obterDiagnostico(){
		if(nivelGlicose <= 99){
			return "Normal";
		}
		else if(nivelGlicose <= 125){
			return "Pré-diabetes";
		}
		else{
			return "Diabetes";
		}
	}

	public int getIdExame() {return idExame;}

	public void setIdExame(int idExame) {this.idExame = idExame;}

	public String getNomePaciente() {return nomePaciente;}

	public void setNomePaciente(String nomePaciente) {this.nomePaciente = nomePaciente;}

	public int getNivelGlicose() {return nivelGlicose;}

	public void setNivelGlicose(int nivelGlicose) {this.nivelGlicose = nivelGlicose;}
	

}