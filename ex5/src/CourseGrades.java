public class CourseGrades {
	// Private grades object
	private GradedActivity[] grades;
	// Default constructor
	public CourseGrades() {
		grades = new GradedActivity[4];
	}
	// Methods
	// Need check with prof for class file for this method
	public void setLab(GradedActivity sL){
		grades[0] = sL;
	}
	public void setPassFailExam(PassFailExam sPFE){
		grades[1] = sPFE;
	}
	public void setEssay(Essay sE){
		grades[2] = sE;
	}
	public void setFinalExam(FinalExam sFE){
		grades[3] = sFE;
	}
 	// Method toString()
	public String toString(){
		return grades[0].getScore() + grades[0].getGrade() +"\n"+
	         grades[1].getScore() + grades[1].getGrade() +"\n"+
	         grades[2].getScore() + grades[2].getGrade() +"\n"+
	         grades[3].getScore() + grades[3].getGrade() +"\n";
	}
}
