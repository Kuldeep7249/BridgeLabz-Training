import java.util.*;
class Movie{
    String name;
    double rating;
    int year;
    Movie(String n,double r,int y){name=n;rating=r;year=y;}
}
public class TopTrendingMovies{
    public static void main(String[] args){
        List<Movie> movies=List.of(
            new Movie("A",9.1,2024),
            new Movie("B",8.5,2023),
            new Movie("C",9.0,2025),
            new Movie("D",7.8,2022),
            new Movie("E",9.3,2025),
            new Movie("F",8.9,2024)
        );
        movies.stream()
              .filter(m->m.year>=2023)
              .sorted((a,b)->Double.compare(b.rating,a.rating))
              .limit(5)
              .forEach(m->System.out.println(m.name));
    }
}