class Student {

    // Propriedade estática para manter o último ID atribuído
    private static int lastStudentID = 1000;

    // Propriedades do objeto
    private int studentID;
    private String name;

    // Construtor
    public Student(String name) {
        this.studentID = ++lastStudentID; // Incrementa o último ID e o atribui ao novo aluno
        this.name = name;
    }

    // Getters
    public int getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    // toString para exibir informações do aluno
    public String toString() {
        return "Student ID: " + studentID + " / Name: " + name;
    }
}

public class AutomaticIncrement {
    public static void main(String[] args) {
        // Criando novos alunos
        Student s1 = new Student("João");
        Student s2 = new Student("Mike");
        Student s3 = new Student("Dina");

        // Exibindo informações dos alunos
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}