public class Teacher {
    String name;
    String mbno;
    String branch;

    Teacher (String name, String mbno, String branch){
        this.name = name;
        this.mbno = mbno;
        this.branch = branch;
    }


    void printTeacher(){
        System.out.println("Adı: "+ this.name +
                "\nTelefonu :" + this.mbno +
                "\nBranch :"+ this.branch);
    }

}
