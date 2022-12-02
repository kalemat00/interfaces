package it.project.classes;

public class Professor extends CollegePerson implements ITeachingPerson{
    public String teachingSubject;

    public Professor(String name, String surname, String collegeId, String teachingSubject) {
        this.teachingSubject = teachingSubject;
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }
    @Override
    public void goToCollege() {
        System.out.println(" -------------- ");
        System.out.println("The professor name: " + this.name);
        System.out.println("The professor surname: " + this.surname);
        System.out.println("The professor collegeID: " + this.collegeId);
        System.out.println("The professor " + this.name + " " + this.surname + " teach " + this.teachingSubject);
        System.out.println(" -------------- ");
    }
    @Override
    public void teachToOtherPeople(){
        System.out.println("you have to teach to other people!");
    }
}
