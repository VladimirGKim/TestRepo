//--------------------- Aufgabe 1 ---------------------
public class Dog extends Animal
{

	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub
		if(food.getTyp().equals("Dogfood")) {
			if(food.getVolume() <= hunger) {
				hunger-=food.getVolume();
			} else {
				hunger = 0;
			}
		}
		
	}

}