package section8.c_polymorphism_practise;

public class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s\n".repeat(3), "Beyond science", "Super humans", "Surreal scenes");
    }
}
