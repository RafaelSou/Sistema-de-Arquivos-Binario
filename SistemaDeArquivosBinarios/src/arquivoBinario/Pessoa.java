package arquivoBinario;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Rafael
 */
class Pessoa implements Serializable{
    private Random random = new Random();
    GRandom myrandom = new GRandom();
    private String sexo;
    private String idade;
    private String renda;
    private String escolaridade;
    private String idioma;
    private String pais;
    private String localizacao;


    public Pessoa() {
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
   
}
