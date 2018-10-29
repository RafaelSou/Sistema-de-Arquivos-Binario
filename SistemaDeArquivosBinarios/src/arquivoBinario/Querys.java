package arquivoBinario;

/**
 *
 * @author Rafael
 */
public class Querys {
    
    // SELECT país, sexo, count(*) FROM pessoas GROUP BY país, sexo;
    public void query_1(Pessoa p[]){
        System.out.println("País    Sexo    Count");
        for(int i = 0; i < p.length; i++){
            this.q1(p, p[i]);
        }
    }
    
    public void q1(Pessoa p[], Pessoa pp){
        int contador=0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) && pp.getSexo().equals(p1.getSexo())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getSexo() +"   "+ contador);
    }
    
    // SELECT país, sexo, idade, count(*) FROM pessoas GROUP BY país, sexo, idade;
    public void query_2(Pessoa p[]){
        System.out.println("País    Sexo    idade    Count");
        for(int i = 0; i < p.length; i++){
            this.q2(p, p[i]);
        }
    }
    
    public void q2(Pessoa p[], Pessoa pp){
        int contador=0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) &&
                    pp.getSexo().equals(p1.getSexo()) &&
                    pp.getIdade().equals(p1.getIdade())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getSexo() +"   "+ pp.getIdade() +"   "+ contador);
    }
    
    // SELECT país, sexo, avg(salario) FROM pessoas GROUP BY país, sexo;
    public void query_3(Pessoa p[]){
        System.out.println("País    Sexo    AVG(salario)");
        for(int i = 0; i < p.length; i++){
            this.q3(p, p[i]);
        }
    }
    
    public void q3(Pessoa p[], Pessoa pp){
        int contador=0;
        float soma=0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) && pp.getSexo().equals(p1.getSexo())) {
                soma = soma + converter(pp.getRenda());
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getSexo() +"   "+soma/contador );
        
    }
    
    // SELECT país, sexo, avg(idade) FROM pessoas GROUP BY país, sexo;
    public void query_4(Pessoa p[]){
        System.out.println("País    Sexo    AVG(Idade)");
        for(int i = 0; i < p.length; i++){
            this.q4(p, p[i]);
        }
    }
    
    public void q4(Pessoa p[], Pessoa pp){
        int contador=0;
        float soma=0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) && pp.getSexo().equals(p1.getSexo())) {
                soma = soma + converter(pp.getIdade());
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getSexo() +"   "+soma/contador );   
    }
   
    // SELECT país, sexo, count(*) FROM pessoas WHERE país = 15 GROUP BY país, sexo;
    public void query_5(Pessoa p[]){
        System.out.println("País    Sexo    Count");
        for(int i = 0; i < p.length; i++){
            if(converter(p[i].getPais()) == 15)
                this.q5(p, p[i]);
        }
    }
    
    public void q5(Pessoa p[], Pessoa pp){
        int contador = 0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) 
                    && pp.getSexo().equals(p1.getSexo())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getSexo() +"   "+ contador);
    }
    
    // SELECT país, sexo, count(*) FROM pessoas WHERE país = 15 AND sexo = 1 GROUP BY país, sexo;
    public void query_6(Pessoa p[]){
        System.out.println("País    Sexo    Count");
        for(int i = 0; i < p.length; i++){
            if(converter(p[i].getPais()) == 15 && p[i].getSexo().equals("1"))
                this.q6(p, p[i]);
        }
    }
    
    public void q6(Pessoa p[], Pessoa pp){
        int contador = 0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) 
                    && pp.getSexo().equals(p1.getSexo())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getSexo() +"   "+ contador);
    }
    
    // SELECT país, sexo, count(*) FROM pessoas WHERE país >=0 AND país <=15 GROUP BY país, sexo;
    public void query_7(Pessoa p[]){
        System.out.println("País    Sexo    Count");
        for(int i = 0; i < p.length; i++){
            if((converter(p[i].getPais()) <= 15)  && (converter(p[i].getPais()) >= 0))
                this.q7(p, p[i]); 
        }
    }
    
    public void q7(Pessoa p[], Pessoa pp){
        int contador = 0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) 
                    && pp.getSexo().equals(p1.getSexo())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getSexo() +"   "+ contador);
    }
    
    // SELECT país, escolaridade, count(*) FROM pessoas GROUP BY país, escolaridade;
    public void query_8(Pessoa p[]){
        System.out.println("País    Escolaridade    Count");
        for(int i = 0; i < p.length; i++){
            this.q8(p, p[i]);
        }
    }
    
    public void q8(Pessoa p[], Pessoa pp){
        int contador=0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) && pp.getEscolaridade().equals(p1.getEscolaridade())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getEscolaridade() +"   "+ contador);
    }
    
    // SELECT país, idioma FROM pessoas GROUP BY país, idioma;
    public void query_9(Pessoa p[]){
        System.out.println("País    Idioma    Count");
        for(int i = 0; i < p.length; i++){
            this.q9(p, p[i]);
        }
    }
    
    public void q9(Pessoa p[], Pessoa pp){
        int contador=0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) && pp.getIdioma().equals(p1.getIdioma())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getIdioma() +"   "+ contador);
    }
    
    // SELECT país, escolaridade, sexo FROM pessoas GROUP BY país, escolaridade, sexo;
    public void query_10(Pessoa p[]){
        System.out.println("País    escolaridade    sexo");
        for(int i = 0; i < p.length; i++){
            this.q10(p, p[i]);
        }
    }
    
    public void q10(Pessoa p[], Pessoa pp){
        int contador=0;
        for (Pessoa p1 : p) {
            if (pp.getPais().equals(p1.getPais()) && 
                    pp.getEscolaridade().equals(p1.getEscolaridade()) &&
                    pp.getSexo().equals(p1.getSexo())) {
                contador++;
            }
        }
        System.out.println(pp.getPais() +"   "+ pp.getEscolaridade() +"   "+ pp.getSexo());
    }
    
    public int converter(String s){
        int numero = Integer.parseInt(s, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
        return numero;
    }
    
}
