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
public class Turno
{
    /**
     * 
     */
    private String name;
    
    /**
     * 
     */
    private Date initTime;
    
    /**
     * 
     */
    private Date finishTime;
    
    /**
     * 
     * @param name
     * @param initTime
     * @param finishTime 
     */
    public Turno(String name, Date initTime, Date finishTime)
    {
        this.name=name;
        this.initTime=initTime;
        this.finishTime=finishTime;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString()
    {
        return this.name;
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
     * @return the initTime
     */
    public Date getInitTime() {
        return initTime;
    }

    /**
     * @param initTime the initTime to set
     */
    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    /**
     * @return the finishTime
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * @param finishTime the finishTime to set
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}
