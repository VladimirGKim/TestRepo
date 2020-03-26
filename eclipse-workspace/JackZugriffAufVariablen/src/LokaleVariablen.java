public class LokaleVariablen {
	public int number;


	public LokaleVariablen() {
		number = 10;
	}

	// ------------------ Aufgabe 1---------------------
		public int returnTen(int a) {
			int ten;
			if (a < 10) {
				ten = a;
				while (ten < 10) {
					ten++;
				}
			} else if (a > 10) {
				ten = a;
				while (ten > 10) {
					ten--;
				}
			} else {
				ten = a;
			}

			return ten ;

		}	

	// ------------------ Aufgabe 2 ---------------------
	public void setNewNumber(Integer a) {
		this.number = a;
	}

	public Integer getNewNumber() {
		return number;
	}
	
	// ------------------ Aufgabe 3 ---------------------
	public void increase(int number) {
		this.number = this.number + number;
	}

	
	

}
