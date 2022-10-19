import java.util.ArrayList;
/**
 *
 * @author Kurt Harvey Reyes
 */
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      this.itemList = new ArrayList();
      this.earnings = 0;
      storeList.add(this);
      
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
     if(index >=0 && index < itemList.size()){
        Item foundItem = itemList.get(index);
        earnings += foundItem.getCost();
        System.out.printf("\nYou bought %s for %.2f.\n", foundItem.getName(), foundItem.getCost());
     }
     else {
        System.out.printf("\nThere are only %d items in the store\n", index);     
                 }    
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
      boolean isPresent = false;
      
      for(Item i : itemList){
        if(i.getName().equals(name)){
            earnings += i.getCost();
            System.out.printf("\nYou bought %s for %.2f.\n", i.getName(), i.getCost());
            isPresent = true;
        }  
      }
      if(!isPresent){
          System.out.println("\nThis store does not sell that item.");
      }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)

// get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
      if(itemList.contains(i)){
          earnings += i.getCost();
          System.out.printf("\nYou bought %s for %.2f.\n", i.getName(), i.getCost());
      }
      else {
        System.out.printf("\nThis store does not sell %s.\n", i.getName());  
      }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    itemList.add(i);
      
    // add Item i to store's itemList
  }
  public void filterType(String type){
      System.out.printf("Item Type: %s\n",type);
      for(Item i : itemList){
          if(i.getType().equals(type)){
          System.out.println(i.getName());   
          }
      }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
      System.out.printf("\nMax Cost: %.2f\n",maxCost);
       for(Item i : itemList){
          if(i.getCost() <= maxCost){
          System.out.println(i.getName());   
          }
      }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
      System.out.printf("\nMin Cost: %.2f\n",minCost);
      for(Item i : itemList)
          if(minCost <= i.getCost()){
          System.out.println(i.getName());   
          }
      }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  public static void printStats(){
      for(Store s : storeList){
      System.out.printf("\nStore: %s\nEarnings %.2f\n", s.name, s.earnings);
    // loop over storeList and print the name and the earnings'Store.java'
  }
}
}
