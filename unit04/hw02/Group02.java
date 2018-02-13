package by.htp.jd01.unit04.hw02;

import by.htp.jd01.unit04.Read;


public class Group02 {

    private Read read = new Read();

    private int groupSize;
    private int abitNumber;
    private int abitCounter;
    private Abiturient02[] abit;


    public void setGroupSize() {
        groupSize = read.readSize("Enter group size: ");
    }


    public void setAbiturientNumber() {
        abitNumber = read.readSize("Enter number of abiturients: ");
        abit = new Abiturient02[abitNumber];
    }


    public void entrance(){
        if(groupSize < abitNumber){
            for(int i = 0; i < abitNumber; i++){
                addAbiturient();
            }
        } else {
            System.out.println("\nAll abiturients have been admitted!");
            System.exit(0);
        }
    }

    public void addAbiturient() {
        abit[abitCounter] = new Abiturient02();
        abitCounter++;
    }


    public void sortAbit(){
        int max = 0;
        Abiturient02 tmp;

        for (int i = 0; i < abit.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < abit.length; j++) {
                if (abit[j].getSumPoints() > abit[max].getSumPoints()) {
                    max = j;
                }
            }

            tmp = abit[max];
            abit[max] = abit[i];
            abit[i] = tmp;
        }
    }


    public void showAdmittedAbit(){
        System.out.println("\n\nAdmitted abiturients: ");
        for(int i = 0; i < groupSize; i++){
            abit[i].showAbiturient();
        }
    }


}
