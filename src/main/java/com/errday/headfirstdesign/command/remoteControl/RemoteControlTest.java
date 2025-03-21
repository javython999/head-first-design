package com.errday.headfirstdesign.command.remoteControl;

import com.errday.headfirstdesign.command.remoteControl.garage.GarageDoor;
import com.errday.headfirstdesign.command.remoteControl.garage.GarageDooDownCommand;
import com.errday.headfirstdesign.command.remoteControl.garage.GarageDoorUpCommand;
import com.errday.headfirstdesign.command.remoteControl.light.Light;
import com.errday.headfirstdesign.command.remoteControl.light.LightOffCommand;
import com.errday.headfirstdesign.command.remoteControl.light.LightOnCommand;
import com.errday.headfirstdesign.command.remoteControl.seilingfan.CeilingFan;
import com.errday.headfirstdesign.command.remoteControl.seilingfan.CeilingFanHighCommand;
import com.errday.headfirstdesign.command.remoteControl.seilingfan.CeilingFanOffCommand;
import com.errday.headfirstdesign.command.remoteControl.stereo.Stereo;
import com.errday.headfirstdesign.command.remoteControl.stereo.StereoOffWithCdCommand;
import com.errday.headfirstdesign.command.remoteControl.stereo.StereoOnWithCdCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Light garageLight = new Light("Garage");
        GarageDoor garageDoor = new GarageDoor(garageLight);
        CeilingFan livingRooomCeilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo();


        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(livingRooomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRooomCeilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDooDownCommand garageDooDownCommand = new GarageDooDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnCommand = new StereoOnWithCdCommand(stereo);
        StereoOffWithCdCommand stereoOffCommand = new StereoOffWithCdCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(4, garageDoorUpCommand, garageDooDownCommand);

        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.undoButtonPressed();
        remoteControl.onButtonPressed(2);
        remoteControl.onButtonPressed(3);
        remoteControl.onButtonPressed(4);

        remoteControl.offButtonPressed(0);
        remoteControl.offButtonPressed(1);
        remoteControl.offButtonPressed(2);
        remoteControl.offButtonPressed(3);
        remoteControl.offButtonPressed(4);


        System.out.println(remoteControl);


    }
}
