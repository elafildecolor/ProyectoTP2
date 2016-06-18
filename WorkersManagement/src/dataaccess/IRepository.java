/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

/**
 *
 * @author Paul Sáenz Sucre
 * @param <T>
 */
public interface IRepository<T extends EntityBase>
{
    T GetById(int id);
    Iterable<T> List();
    void Add(T entity);
    void Delete(T entity);
    void Edit(T entity);
}
