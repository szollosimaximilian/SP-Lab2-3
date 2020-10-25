package MainPackage;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String title;
    private List<SubChapter> subChapters = new ArrayList<SubChapter>();


    Chapter(String title) {
        this.title = title;
    }

    public int createSubChapter(String title) {
        this.subChapters.add(new SubChapter(title));
        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        return this.subChapters.get(index);
    }
}
