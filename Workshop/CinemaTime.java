import java.util.*;

class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

public class CinemaTime {
    List<String> titles = new ArrayList<>();
    List<String> times = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        titles.add(title);
        times.add(time);
    }

    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i + 1) + ". " + titles.get(i) + " at " + times.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found with keyword: " + keyword);
        }
    }

    public void displayAllMovies() {
        String[] movieReport = new String[titles.size()];
        for (int i = 0; i < titles.size(); i++) {
            movieReport[i] = String.format("%d. %s at %s", i + 1, titles.get(i), times.get(i));
        }
        for (String s : movieReport) {
            System.out.println(s);
        }
    }

    private boolean isValidTime(String time) {
        try {
            String[] parts = time.split(":");
            if (parts.length != 2) return false;
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        CinemaTime manager = new CinemaTime();
        try {
            manager.addMovie("Avengers", "15:30");
            manager.addMovie("Inception", "18:45");
            manager.addMovie("Batman", "25:99"); 
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        manager.displayAllMovies();

        System.out.println("Search Result:");
        manager.searchMovie("bat");
    }
}
