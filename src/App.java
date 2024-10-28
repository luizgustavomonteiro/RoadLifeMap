
public class App {
    public static void main(String[] args) throws Exception {
   
        //Create a new Roadmap
        Roadmap roadmap = new Roadmap("Java");
        
        //Create a new category and add it to the roadmap

        Category javaStudies = new Category("Study");
        roadmap.addCategory(javaStudies);

        roadmap.display();

        Task task = new Task("Java Operators");
        
        task.testTask();

    }
}
