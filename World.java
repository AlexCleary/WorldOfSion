
public class World {
	
	public static void main(String[] args) {
		//Create Builder object
		Builder b1 = new Builder();
		//Call Builder functions
		b1.setName("Bob");
		b1.setAge(55);
		b1.setSkillType("Carpentry");
		System.out.println("Name = " + b1.getName());
		System.out.println("Age = " + b1.getAge());
		System.out.println("Skill Type: " + b1.getSkillType());
		System.out.println("Skill Level = " +b1.getSkillLevel()  + "/3" + ", " + b1.getSkillLevelDesc());
		System.out.println("Energy Level = " + b1.getEnergyLevel() + "/10");
		b1.build("Chair");
		System.out.println("Energy Level = " + b1.getEnergyLevel() + "/10");
		b1.restoreEnergy(1);
		System.out.println("Energy Level = " + b1.getEnergyLevel() + "/10");
		
		System.out.println("_______________________________________________");
		
		//Create Vender object
		Vender v1 = new Vender();
		//Call Vender functions
		v1.setName("Steve");
		v1.setAge(33);
		v1.setGender("male");
		System.out.println(v1.greetCustomer());
		System.out.println("Name = " + v1.getName());
		System.out.println("Age = " + v1.getAge());
		System.out.println("Gender = " + v1.getGender());
		System.out.println("Inventory: " + v1.getInventory());
		System.out.println("Items for sale = " + v1.getInventoryCount());
		//Add items then display inventory
		v1.addItem("Apple");
		System.out.println("Inventory: " + v1.getInventory());
		System.out.println("Items for sale = " + v1.getInventoryCount());
		v1.addItem("Candle");
		v1.addItem("Horse");
		System.out.println("Inventory: " + v1.getInventory());
		System.out.println("Items for sale = " + v1.getInventoryCount());
		//Attempt to add item to full inventory
		v1.addItem("Orange");
		//Remove item
		v1.removeItem("Horse");
		System.out.println("Inventory: " + v1.getInventory());
		System.out.println("Items for sale = " + v1.getInventoryCount());
		v1.addItem("Orange");
		System.out.println("Inventory: " + v1.getInventory());
		System.out.println("Items for sale = " + v1.getInventoryCount());
		//Attempt to remove nonexistent item
		v1.removeItem("banana");	
	}

}
