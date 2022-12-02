package it.project.classes;

public class Student extends CollegePerson implements ILearningPerson{
    public int academicYear;

    public Student(String name, String surname, String Id, int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = Id;
        this.academicYear = year;
    }

    @Override
    public void goToCollege() {
        System.out.println(" -------------- ");
        System.out.println("The student name: " + this.name);
        System.out.println("The student surname: " + this.surname);
        System.out.println("The student collegeID: " + this.collegeId);
        System.out.println("The student " + this.name + " " + this.surname + " is at college by " + this.academicYear + " year/s");
        System.out.println(" -------------- ");
    }

    @Override
    public void studyAtHome(){
        System.out.println("you have to study at home!");
    }
}
