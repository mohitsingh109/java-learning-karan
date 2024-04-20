package com.learning.lesson4.polymorphism;

public class Manager extends Employee {

    private int teamSize;

    private String projectName;

    public Manager(String name, double salary, int teamSize, String projectName) {
        super(name, salary);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    public void addBonus(double bonus) {
        super.addBonus(bonus + 10); // 15
    }

    public void showTeamSalary() {
        System.out.println("Team Salary");
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
