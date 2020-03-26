public class BulletPersonPrinter extends PersonPrinter{

	@Override
	public void printNames(Person[] items) {
		// TODO Auto-generated method stub
		for(Person person: items) {
			System.out.println("* " + person.getName());
		}
	}

}
