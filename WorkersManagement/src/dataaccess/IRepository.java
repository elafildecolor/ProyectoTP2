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

    /**
     *
     * @param id
     * @return
     */
    T GetById(int id);

    /**
     *
     * @return
     */
    Iterable<T> GetAll();

    /**
     *
     * @param entity
     */
    void Add(T entity);

    /**
     *
     * @param entity
     */
    void Delete(T entity);

    /**
     *
     * @param entity
     */
    void Edit(T entity);
}
