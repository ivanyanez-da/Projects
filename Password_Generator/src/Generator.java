public class Generator extends Password {

    public Generator(int length_password) {
            super(length_password);
            this.password = generate_password();
    }

    public String generate_password() {

        char[] characters_included = new char[75]; // 75 caracteres desde el 0 hasta el 9,
                                                    // A hasta Z y a hasta z
        for (int i = 0; i < characters_included.length; i++){
            characters_included[i] = (char)(48 + i); // 48 es el valor ASCII del caracter '0',
            // y se suman los valores de i para obtener los siguientes caracteres
        }

        String new_password = new String();
        for (int i = 0; i < this.lenght_password; i++){
            int random_position = (int) (Math.random() * characters_included.length);
            char character = characters_included[random_position];
            new_password += character;
        }
        return new_password;
    }
}
