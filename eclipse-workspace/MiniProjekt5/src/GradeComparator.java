import java.util.Comparator;

/**
 * Vergleicht zwei Student-Objekte miteinander 
 */
public class GradeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s, Student t) {
		int result = 0;
		if(s.getAverageGrade() < t.getAverageGrade()){
			result = -1;
		} else if(s.getAverageGrade() > t.getAverageGrade()) {
			result = 1;
		}

		return result;
	}

}
