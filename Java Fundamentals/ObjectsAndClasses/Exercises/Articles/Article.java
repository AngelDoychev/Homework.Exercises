package Fundametals.ObjectsAndClasses.Exercises.Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public void rename(String title) {
        this.title = title;
    }

    public void edit(String content) {
        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
