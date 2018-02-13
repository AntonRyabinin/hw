package by.htp.jd01.unit04.hw01;

import by.htp.jd01.unit04.Read;

public class Group01 {

    private Read read = new Read();

    private int groupSize;
    private Student01[] student;
    private int studentCounter;


    public void setGroupSize() {

        groupSize = read.readSize("Enter group size: ");
        student = new Student01[groupSize];

        for(int i = 0; i < groupSize; i++){
            addStudent();
        }
    }


    public void addStudent() {
        student[studentCounter] = new Student01();
        studentCounter++;
    }


    public void showStudentsInfo() {
        System.out.println("\nSTUDENTS EXAM MARKS");
        for (int i = 0; i < studentCounter; i++) {
            student[i].showStudentInfo();
        }
    }


    public void averageMarkEachStudent() {
        System.out.println("Average mark of each student:");
        for (int i = 0; i < studentCounter; i++) {
            System.out.printf("%s %s: %.2f\n", student[i].getFirstName(),
                    student[i].getLastName(), student[i].averageMarkStudent());
        }
    }


    public void averageMarkAllGroup() {

        double sum = 0;

        for (int i = 0; i < studentCounter; i++) {
            sum += student[i].averageMarkStudent();
        }

        System.out.printf("\nAverage mark of all group : %.2f\n", sum / studentCounter);
    }


    public void countGoodStudents(){
        int counter = 0;
        for (int i = 0; i < studentCounter; i++) {
            if (student[i].ifGoodStudent()) {
                counter++;
            }
        }
        System.out.println("\nNumber of good students: " + counter);
    }


    public void countBadStudents(){
        int counter = 0;
        for (int i = 0; i < studentCounter; i++) {
            if (student[i].ifBadStudent()) {
                counter++;
            }
        }
        System.out.println("Number of bad students: " + counter);
    }


    public int getGroupSize() {
        return groupSize;
    }
}
