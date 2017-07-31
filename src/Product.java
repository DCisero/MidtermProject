public class Product {

    private String Name;
    private String Category;
    private String Description;
    private double Price;


    public Product() {
        Name = "";
        Category = "";
        Description = "";
        Price = 0;
    }

    public Product(String Name, String Category, String Description, double Price) {


        this.Name = Name;
        this.Category = Category;
        this.Description = Description;
        this.Price = Price;
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


    public String toString (){
        return Name + Category + Description + Price;
    }

}