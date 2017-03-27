public class GradesDriver {

	public static void main(String[] args) {
		GradedActivity[] grades = new GradedActivity[4];
		
		//setLab/setPassFailExam/setEssay/setFinalExam
		grades[0] = new GradedActivity();
		grades[0].setScore(95);
		grades[1] = new PassFailExam(10, 1, 70);
		grades[2] = new Essay(28,19,18,27);
		grades[3] = new FinalExam(50, 7);

	  // Display the grades.
	  for (int i = 0; i < grades.length; i++){
	     System.out.println("Grades " + (i + 1) + ": " +
	                "score " + grades[i].getScore() +
	                ", grade " + grades[i].getGrade());
	  }
	}
}
