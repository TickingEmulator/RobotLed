package frc.robot.Commands;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Subsystems.LedSubsystem;
import frc.robot.Subsystems.LedSubsystem.LedState;

public class changeLed {
    private final LedSubsystem ledSubsystem;
    public changeLed(LedSubsystem ledSubsystem){
        this.ledSubsystem = ledSubsystem;
    }
    public Command changeTo(LedState ledState){
        return Commands.runOnce(() -> {ledSubsystem.setLedState(ledState);});
    }
}
