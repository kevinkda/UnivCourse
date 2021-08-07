package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.CommodityInformation;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.CommodityInformationMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.CommodityInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
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
public class CommodityInformationServiceImpl implements CommodityInformationService {

    @Resource
    private CommodityInformationMapper commodityInformationMapper;

    @Override
    public int deleteByPrimaryKey(Integer commodityId) {
        return commodityInformationMapper.deleteByPrimaryKey(commodityId);
    }

    @Override
    public int insert(CommodityInformation record) {
        return commodityInformationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CommodityInformation record) {
        return commodityInformationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CommodityInformation record) {
        return commodityInformationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertOrUpdateWithBLOBs(CommodityInformation record) {
        return commodityInformationMapper.insertOrUpdateWithBLOBs(record);
    }

    @Override
    public int insertSelective(CommodityInformation record) {
        return commodityInformationMapper.insertSelective(record);
    }

    @Override
    public List<CommodityInformation> selectAll() {
        return commodityInformationMapper.selectAll();
    }

    @Override
    public CommodityInformation selectByPrimaryKey(Integer commodityId) {
        return commodityInformationMapper.selectByPrimaryKey(commodityId);
    }

    @Override
    public List<CommodityInformation> selectRecommendList() {
        return commodityInformationMapper.selectRecommendList();
    }

    @Override
    public List<CommodityInformation> selectRecommendListByUserId(int userId) {
        return commodityInformationMapper.selectRecommendListByUserId(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityInformation record) {
        return commodityInformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CommodityInformation record) {
        return commodityInformationMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(CommodityInformation record) {
        return commodityInformationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CommodityInformation> list) {
        return commodityInformationMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CommodityInformation> list) {
        return commodityInformationMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CommodityInformation> list) {
        return commodityInformationMapper.batchInsert(list);
    }

}



