public class BookDataBase {

    private String SKU;
    private String Title;
    private String Author;
    private String Description;
    private double Price;



    //default constructor
    public BookDataBase() {
    }

    //overloaded constructor
    public BookDataBase(String SKU, String title, String author,
                        String description, double price) {
        this.SKU = SKU;
        this.Title = title;
        this.Author = author;
        this.Description = description;
        this.Price = price;
    }

    public String getDisplayText() {
        return  ("SKU: " + SKU + "Title: " + Title + "Favourite Color: " +
                Author + "Description: " + Description + "Price: " + Price);
    }


    //    getters
    public String getSKU() {
        return SKU;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    //setters
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
