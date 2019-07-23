package calcula;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculo {
    
    public String calculaPraMim(String result) throws ScriptException{
        String resultado;
        
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        if(result == "0" || result == ""){
            resultado = "0";
        }else{
            resultado = engine.eval(result)+"";
        }
        if(resultado == "0.0"){
            resultado = "0";
        }
        return resultado;
    }
}