import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner user = new Scanner(System.in);
        ArrayList<BookDataBase> library = new ArrayList<BookDataBase>();


        BookDataBase book_1 = new BookDataBase("Java1001", "Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50);

        BookDataBase book_2 = new BookDataBase("Java1002", "Thinking in Java", "Bruce Eckel",
                " Details about Java under the hood", 20.00);

        BookDataBase book_3 = new BookDataBase("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
                "Everything you need to know in one place", 45.00);

        BookDataBase book_4 = new BookDataBase("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart",
                " Fun with Python", 10.50);

        BookDataBase book_5 = new BookDataBase("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Rasperry Pi", 16.50);

        BookDataBase book_6 = new BookDataBase("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris",
                "A dozen fiendishly fun projects for the Rasberry Pi!", 14.75);

        BookDataBase book_7 = new BookDataBase("Elec1007", "Delmar's Standard Textbook of Electricity", "Stephen L. Herman",
                "Comprehensive coverage of basic electrical theory ", 100.79);

        BookDataBase book_8 = new BookDataBase("VAP1008", "Visual Anatomy & Physiology ", "by Frederic H. Martini, William C. Ober",
                "Using Art Effectively with the Most Visual Approach to A&P", 178.49);

        BookDataBase book_9 = new BookDataBase("Chosen1009", "The Chosen", "Taran Matharu",
                "People have vanished with no explanation. A group of teenagers are about to discover why.", 18.99);

        BookDataBase book_10 = new BookDataBase("Grit1010", "Grit: The Power of Passion and Perseverance", "Angela Duckworth",
                "The daughter of a scientist who frequently noted her lack of 'genius' ", 17.99);

        BookDataBase book_11 = new BookDataBase("MrsE1011", "Mrs. Everything", "Jennifer Weiner",
                " Journey through history—and herstory—as these two sisters navigate a changing America over the course of their lives.", 28.00);

        BookDataBase book_12 = new BookDataBase("Blue1012", "The Blue Apron Cookbook", "Blue Apron Culinary Team",
                "A beginners cooking guide.", 39.99);

        BookDataBase book_13 = new BookDataBase("Fry1013", "The Complete Air Fryer Cookbook", "Linda Larsen",
                "Amazingly Easy Recipes to Fry, Bake, Grill & Roast with Your Air Fryer!", 9.98);

        BookDataBase book_14 = new BookDataBase("Gene1014", "The Cooking Gene", "Michael W. Twitty",
                "A Journey Through African American Culinary History in the Old South", 26.09);

        //place books into the array list library
        library.add(book_1); library.add(book_2); library.add(book_3);

        library.add(book_4); library.add(book_5); library.add(book_6);

        library.add(book_7); library.add(book_8); library.add(book_9);

        library.add(book_10); library.add(book_11); library.add(book_12);

        library.add(book_13); library.add(book_14);





        //allow user to search book by SKU
        //Scanner


        String SKU ="";

        System.out.println("Please enter the SKU of the book you would like to look up. ");
        SKU = user.nextLine();

        switch (SKU) {
            case "Java1001":
                System.out.println(library.get(0).getDisplayText());
                break;
            case "Java1002":
                System.out.println(library.get(1).getDisplayText());
                break;
            case "Orcl1003":
                System.out.println(library.get(2).getDisplayText());
                break;
            case "Python1004":
                System.out.println(library.get(3).getDisplayText());
                break;
            case "Zombie1005":
                System.out.println(library.get(4).getDisplayText());
                break;
            case "Rasp1006":
                System.out.println(library.get(5).getDisplayText());
                break;
            case "Elec1007":
                System.out.println(library.get(6).getDisplayText());
                break;
            case "VAP1008":
                System.out.println(library.get(7).getDisplayText());
                break;
            case "Chosen1009":
                System.out.println(library.get(8).getDisplayText());
                break;
            case "Grit1010":
                System.out.println(library.get(9).getDisplayText());
                break;
            case "MrsE1011":
                System.out.println(library.get(10).getDisplayText());
                break;
            case "Blue1012":
                System.out.println(library.get(11).getDisplayText());
                break;
            case "Fry1013":
                System.out.println(library.get(12).getDisplayText());
                break;
            case "Gene1014":
                System.out.println(library.get(13).getDisplayText());
                break;
            default:
                System.out.println("Error, enter a correct SKU");



        }











    }
}
