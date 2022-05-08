import java.util.HashMap;
import java.util.List;

public class ProjectMain {

    public static void main(String[] args) {

        Project project1 = new Project("Project1", 50, List.of(category.ELECTRONICS));
        Project project3 = new Project("Project3", 150, List.of(category.DYI));
        Project project4 = new Project("Project4", 200, List.of(category.CLOTHES));



        //testing imutability
        //1. get the category and set a new value
        project1.getCategories().set(0, category.DYI);
        System.out.println(project1); //change could not be made - category remains ELECTRONICS

        //2.
        category food = category.FOOD;

        Project project2 = new Project("Project2", 100, List.of(food));

        System.out.println(food + " - before change");
        food = category.CLOTHES;
        System.out.println(food + " - after change");
        System.out.println(project2); // change could not be made - food remain food for object


    }
}
