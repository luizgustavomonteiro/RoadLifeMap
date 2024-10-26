import java.util.ArrayList;
import java.util.List;


public class Roadmap {

    String title;
    List<Category> categories;
     
    public Roadmap(String title)
    {
        this.title = title;
        this.categories = new ArrayList<>();
    }

    //Method to add a category to the roadmap
    public void addCategory(Category category)
    {
        categories.add(category);
    }

    public void display()
    {
        System.err.println("Roadmap Title: " + title);
        System.err.println("Categories: ");
        for(Category category : categories)
        {
            category.getCategory();
        }
    }
    
}
