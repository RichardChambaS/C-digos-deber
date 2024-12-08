package controller.util;
import controller.util.Utilidades;

public class Utilidades {
    public static boolean validate (String num){ //El utilizado en las clases.
        boolean band = true;
        if(num.charAt(0)== '-'){
                num = num.substring(0);
                num = num. substring(1);
        }
        int cont_p= 0;
        for( int i = 0; i<num.length(); i++){
            if(!Character.isDigit(num.charAt(i)) && num.charAt(i) != '.'){
                band = false;
                break;
            }else if(num.charAt(i)== '.')
            cont_p++;
        }
        if(cont_p >=2)
        band = false;
        return band;
    }
    public static int transformStringInt(String num){   //El utilizado de las clases.
        int resp = 0;
        if (Utilidades.validate(num)){ 
            resp =Integer.parseInt(num);
        }
        return resp;
    }
    
}
