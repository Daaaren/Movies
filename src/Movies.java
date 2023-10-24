public class Movies {
    private double rating;
    private String producer;
    private int time;

    public Movies(double r, String prod, int time ) {   // конструктор
        rating = r;
        producer = prod;
        this.time = time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }


    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getProducer() {
        return producer;
    }
    public void Com(){
        System.out.println("Cool");
    }

    public Movies(){

    }
}
