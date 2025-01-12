// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.changeLed;
import frc.robot.Subsystems.LedSubsystem;
import frc.robot.Subsystems.LedSubsystem.LedState;

public class RobotContainer {
  private final LedSubsystem m_LedSubsystem = new LedSubsystem();
  private final Joystick operatorJoystick = new Joystick(1);
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(operatorJoystick, 1).onTrue(new changeLed(m_LedSubsystem).changeTo(LedState.kBREATH_RED));
    new JoystickButton(operatorJoystick, 1).onTrue(new changeLed(m_LedSubsystem).changeTo(LedState.kPARTY_PALETTE));
    new JoystickButton(operatorJoystick, 1).onTrue(new changeLed(m_LedSubsystem).changeTo(LedState.kBREATH_RED));

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
