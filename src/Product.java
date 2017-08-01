public class Product {

    private String name;
    private String category;
    private String description;
    private double price;


    public Product() {
        name = "";
        category = "";
        description = "";
        price = 0;
    }

    public Product(String name, String category, String description, double price) {

        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public String getname() {

        return name;
    }

    public void setname(String name) {

        this.name = name;
    }

    public String getcategory() {

        return category;
    }

    public void setcategory(String category) {

        this.category = category;
    }

    public String getdescription() {

        return description;
    }

    public void setdescription(String description) {

        this.description = description;
    }

    public double getprice() {

        return price;
    }

    public void setprice(double price) {

        this.price = price;
    }


    public String toString (){

        return name + "\t" + category + "\t" + description + "\t" + "$" + price;
    }

}