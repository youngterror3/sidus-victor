package sidus-victor.annotations.util;

import com.sun.source.tree.*;
import sidus-victor.annotations.*;

import javax.lang.model.element.*;

public class Svar extends Selement<VariableElement>{

    public Svar(VariableElement e){
        super(e);
    }

    public String descString(){
        return up().asType().toString() + "#" + super.toString().replace("sidus-victor.gen.", "");
    }

    public Stype enclosingType(){
        return new Stype((TypeElement)up());
    }

    public boolean isAny(Modifier... mods){
        for(Modifier m : mods){
            if(is(m)) return true;
        }
        return false;
    }

    public boolean is(Modifier mod){
        return e.getModifiers().contains(mod);
    }

    public VariableTree tree(){
        return (VariableTree)BaseProcessor.trees.getTree(e);
    }
}
