package practice19;

import java.util.Scanner;
public class LabClassUI {
    private LabClass lab;

    public LabClassUI(){
        StudentInfo[] students={
                new Student("Иванов Иван Иванович",4.5),
                new Student("Петрова Анна Сергеевна",3.8),
                new Student("Сидоров Павел Олегович",4.9),
                new Student("Смирнова Ольга Андреевна",4.1)
        };

        lab=new LabClass(students);
    }

    public void run(){
        Scanner scanner=new Scanner(System.in);
        int choice;

        do{
            System.out.println("1-показать студентов");
            System.out.println("2-сортировать по среднему баллу");
            System.out.println("3-найти студента по ФИО");
            System.out.println("0-выход");

            choice=readChoice(scanner);

            switch(choice){
                case 1:
                    lab.printAll();
                    break;

                case 2:
                    lab.sortByAverageScore();
                    System.out.println("список отсортирован по убыванию среднего балла:");
                    lab.printAll();
                    break;

                case 3:
                    System.out.print("введите ФИО: ");
                    String fullName=scanner.nextLine();

                    try{
                        StudentInfo student=lab.findByFullName(fullName);
                        System.out.println("найден: "+student.getFullName()+" - "+student.getAverageScore());
                    }catch(EmptyStringException e){
                        System.out.println("ошибка: "+e.getMessage());
                    }catch(StudentNotFoundException e){
                        System.out.println("ошибка: "+e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("завершение программы");
                    break;
            }

        }while(choice!=0);

        scanner.close();
    }

    private int readChoice(Scanner scanner){
        while(true){
            System.out.print("выберите действие: ");

            if(!scanner.hasNextInt()){
                System.out.println("ошибка: введите целое число");
                scanner.nextLine();
                continue;
            }

            int value=scanner.nextInt();
            scanner.nextLine();

            if(value>=0 && value<=3){
                return value;
            }

            System.out.println("введите число от 0 до 3");
        }
    }
}
