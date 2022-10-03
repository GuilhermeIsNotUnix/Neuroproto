public class Neuroproto {
    private String link;

    public Neuroproto(String link) {
        setLink(link);
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    //public void addNewLink(String link) {
      //  setLink(link);
        //add this.link to storage
    //}
    public void debug() {
        System.out.println("Last link added: " + getLink());
    }
}
