package section8.c_polymorphism_practise;

public class Movie {
    private String title;
    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instance = this.getClass().getSimpleName();
        System.out.printf("%s is a %s film.\n", title, instance);
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
