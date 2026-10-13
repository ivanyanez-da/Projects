public class Main {
    public static void main(String[] args) {
        Password password = new Generator(12);// Se crea un objeto de la clase Generator con una longitud de 12 caracteres
        System.out.println("Contraseña generada: " + password.getPassword()); // Se imprime la contraseña generada
        IsStrong check_password_strength = new IsStrong(12, password.getPassword()); // Se crea un objeto de la clase IsStrong con la longitud y la contraseña generada
        System.out.println("¿La contraseña es fuerte? " + check_password_strength.is_strong());
    }
}
