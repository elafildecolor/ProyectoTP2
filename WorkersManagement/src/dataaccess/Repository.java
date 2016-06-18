/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.util.List;

/**
 *
 * @author Paul Sáenz Sucre
 * @param <T>
 */
public class Repository<T extends EntityBase> implements IRepository<T>
{
    /**
     * Contiene las entidades
     */
    private List<T> entities;
    
    @Override
    public T GetById(int id)
    {
        for (T entity : entities)
        {
            if (entity.getId()==id)
            {
                return entity;
            }
        }
        return null;
    }

    @Override
    public Iterable<T> List()
    {
        return entities;
    }

    @Override
    public void Add(T entity)
    {
        entities.add(entity);
    }

    @Override
    public void Delete(T entity)
    {
        entities.remove(entity);
    }

    @Override
    public void Edit(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
