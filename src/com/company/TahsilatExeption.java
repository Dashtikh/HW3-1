package com.company;

public class TahsilatExeption {
    public class tahsilat extends Throwable {

    }
    public static void tahsilat(String tah) throws SabteAhvalExeptions {
        System.out.println("tahsilate khod ra vared konid ! ");
        if (tah!= null && tah.equals("foqe diplom")){
            System.out.println("Tahsilat ok ast");
        }else throw new SabteAhvalExeptions("Tahsilat motabeqat nadare ! ");
    }
}
