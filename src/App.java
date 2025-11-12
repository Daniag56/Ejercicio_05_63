public class App {
    public static String pintaPiramide(int altura, int fila) {
        String resultado = "";
        if (fila >= 1) {
           
            for (int i = 1; i <= altura - fila; i++) {
                resultado += " ";
            }
      
            for (int j = 1; j <= 2 * fila - 1; j++) {
                resultado += "*";
            }
        }
        return resultado;
    }

    public static String pintaEspacios(int espacios){
        String resultado = "";
        for (int i = 1; i <= espacios; i++) {
            resultado += " ";
        }
        return resultado;
    }

    public static void main(String[] args) {
        int alt1 = 10, alt2 = 5, espacios = 10;

        for (int i = 1; i <= alt1; i++) {
            String linea = "";

            linea += pintaPiramide(alt1, i);

           
            linea += pintaEspacios(espacios);

           
            if (i <= alt1 - alt2) {
              
                linea += pintaEspacios(alt2 * 2 - 1);
            } else {
                
                int filaRelativa = i - (alt1 - alt2);
                
                linea += pintaPiramide(alt2, filaRelativa);
            }

            System.out.println(linea);
        }
    }
}


