package OneThirtySix;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {
    public static void main(String[] args) {
        Collection<Movies> movies = new ArrayList<>();
        movies.add(new Movies("aaa", 9.7, "123"));
        movies.add(new Movies("bbb", 9.3, "34"));
        movies.add(new Movies("ccc", 8.3, "45"));

        System.out.println(movies);

        for (Movies movie : movies) {
            System.out.println(movie.getName());
            System.out.println(movie.getScore());
            System.out.println(movie.getActor());
        }
    }
}
