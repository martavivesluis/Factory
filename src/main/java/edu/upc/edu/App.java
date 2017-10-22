package edu.upc.edu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

/**
 * Hello world!
 *
 */
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

        try {

            Method m = info.getDeclaredMethod("getCommand",String.class);

            System.out.println("---Parametres:"+ m.getParameterTypes());

        }catch(Exception e){
            System.out.println("------ Error:");

        }

        System.out.println("------ Constructors:");
        Class constructors = FactorySin.class;
        Constructor[] constructors1 = constructors.getConstructors();






            /*Class aClass = ...//obtain class object
Constructor[] constructors = aClass.getConstructors();*/

    }
}
