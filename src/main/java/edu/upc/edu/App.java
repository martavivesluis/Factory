package edu.upc.edu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


public class App {
    public static void main(String[] args) {


        System.out.println("-----Metodes:");
        Class info = FactorySin.class;
        for (Method method : info.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        System.out.println("------ Atributs:");

        for (Field method : info.getDeclaredFields()) {
            System.out.println(method.getName());
        }


        System.out.println("------ Constructors:");
        for (Constructor method : info.getConstructors())
        {
            System.out.println(method.getClass());
        }

        try {

            Method m = info.getDeclaredMethod("getCommand",String.class);

            System.out.println("---Parametres:"+ m.getParameterTypes());

        }catch(Exception e){
            System.out.println("------ Error:");

        }




    }
}
