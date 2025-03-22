package com.errday.headfirstdesign.command.remoteControl;

import com.errday.headfirstdesign.command.remoteControl.seilingfan.*;

public class CeilingFanRemoteControlTest {

    public static void main(String[] args) {
        RemoteControl ceilingFanRemoteControl = new RemoteControl();

        CeilingFan livingRoomCeilingFan = new CeilingFan("living room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(livingRoomCeilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        ceilingFanRemoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        ceilingFanRemoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
        ceilingFanRemoteControl.setCommand(2, ceilingFanLowCommand, ceilingFanOffCommand);

        ceilingFanRemoteControl.onButtonPressed(0);
        ceilingFanRemoteControl.undoButtonPressed();
        ceilingFanRemoteControl.onButtonPressed(1);
        ceilingFanRemoteControl.undoButtonPressed();
        ceilingFanRemoteControl.onButtonPressed(2);
        ceilingFanRemoteControl.undoButtonPressed();

    }
}
