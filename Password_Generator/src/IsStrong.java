public class IsStrong extends Password {

    public IsStrong(int length_password, String password) {
        super(length_password, password);
    }

    public String is_strong() {
        boolean numbers = false;
        boolean uppercase = false;
        boolean lowercase = false;

        for (int i = 0; i < this.password.length(); i++){
            char caracter = this.password.charAt(i);

            if (Character.isDigit(caracter)){
                numbers = true;
            }
            if (Character.isUpperCase(caracter)){
                uppercase = true;
            }
            if (Character.isLowerCase(caracter)){
                lowercase = true;
            }
        }


        String security_type= "";
        if (lenght_password > 8 && numbers && uppercase){
            security_type = "La contraseña creada es muy fuerte";
        }
        else if (lenght_password > 8 && numbers){
            security_type = "La contraseña creada es fuerte";
        }
        else if (lenght_password > 8 && uppercase){
            security_type = "La contraseña creada es fuerte";
        }
        else if (lenght_password > 8 && lowercase){
            security_type = "La contraseña creada es débil";
        }
        else if (lenght_password <= 8 && lowercase){
            security_type = "La contraseña creada es muy débil";
        }
        return security_type;
    }
}
