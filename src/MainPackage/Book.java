package MainPackage;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapters = new ArrayList<Chapter>();


    Book(String title){
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
    public void addAuthor(Author autor) {
        this.author = autor;
    }

    public int createChapter(String chapterTitle) {
        this.chapters.add(new Chapter(chapterTitle));
        return this.chapters.size()-1;
    }

    public Chapter getChapter(int index) {
        return this.chapters.get(index);
    }

}
