

class Subject{

    //Properties
    private int subjectID;
    private String designation;
    private int maxMark;
    private int minMark;

    //Constructor
    public Subject(int subID, String designation, int maxMark, int minMark){

        this.subjectID = subID;
        this.designation = designation;
        this.maxMark = maxMark;
        this.minMark = minMark;
    }

    //Setters
    public void setSubID(int ID){this.subjectID = ID;}
    public void setDesignation(String d){this.designation = d;}
    public void setMaxMark(int max){this.maxMark = max;}
    public void setMinMark(int min){minMark = min;}

    //Getters
    public int getSubID(){return this.subjectID;}
    public String getDesignation(){return this.designation;}
    public int getMaxMark(){return this.maxMark;}
    public int getMinMark(){return this.minMark;}

    //Methods
    public String toString(){
        return "Class ID: " + subjectID + " / " + designation;
    }
}

class Student{

    //Properties
    private int studentID;
    private String name;


    //Constructor
    public Student(int subID, String designation){
        this.studentID = subID;
        this.name = designation;
    }

    //Getters & Setters
    public int getStudentID() {return this.studentID;}
    public void setStudentID(int studentID) {this.studentID = studentID;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    //Methods
    public String toString(){
        return "Student ID: " + studentID + " / Name: " + name;
    }
}


class Grade{

    //Properties
    private double gradeID;
    private int studentID;
    private int subjectID;
    private double grade;


    //Constructor
    public Grade(double gID, int stuID, int subID, int g){
        this.gradeID = gID;
        this.studentID = stuID;
        this.subjectID = subID;
        this.grade = g;
    }


}

public class StudentGrades{
    public static void main(String[] args) {

        //Classes 
        Subject year12[] = new Subject[5];

        year12[0] = new Subject(1200, "History", 20, 0);
        year12[1] = new Subject(1201, "Math", 20, 0);
        year12[2] = new Subject(1202, "Biology", 20, 0);
        year12[3] = new Subject(1203, "Geography", 20, 0);
        year12[4] = new Subject(1204, "Fisics", 20, 0);
        
        for(Subject s:year12){System.out.println("Year 12 - " + s);}

        System.out.println("");

        Subject year11[] = new Subject[5];

        year11[0] = new Subject(1100, "History", 20, 0);
        year11[1] = new Subject(1101, "Math", 20, 0);
        year11[2] = new Subject(1102, "Biology", 20, 0);
        year11[3] = new Subject(1103, "Geography", 20, 0);
        year11[4] = new Subject(1104, "Fisics", 20, 0);
        
        for(Subject s:year11){System.out.println("Year 11 - " + s);}
        
        System.out.println("");

        Student students2024[] = new Student[6];

        students2024[0] = new Student(2400, "João");
        students2024[1] = new Student(2401, "Mike");
        students2024[2] = new Student(2402, "Marko");
        students2024[3] = new Student(2403, "Alfonse");
        students2024[4] = new Student(2404, "Dina");

        for(Student r:students2024){System.out.println("2024 - " + r);}
    }
}

//Sugestão do ChatGPT
/*
import java.util.HashMap;
import java.util.Map;

class Grade {
    // Properties
    private double gradeID;
    private int studentID;
    private int subjectID;
    private double grade;

    // Constructor
    public Grade(double gID, int stuID, int subID, double g) {
        this.gradeID = gID;
        this.studentID = stuID;
        this.subjectID = subID;
        this.grade = g;
    }

    // Getters and Setters
    public double getGradeID() {
        return gradeID;
    }

    public void setGradeID(double gradeID) {
        this.gradeID = gradeID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // toString method
    @Override
    public String toString() {
        return "Grade ID: " + gradeID + ", Student ID: " + studentID + ", Subject ID: " + subjectID + ", Grade: " + grade;
    }
}

class Grades {
    // A map to store grades, where the key is a combination of studentID and subjectID
    private Map<String, Grade> gradeMap = new HashMap<>();

    // Method to add a grade
    public void addGrade(Grade grade) {
        String key = generateKey(grade.getStudentID(), grade.getSubjectID());
        gradeMap.put(key, grade);
    }

    // Method to retrieve a grade
    public Grade getGrade(int studentID, int subjectID) {
        String key = generateKey(studentID, subjectID);
        return gradeMap.get(key);
    }

    // Method to generate a unique key for each (studentID, subjectID) pair
    private String generateKey(int studentID, int subjectID) {
        return studentID + "-" + subjectID;
    }

    // Method to print all grades
    public void printAllGrades() {
        for (Grade grade : gradeMap.values()) {
            System.out.println(grade);
        }
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        // Create some subjects
        Subject year12[] = new Subject[5];
        year12[0] = new Subject(1200, "History", 20, 0);
        year12[1] = new Subject(1201, "Math", 20, 0);
        year12[2] = new Subject(1202, "Biology", 20, 0);
        year12[3] = new Subject(1203, "Geography", 20, 0);
        year12[4] = new Subject(1204, "Fisics", 20, 0);

        // Create some students
        Student students2024[] = new Student[5];
        students2024[0] = new Student(2400, "João");
        students2024[1] = new Student(2401, "Mike");
        students2024[2] = new Student(2402, "Marko");
        students2024[3] = new Student(2403, "Alfonse");
        students2024[4] = new Student(2404, "Dina");

        // Create a Grades instance
        Grades grades = new Grades();

        // Add some grades
        grades.addGrade(new Grade(1, 2400, 1200, 18.5)); // João, History
        grades.addGrade(new Grade(2, 2401, 1201, 15.0)); // Mike, Math
        grades.addGrade(new Grade(3, 2402, 1202, 17.5)); // Marko, Biology

        // Print all grades
        grades.printAllGrades();

        // Retrieve and print a specific grade
        Grade grade = grades.getGrade(2400, 1200);
        if (grade != null) {
            System.out.println("\nSpecific Grade: " + grade);
        } else {
            System.out.println("\nGrade not found.");
        }
    }
}*/