public class Student{
//attributes AKA variables
private String name;
private String hairColor;
private double grade;
private double height;
private int age;
private boolean homecoming;


//constructor
//constructor are always named after the class the only thing that defreindsheates constructors from one another its thier paramete.

// this constructor sets default values to variables  
public Student(){
name = "";
hairColor = "";
grade = 0.0;
height = 0.0;
age = 0;
homecoming = false;

}

public Student(String studentName, String studentHair,double studentGrade,double studentHeight,int studentAge, boolean attending){
name = studentName;
hairColor = studentHair;
grade = studentGrade;
height = studentHeight;
age = studentAge;
homecoming = attending;

}

//method
public void attendingHomecoming(){
  //if homecoming is true then do this 
  if(homecoming && age > 15){
  System.out.println("Welcome to homecoming " + name + "!!");
  }else{
    System.out.println("Maybe next year " + name);
  
  }
 }
}