package it.project.classes;

public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson{
    public boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, String collegeId, boolean isGoingToBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void goToCollege() {
        System.out.println(" -------------- ");
        System.out.println("The assistant name: " + this.name);
        System.out.println("The assistant surname: " + this.surname);
        System.out.println("The assistant collegeID: " + this.collegeId);
        if(this.isGoingToBeAPhD == true){
            System.out.println(this.name + " " + this.surname + " is going to be a PhD");
        }else{
            System.out.println(this.name + " " + this.surname + " is not going to be a PhD");
        }
        System.out.println(" -------------- ");
    }

    @Override
    public void studyAtHome() {
        System.out.println("you have to study at home!");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("you have to teach to other people!");
    }
}
