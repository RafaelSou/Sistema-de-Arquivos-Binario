package arquivoBinario;

/**
 *
 * @author Rafael
 */
public class PrincipalCSV {
    static int tamanho = 100;
    
    public static void main(String[] args) throws ClassNotFoundException {
        GravarEmArqBinario g = new GravarEmArqBinario();
        g.gerarBinario("C:\\Users\\Marcelo\\Desktop\\arquivo.dat", tamanho);
        System.out.println("> Arquivo Gerado Com Sucesso");
        
        g.lerBinario("C:\\Users\\Marcelo\\Desktop\\arquivo.dat", tamanho);
    } 
}
