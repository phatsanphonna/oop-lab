/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07.question2;

/**
 *
 * @author phats
 */
public abstract class Vehicle implements Diselable {
    protected double fuel;
    
    public Vehicle() {
	this(0);
    }
    
    public Vehicle(double fuel) {
	this.fuel = fuel;
    }
    
    public void setFuel(double fuel) {
	this.fuel = fuel;
    }
    
    public double getFuel() {
	return this.fuel;
    }
    
    public void addFuel(double fuel) {
	if (fuel <= 0) {
	    System.out.println("Fuel is empty.");
	    return;
	}
	
	this.setFuel(this.getFuel() + fuel);
    }
    
    public abstract void honk();
}
