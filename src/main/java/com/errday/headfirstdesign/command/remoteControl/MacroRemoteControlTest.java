package com.errday.headfirstdesign.command.remoteControl;


import com.errday.headfirstdesign.command.remoteControl.hottub.Hottub;
import com.errday.headfirstdesign.command.remoteControl.hottub.HottubOffCommand;
import com.errday.headfirstdesign.command.remoteControl.hottub.HottubOnCommand;
import com.errday.headfirstdesign.command.remoteControl.light.Light;
import com.errday.headfirstdesign.command.remoteControl.light.LightOffCommand;
import com.errday.headfirstdesign.command.remoteControl.light.LightOnCommand;
import com.errday.headfirstdesign.command.remoteControl.macro.MacroCommand;
import com.errday.headfirstdesign.command.remoteControl.stereo.Stereo;
import com.errday.headfirstdesign.command.remoteControl.stereo.StereoOffWithCdCommand;
import com.errday.headfirstdesign.command.remoteControl.stereo.StereoOnWithCdCommand;
import com.errday.headfirstdesign.command.remoteControl.tv.Tv;
import com.errday.headfirstdesign.command.remoteControl.tv.TvOffCommand;
import com.errday.headfirstdesign.command.remoteControl.tv.TvOnCommand;

public class MacroRemoteControlTest {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("living room");
        Tv livingRoomTv = new Tv("living room");
        Stereo stereo = new Stereo();
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffWithCdCommand stereoOffWithCdCommand = new StereoOffWithCdCommand(stereo);

        TvOnCommand tvOnCommand = new TvOnCommand(livingRoomTv);
        TvOffCommand tvOffCommand = new TvOffCommand(livingRoomTv);

        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOnCommand, stereoOnWithCdCommand, tvOnCommand, hottubOnCommand};
        Command[] partyOff = {lightOffCommand, stereoOffWithCdCommand, tvOffCommand, hottubOffCommand};

        MacroCommand partyOnMacroCommand = new MacroCommand(partyOn);
        MacroCommand partyOffMacroCommand = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacroCommand, partyOffMacroCommand);
        System.out.println("--- Macro on ---");
        remoteControl.onButtonPressed(0);
        System.out.println("--- Macro off ---");
        remoteControl.offButtonPressed(0);

    }
}
