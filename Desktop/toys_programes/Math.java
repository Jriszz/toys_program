import static java.lang.Math.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;

public class Math {
	public static void main(String[] args) throws IOException {
		int [] anonymous = {1,2,3,4,5,6,8};
		int [] a;
		a = Arrays.copyOf(anonymous, anonymous.length);
		String str1 = "123";
		String str2;
		str2 = str1.toString();
		System.out.println("a:" + a + "str1:" + str2);
		//int [] smallPrimes = {34,56,634,23};
		//int [] smallPrimes = anonymous;
		int[] smallPrimes = anonymous;
		for(int i:smallPrimes) {
		System.out.println(i);
		}
		/*
		int [] a = new int[100];
		for (int i = 0;i<100;i++) {
			
			a[i] = i;
		} 
		for(int elements:a) {

			System.out.println(element);
			
		}

		  BigInteger a = BigInteger.valueOf(100);
	      BigInteger b = BigInteger.valueOf(200);
	      BigInteger d = a.add(b);
	      System.out.println(d);
	
		Scanner s = new Scanner(Paths.get("D:\\2.txt"),"utf-8");
		PrintWriter p = new PrintWriter(new FileWriter("D:\\3.txt"));
        while(s.hasNext())  
        { 	
            System.out.println(s.next());
            p.flush();
         	p.println("�缱���ԳХ��");
         	p.println("���ɳ����ɻ�");
         	p.println("�ޱ���ľ������");
         	p.print("��������������");
         	p.println("���ﱯ�ﳣ����");
         	p.println("����ಡ����̨");
         	p.println("���ѿ�޷�˪��");
         	p.println("�ʵ���ͣ�ǾƱ�");
            //System.out.println(s.nextLine());
            
            //s.next();
            //System.out.println(s.hasNextLine()); 
           
        }  
        p.close();
        System.out.println("out finally!");
		
		String res;
		Scanner in = new Scanner(System.in);
		System.out.println("�����룺");
		res = in.nextLine();
		boolean d = res.hasNext();
		System.out.println(d);
		
		String greeting = "Hello";
		int cpCount;
		cpCount = greeting.codePointCount(0, greeting.length());
		System.out.println("cpCount is " + cpCount);
		System.out.println("The square root of \u03c0 is " + sqrt(PI));
		
		int index;
		int cp;
		char cha;
		index = greeting.offsetByCodePoints(0, 1);
		cha = greeting.charAt(index);
		cp = greeting.codePointAt(index);
		System.out.println(cha +":"+ cp);
		
		int [] codePoints;
		int items;
		codePoints = greeting.codePoints().toArray();
		for (items= 0; items <codePoints.length;items++) {
			System.out.println( "of codepoints"+ greeting.substring(items, items + 1) + " is " + codePoints[items]);
		*/
	
		}
	}
