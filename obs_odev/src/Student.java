public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkSozluNotu(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }


    public void calcAvarage() {
        double matNot = (this.mat.note * 0.80) + (this.mat.sozluNotu *0.20);
        double fizikNot = (this.fizik.note * 0.80) + (this.fizik.sozluNotu * 0.20);
        double kimyaNot = (this.kimya.note*0.80)+ (this.kimya.sozluNotu * 0.20);

        this.avarage = (matNot + fizikNot + kimyaNot) / 3;
    }


    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name + "\n");


        System.out.println("Matematik Sinav Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu Notu : " + this.mat.sozluNotu + "\n");


        System.out.println("Fizik Sinav Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu Notu : " + this.fizik.sozluNotu + "\n");


        System.out.println("Kimya Sinav Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimya.sozluNotu + "\n");
    }
}