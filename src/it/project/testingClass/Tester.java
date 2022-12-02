package it.project.testingClass;
/*import it.project.classes.ITeachingPerson;
import it.project.classes.ILearningPerson;
import it.project.classes.CollegePerson; */
import it.project.classes.Professor;
import it.project.classes.Assistant;
import it.project.classes.Student;

public class Tester {
    public static void main(String[] args){
        Student gianni = new Student("Gianni", "Mengoni", "32D54FG", 3);
        Professor gaetano = new Professor("Gaetano", "Berardini", "67DE233", "Math");
        Assistant fabio = new Assistant("Fabio", "Calenda", "32DF9OII", false);


        gianni.goToCollege();
        gaetano.goToCollege();
        fabio.goToCollege();


        gianni.studyAtHome();
        gaetano.teachToOtherPeople();
        fabio.studyAtHome();
        fabio.teachToOtherPeople();
    }
}
