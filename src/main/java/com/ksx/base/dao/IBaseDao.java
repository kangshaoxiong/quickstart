/**
The MIT License (MIT) * Copyright (c) 2015 铭飞科技

 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.ksx.base.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

import com.ksx.base.entity.BaseEntity;

/**
 * 基础dao
 * @author kangshaoxiong
 * @version 
 */
public interface IBaseDao {

	/**
	 * 保存
	 * @param entity 实体
	 * @return 返回保存后的id
	 */
	int saveEntity(BaseEntity entity);
	
	/**
	 * 根据id删除实体
	 * @param id 要删除的主键id
	 */
	void deleteEntity(int id);
	
	/**
	 * 更新实体
	 * @param entity 实体
	 */
	void updateEntity(BaseEntity entity);
	
	/**
	 * 查询所有
	 * @return 返回list数组
	 */
	List<BaseEntity> queryAll();
	
	
	/**
	 * 分页查询
	 * @param pageNo 页码
	 * @param pageSize 显示条数
	 * @param orderBy 排序字段
	 * @param order order 排序方式,true:asc;fales:desc
	 * @return 返回list数组
	 */
	List<BaseEntity> queryByPage(@Param("pageNo")int pageNo,@Param("pageSize")int pageSize,@Param("orderBy")String orderBy,@Param("order") boolean order);
	
	/**
	 * 查询数据表中记录集合总数
	 * @return 返回查询总条数
	 */
	int queryCount();
	
	/**
	 * 根据ID查询实体信息
	 * @param id 实体ID
	 * @return 返回base实体
	 */
	BaseEntity getEntity(Integer id);
	
	
	/**
	 * 动态sql查询
	 * @param table 表名称
	 * @param fields list集合
	 * @param wheres 条件　都是key-value对应
	 * @param begin 开始位置
	 * @param end 结束位置
	 * @param order 排序方式,true:asc;fales:desc
	 * @return 返回查询结果
	 */
	@SuppressWarnings("rawtypes")
	List queryBySQL(@Param("table")String table,@Param("fields") List<String> fields,@Param("wheres") Map wheres,@Param("begin") Integer begin,@Param("end") Integer end,@Param("order") String order);
	
	/**
	 * 总数
	 * @param table　表名称
	 * @param wheres　条件　都是key-value对应
	 * @return　总数
	 */
	int countBySQL(@Param("table")String table,@Param("wheres") Map wheres);
	
	/**
	 *动态SQL更新
	 * @param table 表名称
	 * @param fields list集合每个map都是key-value对应
	 * @param wheres 条件 都是key-value对应
	 */
	void updateBySQL(@Param("table")String table,@Param("fields") Map fields,@Param("wheres") Map wheres);
	
	/**
	 * 动态SQL删除
	 * @param table 表名称
    * @param wheres 條件 都是key-value对应
	 */
	
	void deleteBySQL(@Param("table")String table,@Param("wheres") Map wheres);
	
	/**
	 * 添加记录
	 * @param table 表名称
     * @param fields 编号
	 */
	void insertBySQL(@Param("table")String table,@Param("fields") Map fields);
	
	/**
	 * 创建表
	 * @param table 表名称
	 * @param fileds key:字段名称  list[0] 类型  list[1]长度 list[2]默认值 list[3]是否不填
	 */
	void createTable(@Param("table")String table,@Param("fileds")Map<Object,List> fileds);
	
	
	
	/**
	 * 修改表
	 * @param table 表名称
	 * @param fileds key:字段名称  list[0] 类型  list[1]长度 list[2]默认值 list[3]是否不填
	 */
	void alterTable(@Param("table")String table,@Param("fileds")Map fileds,@Param("type") String type);
	
	/**
	 * 删除表
	 * @param table 表名称
	 */
	void dropTable(@Param("table")String table);
	
	/**
	 * 导入执行数据
	 * @param sql　sql语句
	 */
	void excuteSql(@Param("sql")String sql);
	
	/**
	 * 批量新增
	 * @param list 新增数据
	 */
	void saveBatch(@Param("list")List list);
	
	/**
	 * 根据id集合实现批量的删除
	 * @param ids id集合
	 */
	void delete(@Param("ids")String[] ids);
}