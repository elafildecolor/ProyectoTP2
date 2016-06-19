/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Paul
 */
public class Pago
{
    private Worker worker;
    
    private Date date;
    
    private TipoMovimiento tipoMovimiento;
    
    private double monto;

    /**
     *
     * @param worker
     * @param date
     * @param tipoMovimiento
     * @param monto
     */
    public Pago(Worker worker,Date date,TipoMovimiento tipoMovimiento,double monto)
    {
        this.worker = worker;
        this.date = date;
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;        
    }
    
    /**
     * @return the worker
     */
    public Worker getWorker() {
        return worker;
    }

    /**
     * @param worker the worker to set
     */
    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the tipoMovimiento
     */
    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    /**
     * @param tipoMovimiento the tipoMovimiento to set
     */
    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
