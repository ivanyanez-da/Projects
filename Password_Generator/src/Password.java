public class Password {

    int lenght_password;
    String password;

    public Password(int lenght_password) {
        this.lenght_password = lenght_password;
    }
    public Password(int lenght_password, String password) {
        this.lenght_password = lenght_password;
        this.password = password;
    }

    public int getLenght_password() {
        return lenght_password;
    }

    public String getPassword() {
        return password;
    }

    public void setLenght_password(int lenght_password) {
        this.lenght_password = lenght_password;
    }

}
