



public class Essay extends GradedActivity {
	// Private variables
	private double grammar, spelling, correctLength, content;
	private double essayScore;
	// Default constructor
	public Essay(double gr, double sp, double cL, double co){
		grammar=gr;
		spelling=sp;
		correctLength=cL;
		content=co;

//	grammar=30 & spelling=20 & correctLength=20 & content=30
		essayScore = grammar + spelling + correctLength + content;
		super.setScore(essayScore);
	}
	// Need check with prof on this setScore
	//@Override
	public void setScore(double gr, double sp, double cL, double co){
	    setGrammar(gr);
	    setSpelling(sp);
	    setCorrectLength(cL);
	    setContent(co);
		essayScore = grammar + spelling + correctLength + content;
		super.setScore(essayScore);
	}
	// Setters has been updated
  private void setGrammar(double sG){
     if (sG <= 30.0)
        grammar = sG;
     else
        grammar = 0.0;
  }
  private void setSpelling(double sS){
     if (sS <= 20.0)
        spelling = sS;
     else
        spelling = 0.0;
  }
  private void setCorrectLength(double sCL)
  {
     if (sCL <= 20.0)
        correctLength = sCL;
     else
        correctLength = 0.0;
  }
  private void setContent(double sC)
  {
     if (sC <= 30)
        content = sC;
     else
        content = 0.0;
  }
  // Getters
  public double getGrammar(){
     return grammar;
  }
  public double getSpelling(){
    return spelling;
  }
  public double getCorrectLength(){
    return correctLength;
  }
  public double getContent(){
    return content;
  }
  public double getScore(){
     return grammar + spelling + correctLength + content;
  }

}
