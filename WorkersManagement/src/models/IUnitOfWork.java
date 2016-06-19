/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Paul Sáenz Sucre
 */
public interface IUnitOfWork
{
    //Commit sobre la base de datos. Si hay un problema de concurrencia lanzará una excepción
    void Commit();
    
    //Commit sobre la base de datos. Si hay un problema de concurrencia "refrescará" los datos del cliente. Aproximación "Client wins"
    void CommitAndRefreshChanges();
    
    //Rollback de los cambios que se han producido en la Unit of Work y que están siendo observados por ella
    void Rollback();
}
