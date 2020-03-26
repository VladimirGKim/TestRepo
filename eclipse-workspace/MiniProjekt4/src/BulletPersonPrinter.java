public class BulletPersonPrinter extends PersonPrinter{

	@Override
	public void printNames(Person[] items) {
		// TODO Auto-generated method stub
		for(int i=0; i<items.length; i++) {
			System.out.println("* " + items[i].getName());
		}
	}

}
