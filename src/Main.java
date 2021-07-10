public class Main {

    public static void main(String[] args) {
        System.out.println("===========");
        if(esPalindromo("Brian")){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        System.out.println("===========");
    }
    
    static boolean esPalindromo(String glosa) {
        glosa = glosa.replace(" ", "");
        glosa = glosa.toLowerCase();
        
        StringBuilder glosaInvertida = new StringBuilder();
        for(int n = glosa.length()-1; n >= 0; n--){
            glosaInvertida.append(glosa.charAt(n));
        }
        
        System.out.println(glosa);
        System.out.println(glosaInvertida);

        
        return glosa.equals(glosaInvertida.toString());
    }
    
}
