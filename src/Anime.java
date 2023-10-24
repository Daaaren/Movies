public class Anime extends Movies {
    private int episode;

    public Anime(double r, String prod, int time, int episode) {
        super(r, prod, time);
        this.episode = episode;
    }

    @Override
    public void Com() {
        System.out.println("WOW");
    }

    public Anime(){

    }
}