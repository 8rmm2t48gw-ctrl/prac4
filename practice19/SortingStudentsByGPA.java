package practice19;

import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo first,StudentInfo second){
        return Double.compare(second.getAverageScore(),first.getAverageScore());
    }

    public void quickSort(StudentInfo[] students,int left,int right){
        if(left>=right){
            return;
        }

        int pivotIndex=partition(students,left,right);

        quickSort(students,left,pivotIndex-1);
        quickSort(students,pivotIndex+1,right);
    }

    private int partition(StudentInfo[] students,int left,int right){
        StudentInfo pivot=students[right];
        int position=left;

        for(int j=left;j<right;j++){
            if(compare(students[j],pivot)<0){
                StudentInfo temp=students[position];
                students[position]=students[j];
                students[j]=temp;
                position++;
            }
        }

        StudentInfo temp=students[position];
        students[position]=students[right];
        students[right]=temp;

        return position;
    }
}
