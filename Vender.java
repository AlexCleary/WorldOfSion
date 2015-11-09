
public class Vender implements Characters {
	
	//Properties
	//Common interface properties
	private String name;
	private int age;
	//Unique properties
	private String gender;
	private String[] inventory = new String[3]; 
	private int inventoryCount = 0;
	
	//Methods
	//Common interface functions
	public void setName(String input) {
		name = input;
	}
	public String getName() {
		return name;
	}
	public void setAge(int input) {
		age = input;
	}
	public int getAge() {
		return age;
	}
	//Unique Vender functions
	public void setGender(String input) {
		gender = input;
	}
	public String getGender() {
		return gender;
	}
	public String greetCustomer() {
		//return string that uses the name variable
		return "Welcome to "+ name + "'s shop!";
	}
	public String getInventory() {
		String items = "";
		//Loops through inventory array
		for (int i = 0; i < inventory.length ; i++) {
		    //Adds item to string
			items += inventory[i] + " | ";
		}
		//Returns string containing all of the items
		return items;
	}
	public int getInventoryCount() {
		//inventoryCount starts at 0 and increments by one when addItem() is called
		return inventoryCount;
	}
	public void addItem(String item) {
		//Checks to see if inventory is full
		if(getInventoryCount() == inventory.length) {
			System.out.println("Cannot add '" + item + "': Inventory Full");
		}
		//Otherwise loops through the inventory
		else{
			for (int i =0; i < inventory.length ; i ++){
				//Adds item to inventory if that slot is empty
				if (inventory[i] == null) {
					inventory[i] = item;
					//Adds to inventory count
					inventoryCount+=1;
					//Breaks loop
					break;
				}
				else {}
				
			}
		}
	}
	public void removeItem(String item) {
		//Checks to see if inventory is empty
		if(getInventoryCount() == 0) {
			System.out.println("Cannot Remove Item: Inventory Empty");
		}
		//Otherwise loops through the inventory
		else {
			//Variable to determine whether the item exists in the inventory
			boolean found = false;
			for (int i =0; i < inventory.length ; i ++){
				//If it matches, make that inventory slot empty (set value to null)
				if (inventory[i] == item) {
					inventory[i] = null;
					//Decrement inventoryCount
					inventoryCount-=1;
					//Indicate that the item was found
					found = true;
					//Break loop
					break;
				}
				else {}
				
			}
			//If there are no matches, print a message
			if (found == false) {
				System.out.println("There is no '" + item + "' in the inventory.");
			}
		}
	}
	
}
