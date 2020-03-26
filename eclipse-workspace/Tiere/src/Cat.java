//--------------------- Aufgabe 3 ---------------------
public class Cat extends Animal
{
	public void eat(Mouse mouse)
	{
		if(mouse.getWeight()/2 <= hunger) {
			hunger-=mouse.getWeight()/2;
		} else {
			hunger = 0;
		}
	}

	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub
		if(food.getTyp().equals("Catfood")) {
			if(food.getVolume() <= hunger) {
				hunger-=food.getVolume();
			} else {
				hunger = 0;
			}
		}
	}	
}