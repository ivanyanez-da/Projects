public class Generator extends Password {

    public Generator(int longitud) {
            super(longitud);
            this.contraseña = generar_contraseña();
    }

    public String generar_contraseña() {

        char[] caracteres_incluidos = new char[75]; // 75 caracteres desde el 0 hasta el 9,
                                                    // A hasta Z y a hasta z
        for (int i = 0; i < caracteres_incluidos.length; i++){
            caracteres_incluidos[i] = (char)(48 + i); // 48 es el valor ASCII del caracter '0',
            // y se suman los valores de i para obtener los siguientes caracteres
        }

        String contraseña_nueva = new String();
        for (int i = 0; i < this.longitud; i++){
            int posicion_aleatoria = (int) (Math.random() * caracteres_incluidos.length);
            char caracter = caracteres_incluidos[posicion_aleatoria];
            contraseña_nueva += caracter;
        }
        return contraseña_nueva;
    }
}
