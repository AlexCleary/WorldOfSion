
public class Builder implements Characters {
	
	//Properties
	//Common interface properties
	private String name;
	private int age;
	//Unique properties
	private int skillLevel;
	private String skillType;
	private int energyLevel = 10; 
	
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
		//Set skill level, depending on age
			if (age <= 20) {
				skillLevel = 1;
			}
			else if (age <= 40) {
				skillLevel = 2;
			}
			else {
				skillLevel = 3;
			}
	}
	public int getAge() {
		return age;
	}
	//Unique Builder functions
	public int getSkillLevel() {
		return skillLevel;
	}
	//Return a description of the builder's skillLevel
	public String getSkillLevelDesc() {
		if (skillLevel == 1) {
			return "Amatuer";
		}
		else if (skillLevel == 2) {
			return "Professional";
		}
		else {
			return "Expert";
		}
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setSkillType(String type) {
		skillType = type;
	}
	public String getSkillType() {
		return skillType;
	}	
	//Build() method that depends on skillLevel and energyLevel
	public void build(String item) {
		//Checks to see if Builder has enough energy to build the item
		if ((skillLevel == 1 && energyLevel >= 3)||(skillLevel == 2 && energyLevel >= 2)||(skillLevel == 3 && energyLevel >= 1)){
			//Each skillLevel depletes the energyLevel by a distinct number
			if (skillLevel == 1) {
				energyLevel -= 3;
			}
			else if (skillLevel == 2){
				energyLevel -= 2;
			}
			else {
				energyLevel -= 1;
			}
			//Output "item" built and change in energyLevel
			System.out.println(item + " has been built! Energy depleted by " + (10 - energyLevel));
		}
		else {
			//Indicates not enough energy to build "item"
			System.out.println("I don't have enough energy to build " + item);
		}		 
	}
	
	//Increases the energy level by x
	public void restoreEnergy(int x) {
		energyLevel += x;
		System.out.println("Energy restored by " + x);
		//Caps the energy level at 10 max
		if (energyLevel > 10) {
			energyLevel = 10;
		}
		else {}
	}

}
