package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.CountryCode;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.CountryCodeMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.CountryCodeService;
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
public class CountryCodeServiceImpl implements CountryCodeService{

    @Resource
    private CountryCodeMapper countryCodeMapper;

    @Override
    public int deleteByPrimaryKey(Integer countryId) {
        return countryCodeMapper.deleteByPrimaryKey(countryId);
    }

    @Override
    public int insert(CountryCode record) {
        return countryCodeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CountryCode record) {
        return countryCodeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CountryCode record) {
        return countryCodeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertOrUpdateWithBLOBs(CountryCode record) {
        return countryCodeMapper.insertOrUpdateWithBLOBs(record);
    }

    @Override
    public int insertSelective(CountryCode record) {
        return countryCodeMapper.insertSelective(record);
    }

    @Override
    public CountryCode selectByPrimaryKey(Integer countryId) {
        return countryCodeMapper.selectByPrimaryKey(countryId);
    }

    @Override
    public int updateByPrimaryKeySelective(CountryCode record) {
        return countryCodeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CountryCode record) {
        return countryCodeMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(CountryCode record) {
        return countryCodeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CountryCode> list) {
        return countryCodeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CountryCode> list) {
        return countryCodeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CountryCode> list) {
        return countryCodeMapper.batchInsert(list);
    }

}
