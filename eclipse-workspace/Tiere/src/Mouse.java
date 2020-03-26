//--------------------- Aufgabe 2 ---------------------
public class Mouse extends Animal
{

	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub
		if(food.getTyp().equals("Cheese") || food.getTyp().equals("Peanuts")) {
			if(food.getVolume() <= hunger) {
				hunger-=food.getVolume();
			} else {
				hunger = 0;
			}
		}
	}
	
	public void getHungry()
	{
		hunger+=5;
	}
}