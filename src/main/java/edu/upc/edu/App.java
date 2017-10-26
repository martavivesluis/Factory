package edu.upc.edu;

import org.apache.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


public class App {

    final static Logger logger = Logger.getLogger(App.class);
    public void main(String[] args) {

        logger.info("-----Metodes:");
        Class info = FactorySin.class;
        for (Method method : info.getDeclaredMethods()) {
            logger.info(method.getName());
        }

        logger.info("------ Atributs:");

        for (Field method : info.getDeclaredFields()) {
            logger.info(method.getName());
        }


        logger.info("------ Constructors:");
        for (Constructor method : info.getConstructors())
        {
            logger.info(method.getClass());
        }

        try {

            Method m = info.getDeclaredMethod("getCommand",String.class);

            logger.info("---Parametres:"+ m.getParameterTypes());

        }catch(Exception e){
            logger.info("------ Error:");

        }




    }
}
