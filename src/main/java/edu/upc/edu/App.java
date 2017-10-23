package edu.upc.edu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


public class App {
    public static void main(String[] args) {




        try {

            Method m = info.getDeclaredMethod("getCommand",String.class);

            System.out.println("---Parametres:"+ m.getParameterTypes());

        }catch(Exception e){
            System.out.println("------ Error:");

        }




    }
}
