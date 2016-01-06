package com.ksx.base.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ksx.base.dao.IBaseDao;
import com.ksx.base.entity.BaseEntity;
import com.ksx.base.service.IBaseService;
import com.ksx.util.PageUtil;

public abstract class BaseServiceImpl implements IBaseService{
	
	/**
	 * LOG对象
	 */
	protected final  Logger LOG = Logger.getLogger(this.getClass());
	
	@Override
	public int saveEntity(BaseEntity entity) {
		return getDao().saveEntity(entity);
	}

	@Override
	public void deleteEntity(int id) {
		// TODO Auto-generated method stub
		getDao().deleteEntity(id);
	}

	@Override
	public void updateEntity(BaseEntity entity) {
		
		// TODO Auto-generated method stub
		getDao().updateEntity(entity);
	}

	@Override
	public List<BaseEntity> queryAll() {
		// TODO Auto-generated method stub
		return getDao().queryAll();
	}
	
	


	@Override
    public List<BaseEntity> queryByPage(PageUtil page,String orderBy,boolean order) {
        // TODO Auto-generated method stub
        return getDao().queryByPage(page.getPageNo(),page.getPageSize(), orderBy, order);
    }

	@Override
	public int queryCount(){
		return getDao().queryCount();
	}
	
	@Override
	public BaseEntity getEntity(int id){
		return getDao().getEntity(id);
	}
	

	

	@Override
	public List queryBySQL(String table, List<String> fields,Map wheres,Integer begin,Integer end) {
		// TODO Auto-generated method stub
		return  getDao().queryBySQL(table, fields, wheres,begin,end,null);
	}

	@Override
	public int countBySQL(String table, Map wheres) {
		// TODO Auto-generated method stub
		return   getDao().countBySQL(table, wheres);
	}

	@Override
	public List queryBySQL(String table, List<String> fields, Map wheres) {
		// TODO Auto-generated method stub
		return  getDao().queryBySQL(table, fields, wheres,null,null,null);
	}

	@Override
	public void updateBySQL(String table, Map fields, Map wheres) {
		// TODO Auto-generated method stub
		getDao().updateBySQL(table, fields, wheres);
	}

	@Override
	public void deleteBySQL(String table, Map wheres) {
		// TODO Auto-generated method stub
		getDao().deleteBySQL(table, wheres);
	}

	@Override
	public void insertBySQL(String table, Map fields) {
		// TODO Auto-generated method stub
		getDao().insertBySQL(table, fields);
	}
	
	

	@Override
	public void createTable(String table, Map<Object, List> fileds) {
		// TODO Auto-generated method stub
		getDao().createTable(table, fileds);
	}

	@Override
	public void alterTable(String table, Map fileds,String type) {
		// TODO Auto-generated method stub
		getDao().alterTable(table, fileds,type);
	}

	@Override
	public void dropTable(String table) {
		// TODO Auto-generated method stub
		getDao().dropTable(table);
	}

	@Override
	public void excuteSql(String sql) {
		// TODO Auto-generated method stub
		
	}

	protected abstract IBaseDao getDao();

	@Override
	public void saveBatch(List list){
		getDao().saveBatch(list);
	}
	
	@Override
	public void delete(String[] ids){
		getDao().delete(ids);
	}
}
