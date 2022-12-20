
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

/**
 * Main class for the Elf program. :P
 */
public class Main {


  /**
   * Main method for the Elf program
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    File inputFile = new File("input.txt");
    try {
      Scanner file = new Scanner(inputFile);

      ArrayList<Elf> elves = new ArrayList<Elf>();

      while (file.hasNextLine()) {
        int i = 0;
        ArrayList calories = new ArrayList();
        while (file.hasNextInt()) {
          calories.add((Integer)file.nextInt());
        }

        Elf elf = new Elf(i, calories);
        elf.sumCalories();
        elves.add(elf);
      }

      //who has the largest sum?
      Elf largestSum = new Elf();
      for (int i = 0; i < elves.size(); i++) {
        if (elves.get(i).getSum() > largestSum.getSum()) {
          largestSum = elves.get(i);
        }
      }

      System.out.println("The elf with the largest sum is elf #" + largestSum.getNumber()
          + " with a sum of " + largestSum.getSum());

      file.close();

    } catch (IOException e) {
      System.out.println("File not found");
    }

  }

}
