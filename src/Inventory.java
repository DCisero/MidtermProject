import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Inventory {
    public static ArrayList<Product> readFile(String filename) {
        ArrayList<Product> inventoryList = new ArrayList<Product>();

            try {
                Path inventoryPath = Paths.get(filename);
                File inventoryFile = inventoryPath.toFile();
                FileReader fileRdr = new FileReader(inventoryFile);
                BufferedReader in = new BufferedReader(fileRdr);

                //read in the first line
                String line = in.readLine();

                //as long as there's another line
                while (line != null) {
                    //break the line apart based on tabs
                    String[] details = line.split("\t");

                    if (details.length < 4) {
                        System.out.println("Bad line format--halting read");
                        break;
                    }

                    //take the first item and put it into the Product's name
                    String Name = details[0];
                    //take the second item and put into Product's Category
                    String Category = details[1];
                    //take the third item and put into Product's Description
                    String Description = details[2];
                    //take the fourth item, turn it to double, put into Price
                    double Price = Double.parseDouble(details[3]);

                    //construct a new Product object from the previous data
                    Product c = new Product(Name, Category, Description, Price);

                    //add the new Product into an ArrayList
                    inventoryList.add(c);

                    //read in the next line for the next iteration
                    line = in.readLine();
                }

            } catch (IOException e) {
                System.out.println(e);
                return null;
            }

            return inventoryList;
        }
    }


