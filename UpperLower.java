import java.util.Scanner;
class UpperLower {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=scan.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println(ch+=32);
        }
        else if(ch>=97 && ch<=122){
            System.out.println(ch-=32);
        }
        else{
            System.out.println("Invalid character");
        }
    }
}
