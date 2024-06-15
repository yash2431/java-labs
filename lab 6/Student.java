public class Student {
     int idNo;
     int noOfSubjectsRegistered;
     int[] subjectCode;
     int[] subjectCredits;
     int[] gradeObtained;
     double spi;

    public Student(int idNo, int noOfSubjectsRegistered, int[] subjectCode, int[] subjectCredits, int[] gradeObtained) {
        this.idNo = idNo;
        this.noOfSubjectsRegistered = noOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
        this.spi = 0;
    }

    public void calculateSPI() {
        int totalCredits = 0;
        int totalGradePoints = 0;
        for (int i = 0; i < noOfSubjectsRegistered; i++) {
            totalCredits += subjectCredits[i];
            totalGradePoints += gradeObtained[i] * subjectCredits[i];
        }
        this.spi = (double) totalGradePoints / totalCredits;
    }

    public double getSpi() {
        return spi;
    }

    public static void main(String[] args) {
        if (args.length < 5 || (args.length - 2) % 4 != 0) {
            System.out.println("Usage: java Student id_no no_of_subjects_registered subject_code1 subject_credits1 grade_obtained1 subject_code2 subject_credits2 grade_obtained2 ...");
            return;
        }

        int n = (args.length - 2) / 4;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int idNo = Integer.parseInt(args[0]);
            int noOfSubjectsRegistered = Integer.parseInt(args[1]);
            int[] subjectCode = new int[noOfSubjectsRegistered];
            int[] subjectCredits = new int[noOfSubjectsRegistered];
            int[] gradeObtained = new int[noOfSubjectsRegistered];

            for (int j = 0; j < noOfSubjectsRegistered; j++) {
                subjectCode[j] = Integer.parseInt(args[2 + 4 * i + j]);
                subjectCredits[j] = Integer.parseInt(args[3 + 4 * i + j]);
                gradeObtained[j] = Integer.parseInt(args[4 + 4 * i + j]);
            }

            Student student = new Student(idNo, noOfSubjectsRegistered, subjectCode, subjectCredits, gradeObtained);
            student.calculateSPI();
            students[i] = student;
        }

        for (Student student : students) {
            System.out.println("Student ID: " + student.idNo + ", SPI: " + student.spi);
        }
    }
}
