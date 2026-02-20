/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remotecontrol;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnLight(light);
        Command turnOff = new TurnOffLight(light);

        RemoteControl control = new RemoteControl();

        control.setCommand(turnOn);
        control.pressButton();

        control.setCommand(turnOff);
        control.pressButton();
    }
    
}
