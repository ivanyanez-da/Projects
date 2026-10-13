public class Password {

    int longitud;
    String contraseña;

    public Password(int longitud) {
        this.longitud = longitud;

    }
    public Password(int longitud,String contraseña) {
        this.longitud = longitud;
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
