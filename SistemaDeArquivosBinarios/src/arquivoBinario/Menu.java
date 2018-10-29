package arquivoBinario;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Menu {
    Querys q = new Querys();
    
    public void menu_1(Pessoa pp[]){
        String x = " ";
        
        while(!"0".equals(x)){
            System.out.println("+---------------------+");
            System.out.println("|  MENU DE QUERIES    |");
            System.out.println("+---------------------+");
            System.out.println("| 1. Query1           |");
            System.out.println("| 2. Query2           |");
            System.out.println("| 3. Query3           |");
            System.out.println("| 4. Query4           |");
            System.out.println("| 5. Query5           |");
            System.out.println("| 6. Query6           |");
            System.out.println("| 7. Query7           |");
            System.out.println("| 8. Query8 - Extra   |");
            System.out.println("| 9. Query9 - Extra   |");;
            System.out.println("| 10. Query10 - Extra |");
            System.out.println("| 0. Encerrar         |");
            System.out.println("+---------------------+");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            Scanner sc = new Scanner(System.in); 
            x = sc.nextLine();
            
            switch (x){
                case "0":
                    System.out.println("> ENCERRANDO...");
                    break;
                case "1":
                    q.query_1(pp);
                    break;   
                case "2":
                    q.query_2(pp);
                    break;    
                case "3":
                    q.query_3(pp);
                    break;    
                case "4":
                    q.query_4(pp);
                    break;    
                case "5":
                    q.query_5(pp);
                    break;
                case "6":
                    q.query_6(pp);
                    break;    
                case "7":
                    q.query_7(pp);
                    break;    
                case "8":
                    q.query_8(pp);
                    break;    
                case "9":
                    q.query_9(pp);
                    break;
                case "10":
                    q.query_10(pp);
                    break;    
                default:
                    System.out.println("> ERRO: OPÇÃO INVÁLIDA");
                    break;                          
            }
        } 
    }
}