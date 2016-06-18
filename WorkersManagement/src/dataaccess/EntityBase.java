/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

/**
 *
 * @author Paul Sáenz Sucre
 */
public abstract class EntityBase
{
    /**
     * 
     */
    private int id;

    /**
     * @return the Id
     */
    public int getId() {
        return id;
    }

    /**
     * @param Id the Id to set
     */
    protected void setId(int Id) {
        this.id = Id;
    }
}
