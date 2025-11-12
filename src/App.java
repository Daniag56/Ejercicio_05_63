public class App {
    public static String pintaPiramide(int altura, int fila) {
        String resultado = "";
        if (fila >= 1) {
            // Espacios antes de la pirámide
            for (int i = 1; i <= altura - fila; i++) {
                resultado += " ";
            }
            // Asteriscos de la pirámide
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

            // Primera pirámide
            linea += pintaPiramide(alt1, i);

            // Espacios entre pirámides
            linea += pintaEspacios(espacios);

            // Segunda pirámide: alineada y recta
            if (i <= alt1 - alt2) {
                // Espacios para mantener hueco
                linea += pintaEspacios(alt2 * 2 - 1);
            } else {
                // Fila relativa dentro de la pirámide pequeña
                int filaRelativa = i - (alt1 - alt2);
                // Aquí usamos alt2 para centrarla con SU altura
                linea += pintaPiramide(alt2, filaRelativa);
            }

            System.out.println(linea);
        }
    }
}


