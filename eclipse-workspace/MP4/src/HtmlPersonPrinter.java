public class HtmlPersonPrinter extends PersonPrinter{

	@Override
	public void printNames(Person[] items) {
		// TODO Auto-generated method stub
		System.out.println("<ul>");
		for(Person person: items) {
			System.out.println("<li>" + person.getName() + "</li>");
		}
		System.out.println("</ul>");
	}

}
