/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul Sáenz Sucre
 */
public class UnitOfWork
{
    private List<Worker> workers=new ArrayList<>();
    
    private List<Turno>turnos=new ArrayList<>();
    
    private List<Pago> pagos=new ArrayList<>();
    
    FileInputStream inputStream=null;
    
    FileOutputStream outputStream=null;
    
    ObjectInputStream objectInputStream=null;
    
    ObjectOutputStream objectOutputStream=null;
    
    public UnitOfWork()
    {        
        LoadEntities();
    }
    
    public List<Worker> getWorkers()
    {
        return workers;
    }
    
    public List<Turno> getTurnos()
    {
        return turnos;
    }
    
    public List<Pago> getPagos()
    {
        return pagos;
    }

    private void LoadEntities()
    {
        int c;
        try 
        {
            inputStream=new FileInputStream("/data/entities.dat");
            
            objectInputStream=new ObjectInputStream(inputStream);
            
            turnos=(ArrayList<Turno>) objectInputStream.readObject();
            
            workers=(ArrayList<Worker>) objectInputStream.readObject();
            
            pagos=(ArrayList<Pago>) objectInputStream.readObject();
            
            objectInputStream.close();
            
            inputStream.close();
        }
        catch (Exception ex) 
        {
            
        }
    }
    
    public void SaveEntities()
    {
        int c;
        try 
        {
            outputStream=new FileOutputStream("/data/entities.dat");
            
            objectOutputStream=new ObjectOutputStream(outputStream);
            
            objectOutputStream.writeObject(turnos);
            
            objectOutputStream.writeObject(workers);
            
            objectOutputStream.writeObject(pagos);
            
            objectOutputStream.close();
            
            outputStream.close();
        }
        catch (Exception ex) 
        {
            
        }
    }
}
