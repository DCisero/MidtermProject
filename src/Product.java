public class Product {

    private int itemNumber;
    private String Name;
    private String Category;
    private String Description;
    private double Price;


    public Product() {
        itemNumber = 0;
        Name = "";
        Category = "";
        Description = "";
        Price = 0;
    }

    public Product(int itemNumber, String Name, String Category, String Description, double Price) {


        this.Name = Name;
        this.Category = Category;
        this.Description = Description;
        this.Price = Price;
        this.itemNumber = itemNumber;
    }

    public int getItemNumber() {

        return itemNumber;
    }
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {

        return Name;
    }

    public void setName(String Name) {

        this.Name = Name;
    }

    public String getCategory() {

        return Category;
    }

    public void setCategory(String Category) {

        this.Category = Category;
    }

    public String getDescription() {

        return Description;
    }

    public void setDescription(String Description) {

        this.Description = Description;
    }

    public double getPrice() {

        return Price;
    }

    public void setPrice(double price) {

        this.Price = price;
    }


    public String toString() {

        String result = "";

        System.out.printf("\"%-2d %-20s %-13s %-18s %.2f", itemNumber, Name, Category, Description, Price);

        return result;
    }
}