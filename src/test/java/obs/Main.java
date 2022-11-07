package obs;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "000", "TRH");

        Teacher t2 = new Teacher("Badi Ekrem", "111", "BDN");

        Teacher t3 = new Teacher("Külyutmaz", "222", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");

        Course beden = new Course("Beden", "101","BDN" );

        Course bio = new Course("Biyoloji", "101", "BIO");

        tarih.addTeacher(t1);
        beden.addTeacher(t2);
        bio.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "5873", "4", tarih, beden, bio);
        s1.addBulkExamNote(100,90,70);
        s1.isPass();


        Student s2 = new Student("Güdük Necmi", "6483", "4", tarih, beden, bio);
        s2.addBulkExamNote(100,70,90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "7834", "4", tarih, beden, bio);
        s3.addBulkExamNote(70,90,100);
        s3.isPass();


    }
}
