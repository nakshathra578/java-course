class Movie1 {
    
    private String title;
    private String director;
    private double rating;

    public Movie1(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        setRating(rating); 
    }

    
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    
    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 10.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating");
        }
    }
}

public class Movie {
    public static void main(String[] args) {
      
        Movie1 movie1 = new Movie1("Inception", "Christopher Nolan", 9.0);

        movie1.setRating(11.0); 

       
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Rating: " + movie1.getRating());
    }
}
