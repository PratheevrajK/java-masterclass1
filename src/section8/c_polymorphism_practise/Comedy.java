package section8.c_polymorphism_practise;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s\n".repeat(3), "Funny artists", "Family entertainer", "Happy ending");
    }
}
