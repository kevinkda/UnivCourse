package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.AmapDistrictTable;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.AmapDistrictTableMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.AmapDistrictTableService;
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
public class AmapDistrictTableServiceImpl implements AmapDistrictTableService{

    @Resource
    private AmapDistrictTableMapper amapDistrictTableMapper;

    @Override
    public int deleteByPrimaryKey(Integer districtId) {
        return amapDistrictTableMapper.deleteByPrimaryKey(districtId);
    }

    @Override
    public int insert(AmapDistrictTable record) {
        return amapDistrictTableMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(AmapDistrictTable record) {
        return amapDistrictTableMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AmapDistrictTable record) {
        return amapDistrictTableMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertOrUpdateWithBLOBs(AmapDistrictTable record) {
        return amapDistrictTableMapper.insertOrUpdateWithBLOBs(record);
    }

    @Override
    public int insertSelective(AmapDistrictTable record) {
        return amapDistrictTableMapper.insertSelective(record);
    }

    @Override
    public AmapDistrictTable selectByPrimaryKey(Integer districtId) {
        return amapDistrictTableMapper.selectByPrimaryKey(districtId);
    }

    @Override
    public int updateByPrimaryKeySelective(AmapDistrictTable record) {
        return amapDistrictTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(AmapDistrictTable record) {
        return amapDistrictTableMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(AmapDistrictTable record) {
        return amapDistrictTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<AmapDistrictTable> list) {
        return amapDistrictTableMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<AmapDistrictTable> list) {
        return amapDistrictTableMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<AmapDistrictTable> list) {
        return amapDistrictTableMapper.batchInsert(list);
    }

}
