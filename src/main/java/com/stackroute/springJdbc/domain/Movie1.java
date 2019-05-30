package com.stackroute.springJdbc.domain;

public class Movie1 {
        private int movieid;
        private  String MovieName;
        private int Releaseyear;
        private float Rattings;

    public Movie1(int movieid) {
        this.movieid = movieid;
    }

    public Movie1(String MovieName , int movieid) {
            this.MovieName = MovieName;
            this.movieid = movieid;
        }

    public int getMovieId() {
            return movieid;
        }

        public void setMovieId(int movieid) {
            this.movieid = movieid;
        }

        public String getMovieName() {
            return MovieName;
        }

        public void setMovieName(String MovieName) {
            this.MovieName = MovieName;
        }

        public int getYear() {
            return Releaseyear;
        }

        public void setYear(int Releaseyear) {
            this.Releaseyear = Releaseyear;
        }

        public float getRatings() {
            return Rattings;
        }

        public void setRatings(float Rattings) {
            this.Rattings = Rattings;
        }

        public Movie1() {
        }

        public Movie1(int movieid, String MovieName, int Releaseyear, float Rattings) {
            this.movieid = movieid;
            this.MovieName = MovieName;
            this.Releaseyear = Releaseyear;
            this.Rattings = Rattings;
        }

        @Override
        public String toString() {
            return "Movie{" +
                    "movieId='" + movieid + '\'' +
                    ", movieName='" + MovieName + '\'' +
                    ", year=" + Releaseyear +
                    ", ratings=" + Rattings +
                    '}';
        }

}

//    private String firstName;
//    private String id;
//
//    public Movie1() {}
//
//    public Movie1(String firstName, String id) {
//        this.firstName = firstName;
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Movie1{" +
//                "firstName='" + firstName + '\'' +
//                ", id='" + id + '\'' +
//                '}';
//    }

