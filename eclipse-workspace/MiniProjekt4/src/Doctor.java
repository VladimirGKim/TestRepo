public class Doctor extends Person{

	private String phdTopic;

	public Doctor(String firstName, String lastName, int yearOfBirth) {
		super(firstName, lastName, yearOfBirth);
	}

	public String getPhdTopic() {
		return phdTopic;
	}

	public void setPhdTopic(String phdTopic) {
		this.phdTopic = phdTopic;
	}

	public String getName() {
		String result ="Dr. "+super.getName();
		return result;
	}
}
