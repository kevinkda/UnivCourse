package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.BrandInfo;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.BrandInfoMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.BrandInfoService;
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
public class BrandInfoServiceImpl implements BrandInfoService{

    @Resource
    private BrandInfoMapper brandInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer brandId) {
        return brandInfoMapper.deleteByPrimaryKey(brandId);
    }

    @Override
    public int insert(BrandInfo record) {
        return brandInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(BrandInfo record) {
        return brandInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BrandInfo record) {
        return brandInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertOrUpdateWithBLOBs(BrandInfo record) {
        return brandInfoMapper.insertOrUpdateWithBLOBs(record);
    }

    @Override
    public int insertSelective(BrandInfo record) {
        return brandInfoMapper.insertSelective(record);
    }

    @Override
    public BrandInfo selectByPrimaryKey(Integer brandId) {
        return brandInfoMapper.selectByPrimaryKey(brandId);
    }

    @Override
    public int updateByPrimaryKeySelective(BrandInfo record) {
        return brandInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(BrandInfo record) {
        return brandInfoMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(BrandInfo record) {
        return brandInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<BrandInfo> list) {
        return brandInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BrandInfo> list) {
        return brandInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BrandInfo> list) {
        return brandInfoMapper.batchInsert(list);
    }

}
