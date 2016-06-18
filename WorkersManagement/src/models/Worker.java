/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Paul Sáenz Sucre
 */
public class Worker
{
    private String dni;
    
    private String name;
    
    private String lastname;
    
    private Date birthday;
    
    private Turno turno;
    
    private double weekSalary;
    
    private double daysalary;
    
    private double discount;
    
    private String path;
    
    public Worker()
    {
        
    }
    
    public Worker(String dni, String name, String lastname, Date birthday
            ,Turno turno,double weekSalary,double discount,String path)
    {
        this.dni=dni;
        this.name=name;
        this.lastname=lastname;
        this.birthday=birthday;
        this.turno=turno;
        this.weekSalary=weekSalary;
        this.discount=discount;
        this.path=path;
        
    }

    @Override
    public String toString()
    {
        return name+" "+lastname;
    }
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the fkturno
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    /**
     * @return the weekSalary
     */
    public double getWeekSalary() {
        return weekSalary;
    }

    /**
     * @param weekSalary the weekSalary to set
     */
    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    /**
     * @return the daysalary
     */
    public double getDaysalary() {
        return daysalary;
    }

    /**
     * @param daysalary the daysalary to set
     */
    public void setDaysalary(double daysalary) {
        this.daysalary = daysalary;
    }

    /**
     * @return the hourdiscount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the hourdiscount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
}
