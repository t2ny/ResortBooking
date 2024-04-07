
public class TouristPackageBooking extends ResortBooking {

  /**
   * @param nameIn       The name of the tourist.
   * @param spaVisitsIn  The number of spas planned.
   * @param carteMealsIn The number of carte meals they plan on having.
   **/
  public TouristPackageBooking(String nameIn, int spaVisitsIn, int carteMealsIn) {
    super(nameIn, spaVisitsIn, carteMealsIn);
  }

  /**
   * This method returns the room number randomly between 2 and 5.
   * 
   * @return The room number.
   **/
  public int getBuildingNum() {
    int num = (int) (Math.random() * 5) + 1;
    if (num == 1) {
      num += 1;
    }
    return num;
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

    meals = super.getCarteMeals() * 35.00;
    spa = (super.getSpaVisits() * 100) + 25;

    total = meals + spa + 1475;

    return total;
  }
}
