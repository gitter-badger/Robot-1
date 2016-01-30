package robot;

import net.java.games.input.Component;
import net.java.games.input.Component.Identifier;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

public class Joystick {
    private String name;
    private boolean connected = false;
    
    private Controller[] device;
    private Controller controller;
    private Component[] components;
    private Component joystick;
    private Identifier ident;
    
    private boolean[] button = new boolean[32];
    
    /**
     * Connect to the joystick with name n.
     * @param n 
     */
    public Joystick(String n){
        name = n;
        device  = ControllerEnvironment.getDefaultEnvironment().getControllers();
        
        for(int i = 0; i < device.length; i++){
            if(device[i].getName().equals(name)){
                controller = device[i];
                components = controller.getComponents();
                connected = true;
                break;
            }
        }
        
    }
    
    private void bind(){
        for(int i = 0; i < components.length; i++){
            joystick = components[i];
            ident = joystick.getIdentifier();
            
            //buttons
            if(joystick.getName().contains("Button")){
                boolean pressed;
                
                if(joystick.getPollData() == 0.0f){
                    pressed = false;
                    fetchButtons(pressed);
                } else {
                    pressed = true;
                    fetchButtons(pressed);
                }
                
                
                
            }
        }
    }
    
    private void fetchButtons(boolean pressed){
        if(ident == Component.Identifier.Button._0){
            button[0] = pressed;
        } else {
            button[0] = false;
        }

        if(ident == Component.Identifier.Button._1){
            button[1] = pressed;
        } else {
            button[1] = false;
        }

        if(ident == Component.Identifier.Button._2){
            button[2] = pressed;
        } else {
            button[2] = false;
        }

        if(ident == Component.Identifier.Button._3){
            button[3] = pressed;
        } else {
            button[3] = false;
        }

        if(ident == Component.Identifier.Button._4){
            button[4] = pressed;
        } else {
            button[4] = false;
        }

        if(ident == Component.Identifier.Button._5){
            button[5] = pressed;
        } else {
            button[5] = false;
        }

        if(ident == Component.Identifier.Button._6){
            button[6] = pressed;
        } else {
            button[6] = false;
        }

        if(ident == Component.Identifier.Button._7){
            button[7] = pressed;
        } else {
            button[7] = false;
        }

        if(ident == Component.Identifier.Button._8){
            button[8] = pressed;
        } else {
            button[8] = false;
        }

        if(ident == Component.Identifier.Button._9){
            button[9] = pressed;
        } else {
            button[9] = false;
        }

        if(ident == Component.Identifier.Button._10){
            button[10] = pressed;
        } else {
            button[10] = false;
        }

        if(ident == Component.Identifier.Button._11){
            button[11] = pressed;
        } else {
            button[11] = false;
        }

        if(ident == Component.Identifier.Button._12){
            button[12] = pressed;
        } else {
            button[12] = false;
        }

        if(ident == Component.Identifier.Button._13){
            button[13] = pressed;
        } else {
            button[13] = false;
        }

        if(ident == Component.Identifier.Button._14){
            button[14] = pressed;
        } else {
            button[14] = false;
        }

        if(ident == Component.Identifier.Button._15){
            button[15] = pressed;
        } else {
            button[15] = false;
        }

        if(ident == Component.Identifier.Button._16){
            button[16] = pressed;
        } else {
            button[16] = false;
        }

        if(ident == Component.Identifier.Button._17){
            button[17] = pressed;
        } else {
            button[17] = false;
        }

        if(ident == Component.Identifier.Button._18){
            button[18] = pressed;
        } else {
            button[18] = false;
        }

        if(ident == Component.Identifier.Button._19){
            button[19] = pressed;
        } else {
            button[19] = false;
        }

        if(ident == Component.Identifier.Button._20){
            button[20] = pressed;
        } else {
            button[20] = false;
        }

        if(ident == Component.Identifier.Button._21){
            button[21] = pressed;
        } else {
            button[21] = false;
        }

        if(ident == Component.Identifier.Button._22){
            button[22] = pressed;
        } else {
            button[22] = false;
        }

        if(ident == Component.Identifier.Button._23){
            button[23] = pressed;
        } else {
            button[23] = false;
        }

        if(ident == Component.Identifier.Button._24){
            button[24] = pressed;
        } else {
            button[24] = false;
        }

        if(ident == Component.Identifier.Button._25){
            button[25] = pressed;
        } else {
            button[25] = false;
        }

        if(ident == Component.Identifier.Button._26){
            button[26] = pressed;
        } else {
            button[26] = false;
        }

        if(ident == Component.Identifier.Button._27){
            button[27] = pressed;
        } else {
            button[27] = false;
        }

        if(ident == Component.Identifier.Button._28){
            button[28] = pressed;
        } else {
            button[28] = false;
        }

        if(ident == Component.Identifier.Button._29){
            button[29] = pressed;
        } else {
            button[29] = false;
        }

        if(ident == Component.Identifier.Button._30){
            button[30] = pressed;
        } else {
            button[30] = false;
        }

        if(ident == Component.Identifier.Button._31){
            button[31] = pressed;
        } else {
            button[31] = false;
        }
    }
    
    private void fetchHatSwitch(){
        
    }
}
