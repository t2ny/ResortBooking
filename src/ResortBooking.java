
public abstract class ResortBooking{
  private String name;
  private int spaVisits;
  private int carteMeals;

  /**
  @param nameIn The name of the tourist.
  @param spaVisitsIn The number of spas planned.
  @param carteMealsIn The number of carte meals they plan on having.
  **/
  public ResortBooking(String nameIn, int spaVisitsIn, int carteMealsIn){
    name = nameIn;
    spaVisits = spaVisitsIn;
    carteMeals = carteMealsIn;
  }
  /**
  This abstract method returns the total cost.
  @return The cost of the vacation.
  **/
  public abstract double getTotal();

  /**
  This abstract method returns the room number randomly.
  @return The room number.
  **/
  public abstract int getBuildingNum();

  /**
  This method returns the name.
  @return The guest name.
  **/
  public String getName(){
    return name;
  }
  /**
  This method returns the number of spa visits.
  @return The number of spa visits.
  **/
  public int getSpaVisits(){
    return spaVisits;
  }
  /**
  This method returns the number of carte meals.
  @return The number of carte meals.
  **/
  public int getCarteMeals(){
    return carteMeals;
  }
}
