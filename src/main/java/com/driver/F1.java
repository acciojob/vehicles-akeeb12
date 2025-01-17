package com.driver;

public class F1 extends Vehicle {
  private String teamName;

  public F1(String name, int speed, String teamName) {
      super(name, speed);
      this.teamName = teamName;
  }

  public String getTeamName() {
      return this.teamName;
  }
}