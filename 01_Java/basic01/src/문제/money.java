package ����;

import java.lang.*;
import java.util.*;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oman=0,man=0,ocheon=0,cheon=0,
				obaek=0, baek=0,sip=0, o=0; 
		Scanner scan = new Scanner(System.in);
		
		
		do {
		System.out.print("�ݾ� �Է� = ");
		
		int money = scan.nextInt();
		
		
		
		
		oman = money/50000;
		money = money%50000;
		System.out.printf("50000��= %d��\n",oman);
		
		man = money/10000;
		money = money%10000;
		System.out.printf("10000��= %d��\n",man);
		
		ocheon = money/5000;
		money = money%5000;
		System.out.printf("5000��= %d��\n",ocheon);
		
		cheon = money/1000;
		money = money%1000;
		System.out.printf("1000��= %d��\n",cheon);
		
		obaek = money/500;
		money = money%500;
		System.out.printf("500��= %d��\n",obaek);
		
		baek = money/100;
		money = money%100;
		System.out.printf("100��= %d��\n",baek);
		
		sip = money/10;
		money = money%10;
		System.out.printf("10��= %d��\n",sip);
		
		o = money/5;
		money = money%5;
		System.out.printf("5��= %d��\n",o);}
		while(true);
		
		
		}

	}


