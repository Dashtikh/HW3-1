package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SabteAhvalExeptions {
	    NationalityExeption nat = new NationalityExeption();
        AgeExeption ag = new AgeExeption();
        TahsilatExeption tahs = new TahsilatExeption();
	    Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String Nationality;
        String Tahsilat ;

        int age;
        System.out.println("insert your Nationality !");
        Nationality= scanner.nextLine();
        nat.nationality(Nationality);
        System.out.println("insert your Age ! ");
        age=scanner.nextInt();
        ag.age(age);
        System.out.println("Tahsilat ra vared konid !");
        Tahsilat=scan.nextLine();
        tahs.tahsilat(Tahsilat);





    }
}
