package arquivoBinario;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class GRandom implements Serializable {
    private Random random = new Random();

    /**
     * Gera uma String Aleatória de valores 1 e 0.
     *
     * @param x Numero de bits desejados
     */
    public String RandomString(int x){
        String result = new String();

        for(int indice = 0; indice < x; indice++){
            result += random.nextInt(2);
        }
        return result;
    }

    /**
     * Usa o metodo RandomString e Converte o resultado para inteiro.
     *
     * @param x Numero de bits desejados
     */
    public int RandomInt(int x){
        int result = Integer.parseInt(this.RandomString(x));
        return result;
    }
    
    public Pessoa PopPessoa() {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setEscolaridade(this.RandomString(2));
        pessoa.setIdade(this.RandomString(7));
        pessoa.setIdioma(this.RandomString(12));
        pessoa.setLocalizacao(this.RandomString(24));
        pessoa.setPais(this.RandomString(8));
        pessoa.setRenda(this.RandomString(10));
        pessoa.setSexo(this.RandomString(1));
        return pessoa;
    }
}
