package practice19;

public class LabClass {
    private StudentInfo[] students;

    public LabClass(StudentInfo[] students){
        this.students=students;
    }

    public void sortByAverageScore(){
        SortingStudentsByGPA sorter=new SortingStudentsByGPA();
        sorter.quickSort(students,0,students.length-1);
    }

    public StudentInfo findByFullName(String fullName) throws EmptyStringException,StudentNotFoundException {

        if(fullName==null || fullName.trim().isEmpty()){
            throw new EmptyStringException("ФИО не должно быть пустым");
        }

        String name=fullName.trim();

        for(StudentInfo student:students){
            if(student.getFullName().equalsIgnoreCase(name)){
                return student;
            }
        }

        throw new StudentNotFoundException("студент с таким ФИО не найден");
    }

    public void printAll(){
        for(StudentInfo student:students){
            System.out.println(student.getFullName()+" - "+student.getAverageScore());
        }
    }
}
