public class Movie {
    String titulo;
    int  duracion_pelicula;
    int  edad_minima;
    String director;
    double precio;

    public Movie(String titulo, int duracion_pelicula, int edad_minima, String director, double precio) {
        this.titulo = titulo;
        this.duracion_pelicula = duracion_pelicula;
        this.edad_minima = edad_minima;
        this.director = director;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMovie() {
        return titulo;
    }

    public void setMovie(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion_pelicula() {
        return duracion_pelicula;
    }

    public void setDuracion_peliculas(int duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
