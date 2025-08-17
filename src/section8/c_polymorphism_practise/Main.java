package section8.c_polymorphism_practise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie myMovie = new Adventure("Star Wars");
//        myMovie.watchMovie();
//        Movie someMovie = new Comedy("Three idiots");
//        someMovie.watchMovie();
//        Movie otherMovie = new ScienceFiction("Interstellar");
//        otherMovie.watchMovie();

        while (true) {
            System.out.println("Enter movie type - A for Adventure, C for Comedy, S for ScienceFiction and Q to Exit:");
            Scanner s = new Scanner(System.in);
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie name:");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }

}
