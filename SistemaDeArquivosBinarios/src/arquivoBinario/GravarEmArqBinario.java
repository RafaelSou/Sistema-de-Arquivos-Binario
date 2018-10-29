/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivoBinario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marcelo
 */
public class GravarEmArqBinario {
    GRandom random = new GRandom();
    
    public void gerarBinario (String nomeArquivo, int n) throws ClassNotFoundException {
        int i;
        Pessoa mypessoa[] = new Pessoa[n];
        File binaryFile = new File (nomeArquivo);
        
        try{            
            FileOutputStream fos = new FileOutputStream(binaryFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // escreve todos os produtos do registro no arquivo
            
            for (i=0;i<n;i++){    
                mypessoa[i] = random.PopPessoa();
            }
            oos.writeObject(mypessoa);
            oos.flush(); 
            // fecha o arquivo
            oos.close();
            fos.close();   
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void lerBinario(String nomeArquivo, int n) throws ClassNotFoundException{
        File binaryFile = new File (nomeArquivo);
        try{            
            FileInputStream fis = new FileInputStream(binaryFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Pessoa pp[] = (Pessoa[])ois.readObject();
            // chamar menu
            Menu M = new Menu();
            M.menu_1(pp);
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
        }
    }    
}
