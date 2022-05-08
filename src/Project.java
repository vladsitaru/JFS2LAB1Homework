import java.util.*;

public class Project {
    private final String name;
    private final int price;
    private final List<category> categories;

    public Project(String name, int price, List<category> categories) {
        this.name = name;
        this.price = price;
        this.categories = new ArrayList<>(categories);
    }



    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<category> getCategories() {
        return new ArrayList<>(categories);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return price == project.price && Objects.equals(name, project.name) && Objects.equals(categories, project.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories);
    }


}

enum category {
    ELECTRONICS,
    CLOTHES,
    FOOD,
    DYI
}

