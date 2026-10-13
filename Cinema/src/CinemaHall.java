public class CinemaHall {
    String[][] seat;

    public CinemaHall() {
        seat = new String[8][10];
    }

    public String[][] getSeat() {
        return seat;
    }

    public void setSeat(String[][] seat) {
        this.seat = seat;
    }
}
