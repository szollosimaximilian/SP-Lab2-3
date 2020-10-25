package MainPackage;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String title;

    private List <Element> elements = new ArrayList<Element>();

    SubChapter(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        this.elements.add(new Paragraph(paragraph));
    }

    public void createNewImage(String image) {
        this.elements.add(new Image(image));
    }

    public void createNewTable(String table) {
        this.elements.add(new Table(table));
    }


    public void print() {
        System.out.println("Title" + this.title);
        for(Element element : this.elements) {
            element.print();
        }

    }
}
