import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementierung des Database-Interfaces, die Objekte über Listen des Java
 * Collection-Framework direkt im Speicher verwaltet
 */
public class InMemoryDatabase implements Database {

	private List<Student> students = new LinkedList<>();
	private List<Course> courses = new LinkedList<>();

	@Override
	public void insertStudent(Student student) {
		// Aufgabe
		students.add(student);
	}

	@Override
	public void insertStudents(List<Student> students) {
		// Aufgabe
		this.students.addAll(students);
	}

	@Override
	public int countStudents() {
		// Aufgabe
		return students.size();
	}

	@Override
	public List<Student> getStudents() {
		// Aufgabe
		List<Student> kopie = new LinkedList<>();
		kopie.addAll(this.students);
		return kopie;
	}

	@Override
	public List<Student> getStudentsBornAfter(Calendar date) {
		// Aufgabe
		List<Student> newList = new LinkedList<>();
		for(Student student: students) {
			if(student.getDateOfBirth().after(date)) {
				newList.add(student);
			}
		}
		return newList;
	}

	@Override
	public List<Student> getGoodStudents(double gradeThreshold) {
		// Aufgabe
		List<Student> newList = new LinkedList<>();
		for(Student student: students) {
			if(student.getAttendedCourses() != null && 
			   student.getAverageGrade() < gradeThreshold) {
				newList.add(student);
			}
		}
		return newList;
	}

	@Override
	public List<Student> getGoodStudentsOrderedByGrade(double gradeThreshold) {
		// Aufgabe
		List<Student> newList = getGoodStudents(gradeThreshold);
		GradeComparator c = new GradeComparator();
		Collections.sort(newList, c);
		return newList;
	}

	@Override
	public List<Student> getStudentsAttendingCourse(Course course) {
		// Aufgabe
		List<Student> newList = new LinkedList<>();
		for(Student student: students) {
			if(student.getAttendedCourses().contains(course)) {
				newList.add(student);
			}
		}
		return newList;
	}

	@Override
	public void insertCourse(Course course) {
		// Aufgabe
		courses.add(course);
	}

	@Override
	public List<Course> getCourses() {
		// Aufgabe
		List<Course> newList = new LinkedList<>();
		newList.addAll(courses);
		return newList;
	}

	@Override
	public List<Course> getCoursesInTerm(Term term) {
		// Aufgabe
		List<Course> newList = new LinkedList<>();
		for(Course course: courses) {
			if(course.getTerm() == term) {
				newList.add(course);
			}
		}
		return newList;
	}

	@Override
	public int countCourses() {
		// Aufgabe
		return courses.size();
	}
}
