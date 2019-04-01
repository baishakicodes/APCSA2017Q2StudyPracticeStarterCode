/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice{
    private int firstInt;
    private int initialSecondInt;
    public MultPractice(int firstInteger, int initialSecondInteger){
        firstInt=firstInteger;
        initialSecondInt= initialSecondInteger;
    }
    public String getProblem(){
        return firstInt + " TIMES "+ initialSecondInt;
    }
    public void nextProblem(){
        initialSecondInt++;
    }
}
