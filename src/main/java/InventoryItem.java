
public class InventoryItem{

  private String title;
  private int qty;

  public InventoryItem(String title, int qty){
    this.title = title;
    this.qty = qty;
  }

  void display(){
    System.out.println(this.title + ", " + this.qty);
  }

  public void inc(){
    this.qty += 12;
  }
}
