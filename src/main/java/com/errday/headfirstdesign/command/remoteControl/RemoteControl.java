package com.errday.headfirstdesign.command.remoteControl;

public class RemoteControl {

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
        onCommands[slotNumber] = onCommand;
        offCommands[slotNumber] = offCommand;
    }

    public void onButtonPressed(int slotNumber) {
        onCommands[slotNumber].execute();
        undoCommand = onCommands[slotNumber];
    }

    public void offButtonPressed(int slotNumber) {
        offCommands[slotNumber].execute();
        undoCommand = offCommands[slotNumber];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- 리모컨 -----\n");

        for (int i = 0; i < 7; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + " / " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuilder.append("[undo] ")
                .append(undoCommand.getClass().getSimpleName());

        return stringBuilder.toString();
    }
}
