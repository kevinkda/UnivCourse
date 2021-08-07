package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.ShoppingCart;

import java.util.List;
    /**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
public interface ShoppingCartService{


    int deleteByPrimaryKey(Integer itemId);

    int insert(ShoppingCart record);

    int insertOrUpdate(ShoppingCart record);

    int insertOrUpdateSelective(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    int updateBatch(List<ShoppingCart> list);

    int updateBatchSelective(List<ShoppingCart> list);

    int batchInsert(List<ShoppingCart> list);

}
