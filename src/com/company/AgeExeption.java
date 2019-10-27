package com.company;

public class AgeExeption  {
    public class age extends Throwable{

    }
    public static void age (int a) throws SabteAhvalExeptions {
        System.out.println("checking age ... ");
        if (a>=23){
            System.out.println("age accepted !");
        } else throw new SabteAhvalExeptions("Under age ! ");

    }

}
