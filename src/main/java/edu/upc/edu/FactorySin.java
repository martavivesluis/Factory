package edu.upc.edu;
import org.apache.log4j.Logger;

import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class FactorySin {

    private static FactorySin instance = null;//inicialment buit
    HashMap<String, Command> cache;
    final static Logger logger = Logger.getLogger(FactorySin.class);

    private FactorySin(){
        cache = new HashMap<String, Command>();//crea una nova instancia
        cache.put("C1",new C1());
        cache.put("C2",new C2());
        cache.put("C3",new C3());
                    } // constructor

    public static FactorySin getInstance(){
         if(instance == null)
         {
             instance = new FactorySin();
         }
     return instance;}

     public Command getCommand(String pCommand){
         logger.info("getCommand rebut amb comanda:"+pCommand);
        Command cmd = cache.get(pCommand);
        if (cmd == null) {
           //log.info("carregador de classes");
           cmd = loadClass(pCommand);//aqui dins tenim un new
           cache.put(pCommand, cmd);
        }
       //else log.info("command de cache")
       return cmd;}

    private Command loadClass(String pCommand){


      /*  if ( pCommand == "C1")
        {
            return new C1();
        }
        if ( pCommand.equals("C2"))
        {return new C2();}
        if ( pCommand == "C3")
        {
            return new C3();
        }*/
        return cache.get(pCommand);
     }
}
