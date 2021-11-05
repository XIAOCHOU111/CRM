package org.gpf.crm.base;

import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * BaseMapper基本方法定义
 *
 * @param <T>
 * @param <ID>
 */
public interface BaseMapper<T, ID> {
    /**
     * 添加记录返回行数
     *
     * @param entity
     * @return
     * @throws DataAccessException
     */
    public Integer insertSelective(T entity) throws DataAccessException;

    /**
     * 添加记录返回主键
     *
     * @param entity
     * @return
     * @throws DataAccessException
     */
    public Integer insertHasKey(T entity) throws DataAccessException;

    /**
     * 批量添加
     *
     * @param entities
     * @return
     * @throws DataAccessException
     */
    public Integer insertBatch(List<T> entities) throws DataAccessException;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     * @throws DataAccessException
     */
    public T selectByPrimaryKey(ID id) throws DataAccessException;

    /**
     * 多条件查询
     *
     * @param baseQuery
     * @return
     * @throws DataAccessException
     */
    public List<T> selectByParams(BaseQuery baseQuery) throws DataAccessException;

    /**
     * 更新单条记录
     *
     * @param entity
     * @return
     * @throws DataAccessException
     */
    public Integer updateByPrimaryKeySelective(T entity) throws DataAccessException;

    /**
     * 根据id进行删除
     *
     * @param id
     * @return
     * @throws DataAccessException
     */
    public Integer deleteByPrimaryKey(ID id) throws DataAccessException;

}
