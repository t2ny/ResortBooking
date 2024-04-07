
public class ElitePackageBooking extends ResortBooking {

  /**
   * @param nameIn       The name of the tourist.
   * @param spaVisitsIn  The number of spas planned.
   * @param carteMealsIn The number of carte meals they plan on having.
   **/
  public ElitePackageBooking(String nameIn, int spaVisitsIn, int carteMealsIn) {
    super(nameIn, spaVisitsIn, carteMealsIn);
  }

  /**
   * This method returns the room number.
   * 
   * @return The room number.
   **/
  public int getBuildingNum() {
    return 1;
  }

  /**
   * This method returns the total cost.
   * 
   * @return The cost.
   **/
  public double getTotal() {
    double total;
    double meals;
    double spa;

    if (super.getCarteMeals() > 3) {
      meals = (super.getCarteMeals() * 35) - 105;
    } else {
      meals = 0;
    }
    spa = super.getSpaVisits() * 75;

    total = meals + spa + 2250;

    return total;
  }
}
