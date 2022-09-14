public class Book {
    /*
- Ett namn
- En författare
- Ett år
- En upplaga
- Status: tillgänglig eller inte

En toString metod som returnerar en sträng med bokinformationen.
     */
    private String name;
    private String author;
    private String year;
    private String upplaga;
    private boolean status = true;
    //true = tillgänglig

    public Book (String name, String author, String year, String upplaga, boolean status){
        this.name = name;
        this.author = author;
        this.year = year;
        this.upplaga = upplaga;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getUpplaga() {
        return upplaga;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
       return String.format("Name: %s\nAuthor: %s\nYear: %s\nUpplaga: %s\n", name, author, year, upplaga);
    }
}
