package Preparation.obs;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }


    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(prefix)){
            this.teacher = teacher;
        } else{
            System.out.println("Ders ve branç uyuşmuyor.");
        }
    }

    void printTeacherInfo(){
        this.teacher.printTeacher();
    }



}
