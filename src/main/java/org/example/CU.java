package org.example;

import java.util.ArrayList;

public class CU {
    String nameCU;
    ArrayList<Mark>marks;
    int totalStudents;

    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>();
    }

    public void insertMarkCU(int numStudent, double mark){
        Mark mark1 = new Mark(numStudent, mark);
        marks.add(mark1);
    }

    public double searchStudent(int num_Student){
        for (int i = 0; i< marks.size(); i++){
            if (marks.get(i).getNumStudent() == num_Student){
                return marks.get(i).getMark();
            }
        }
        return -1.0;
    }

    public double averageCU(){
        double sum = 0;
        for (int i = 0; i< marks.size(); i++){
            sum += marks.get(i).getMark();
        }
        return sum / totalStudents;
    }

    public boolean isApproved(int numStudent){
        for (int i = 0; i< marks.size(); i++){
            if (marks.get(i).getNumStudent() == numStudent){
                return marks.get(i).getMark() >= 9.5;
            }
        }
        return false;
    }

    public int getArraySize(){
        return marks.size();
    }

}
