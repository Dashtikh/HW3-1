package com.company;

public class NationalityExeption {
    public static void nationality(String n) throws SabteAhvalExeptions{
        System.out.println("checking Nationality ...");
        if (n!=null && n.equals("Iranian"))
            System.out.println("Nationality accepted !");
        else throw new SabteAhvalExeptions("Irani Nistid!");

    }

    public class nationality extends Throwable {

    }
}
