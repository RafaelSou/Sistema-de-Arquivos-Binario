package arquivoBinario;

/**
 *
 * @author Rafael
 */
public class PrincipalCSV {
    static int tamanho = 100;
    
    public static void main(String[] args) throws ClassNotFoundException {
        GravarEmArqBinario g = new GravarEmArqBinario();
        //Salva na pasto do Projeto
        g.gerarBinario("arquivo.dat", tamanho);
        System.out.println("> Arquivo Gerado Com Sucesso");
        
        g.lerBinario("arquivo.dat", tamanho);
    } 
}
