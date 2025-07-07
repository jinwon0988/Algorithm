import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        for(int i=0; i<a.length; i++) {
            if(Character.isUpperCase(a[i])) {
                a[i] = Character.toLowerCase(a[i]);
            }else{
                a[i] = Character.toUpperCase(a[i]);
            }
        }
        System.out.println(String.valueOf(a));
    }
}