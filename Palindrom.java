public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp=number, reversenumber = 0, lastdigit;
        while (temp!=0){
            lastdigit = temp % 10;
            reversenumber = (reversenumber * 10) + lastdigit;
            temp/=10;
    }

    if (number == reversenumber)
            return true;
    else
            return false;
}
public static void main (String[] args){
    System.out.println(isPalindrom(993399));

}
}
