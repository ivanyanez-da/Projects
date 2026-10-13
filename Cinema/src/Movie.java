public class Movie {
    String title;
    int  duration;
    int  minimum_age;
    String director;
    double price;

    public Movie(String title, int duration, int minimum_age, String director, double price) {
        this.title = title;
        this.duration = duration;
        this.minimum_age = minimum_age;
        this.director = director;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getMovie() {
        return title;
    }

    public void setMovie(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMinimum_age() {
        return minimum_age;
    }

    public void setMinimum_age(int minimum_age) {
        this.minimum_age = minimum_age;
    }

    public String getDirector() {
            return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
