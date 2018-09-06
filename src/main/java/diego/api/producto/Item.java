package diego.api.producto;

public class Item {

    private final String id;
    private final String name;
    private final String description;
    private final String image;
    private final String price;

    public Item(String id, String name, String description, String image, String price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getImage()
    {
        return image;
    }

    public String getPrice()
    {
        return price;
    }
}