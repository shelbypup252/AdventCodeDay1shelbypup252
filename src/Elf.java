import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;



/**
 * Class for the Elf object
 * @author John
 */
public class Elf {

  private int number;
  private ArrayList<Integer> calories;
  private int sum;


  //constructors

  /**
   * Overridder constructor for elf class in case no values are given
   */
  public Elf() {
    this.number = 0;
    this.calories = new ArrayList<Integer>();
    this.sum = 0;
  }

  /**
   * Constructor for the Elf class
   * @param number the number of the elf
   * @param calories the calories of the elf
   */
  public Elf(int number, ArrayList calories) {
    this.number = number;
    this.calories = calories;
    this.sum = 0;
  }



  //accessors


  /**
   * Getter for elf number
   * @return the elf number
   */
  public int getNumber() {
      return number;
  }

  /**
   * Getter for calories
   * @return the calories
   */
  public ArrayList getCalories() {
      return calories;
  }

  /**
   * Getter for sum
   * @return the sum of the calories
   */
  public int getSum() {
      return sum;
  }



  //mutators

  /**
   * Setter for the number of the elf
   * @param number the number of the elf
   */
  public void setNumber(int number) {
      this.number = number;
  }

  /**
   * Setter for calories
   * @param calories the calories to set
   */
  public void setCalories(ArrayList calories) {
      this.calories = calories;
  }

  /**
   * Setter for sum
   * @param sum the sum to set
   */
  public void setSum(int sum) {
      this.sum = sum;
  }



  //utility method(s)

  /**
   * Sets the sum of the elf to the sum of the calories by adding each element in calories
   */
  public void sumCalories() {
    int sum = 0;
    for (int i = 0; i < calories.size(); i++) {
      sum += calories.get(i);
    }
    this.setSum(sum);
  }








}
