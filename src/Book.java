class Book {
    private String name;
    private int numberOfPages;
    private String author;
    private String publishingHouse;

    public Book(){}

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int numberOfPages, String publishingHouse){
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString(){
        return String.format("name : %s, pages : %s, author : %s, publishing house : %s",
                name, numberOfPages, author,publishingHouse);
    }

}
