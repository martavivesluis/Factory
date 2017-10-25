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
        log.info(pCommand)
        Command cmd = cache.get(pCommand);
        if (cmd == null) {
           log.info("carregador de claesses");
           cmd = loadClass(pCommand);//aqui dins tenim un new
           cache.put(pCommand, cmd);
        }
       else log.info("command de cache")
       return cmd;}

    private Command loadClass(String pCommand){
        if ( pCommand == "C1")
        {
            return new C1();
        }
        if ( pCommand.equals("C2"))
        {return new C2();}
        if ( pCommand == "C3")
        {return new C3();}
        return null;}}
