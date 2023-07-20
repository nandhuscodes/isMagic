import java.util.Scanner;

public class MagicNum {
    static int isMagicNumber(int number){
        int sum = 0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        if((int)(Math.log10(sum)+1)>1){
            sum = isMagicNumber(sum);
        }
        if(sum == 1){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isMagicNumber(number));
    }
}
