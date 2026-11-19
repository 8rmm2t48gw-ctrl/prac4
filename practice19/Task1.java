package practice19;

import java.util.Scanner;
public class Task1 {
    public static void checkInn(String inn) throws InvalidInnException {
        if(inn==null || !inn.matches("\\d{12}")){
            throw new InvalidInnException("ИНН должен содержать 12 цифр");
        }

        int[] digits=new int[12];
        for(int i=0;i<12;i++){
            digits[i]=inn.charAt(i)-'0';
        }

        int[] coefficients11={7,2,4,10,3,5,9,4,6,8};
        int[] coefficients12={3,7,2,4,10,3,5,9,4,6,8};

        int sum11=0;
        int sum12=0;

        for(int i=0;i<10;i++){
            sum11+=digits[i]*coefficients11[i];
        }

        for(int i=0;i<11;i++){
            sum12+=digits[i]*coefficients12[i];
        }

        if(digits[10]!=(sum11%11)%10 || digits[11]!=(sum12%11)%10){
            throw new InvalidInnException("неверные контрольные цифры ИНН");
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("введите ФИО: ");
        String fullName=scanner.nextLine().trim();

        System.out.print("введите ИНН: ");
        String inn=scanner.nextLine().trim();

        if(fullName.isEmpty()){
            System.out.println("ошибка: ФИО не должно быть пустым");
        }else{
            try{
                checkInn(inn);
                System.out.println("заказ оформлен на: "+fullName);
                System.out.println("ИНН прошёл проверку формата и контрольных цифр");
            }catch(InvalidInnException e){
                System.out.println("ошибка: "+e.getMessage());
            }
        }

        scanner.close();
    }
}

