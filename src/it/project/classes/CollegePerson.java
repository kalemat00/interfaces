package it.project.classes;

public abstract class CollegePerson {   //I've defined the class CollegePerson as abstract to use goToCollege method as
                                        //abstract method to specialize each system.out.println for each specialized
                                        //class of CollegePerson
    public String name;
    public String surname;
    public String collegeId;

    public abstract void goToCollege();
}
