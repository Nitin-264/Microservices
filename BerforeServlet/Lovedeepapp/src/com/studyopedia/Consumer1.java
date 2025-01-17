package com.studyopedia;

class Movie {
    private String name;
    private String hero;
    private String heroine;
    
    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
        
        System.out.println("The name of movie is ::" + name);
        System.out.println("The name of hero is ::" + hero);
        System.out.println("The name of heroine is ::" + heroine);
    }
}

public class Consumer1 {

    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        addMovie(movies);
    }

    public static void addMovie(Movie[] movies) {
        Movie m1 = new Movie("kgf", "Rocky", "Reena");
        Movie m2 = new Movie("kgf1", "Rocky1", "Reena1");
        Movie m3 = new Movie("kgf2", "Rocky2", "Reena2");
        
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
    }
}
