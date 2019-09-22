import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float ca = sc.nextFloat();
        float pi = 3.14f;
        float caR = ca/360;
        double arcLen = 2*pi*r*caR;
        System.out.printf("%.2f",arcLen);
    }
}