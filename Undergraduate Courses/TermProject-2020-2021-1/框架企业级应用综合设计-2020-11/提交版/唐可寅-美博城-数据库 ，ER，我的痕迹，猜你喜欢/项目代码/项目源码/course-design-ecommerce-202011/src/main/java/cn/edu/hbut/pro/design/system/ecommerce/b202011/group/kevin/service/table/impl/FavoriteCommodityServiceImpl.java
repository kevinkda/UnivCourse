package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.FavoriteCommodity;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.FavoriteCommodityMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.FavoriteCommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Service
public class FavoriteCommodityServiceImpl implements FavoriteCommodityService{

    @Resource
    private FavoriteCommodityMapper favoriteCommodityMapper;

    @Override
    public int deleteByPrimaryKey(Integer collectionId) {
        return favoriteCommodityMapper.deleteByPrimaryKey(collectionId);
    }

    @Override
    public int insert(FavoriteCommodity record) {
        return favoriteCommodityMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(FavoriteCommodity record) {
        return favoriteCommodityMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(FavoriteCommodity record) {
        return favoriteCommodityMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(FavoriteCommodity record) {
        return favoriteCommodityMapper.insertSelective(record);
    }

    @Override
    public FavoriteCommodity selectByPrimaryKey(Integer collectionId) {
        return favoriteCommodityMapper.selectByPrimaryKey(collectionId);
    }

    @Override
    public int updateByPrimaryKeySelective(FavoriteCommodity record) {
        return favoriteCommodityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FavoriteCommodity record) {
        return favoriteCommodityMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<FavoriteCommodity> list) {
        return favoriteCommodityMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<FavoriteCommodity> list) {
        return favoriteCommodityMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<FavoriteCommodity> list) {
        return favoriteCommodityMapper.batchInsert(list);
    }

}
