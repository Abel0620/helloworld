package com.yidu.service.impl;

import com.yidu.entity.Userinfo;
import com.yidu.dao.UserinfoDao;
import com.yidu.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-12 10:30:40
 */
@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    private UserinfoDao userinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    @Override
    public Userinfo queryById(Integer pid) {
        return this.userinfoDao.queryById(pid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Userinfo> queryAllByLimit(int offset, int limit) {
        return this.userinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Userinfo insert(Userinfo userinfo) {
        this.userinfoDao.insert(userinfo);
        return userinfo;
    }

    /**
     * 修改数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Userinfo update(Userinfo userinfo) {
        this.userinfoDao.update(userinfo);
        return this.queryById(userinfo.getPid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pid) {
        return this.userinfoDao.deleteById(pid) > 0;
    }
}