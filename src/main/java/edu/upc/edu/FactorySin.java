package edu.upc.edu;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class FactorySin {

    private static FactorySin instance = null;//inicialment buit
    HashMap<String, Command> cache;
    private FactorySin(){
        cache = new HashMap<String, Command>();//crea una nova instancia
                    } // constructor

    public static FactorySin getInstance(){
         if(instance == null)
         {
             instance = new FactorySin();
         }
     return instance;}
    public Command getCommand(String pCommand){
       Command cmd = cache.get(pCommand);
       if (cmd == null) {
           cmd = loadClass(pCommand);
           cache.put(pCommand, cmd);
       }
       return cmd;}
    private Command loadClass(String pCommand){
        if ( pCommand == "C1")
        {
            return new C1();
        }
        if ( pCommand == "C2")
        {return new C2();}
        if ( pCommand == "C3")
        {return new C3();}
        return null;}}
