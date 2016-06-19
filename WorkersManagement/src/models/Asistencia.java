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
public class Asistencia
{
    private Worker worker;
    
    private Date date;
    
    private TipoAsistencia asistencia;
    
    public Asistencia(Worker worker, Date date, TipoAsistencia asistencia)
    {
        this.worker=worker;
        this.date=date;
        this.asistencia=asistencia;
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
     * @return the asistencia
     */
    public TipoAsistencia getAsistencia() {
        return asistencia;
    }

    /**
     * @param asistencia the asistencia to set
     */
    public void setAsistencia(TipoAsistencia asistencia) {
        this.asistencia = asistencia;
    }
}
