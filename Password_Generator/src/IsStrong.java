public class IsStrong extends Password {

    public IsStrong(int longitud, String contraseña) {
        super(longitud, contraseña);
    }

    public String es_fuerte() {
        boolean numeros = false;
        boolean mayuscula = false;
        boolean minuscula = false;

        for (int i = 0; i < this.contraseña.length(); i++){
            char caracter = this.contraseña.charAt(i);

            if (Character.isDigit(caracter)){
                numeros = true;
            }
            if (Character.isUpperCase(caracter)){
                mayuscula = true;
            }
            if (Character.isLowerCase(caracter)){
                minuscula = true;
            }
        }


        String tipo_de_seguridad = "";
        if (longitud > 8 && numeros && mayuscula){
            tipo_de_seguridad = "La contraseña creada es muy fuerte";
        }
        else if (longitud > 8 && numeros){
            tipo_de_seguridad = "La contraseña creada es fuerte";
        }
        else if (longitud > 8 && mayuscula){
            tipo_de_seguridad = "La contraseña creada es fuerte";
        }
        else if (longitud > 8 && minuscula){
            tipo_de_seguridad = "La contraseña creada es débil";
        }
        else if (longitud <= 8 && minuscula){
            tipo_de_seguridad = "La contraseña creada es muy débil";
        }
        return tipo_de_seguridad;
    }
}
