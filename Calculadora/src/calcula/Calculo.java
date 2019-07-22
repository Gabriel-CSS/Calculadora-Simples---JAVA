package calcula;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculo {
    
    public double calculaPraMim(String result) throws ScriptException{
        double resultado;
        
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        if(result == "0" || result == ""){
            resultado = 0;
        }else{
            resultado = Double.parseDouble(engine.eval(result)+"");
        }
        return resultado;
    }
}