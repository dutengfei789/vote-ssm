package com.baizhi.votesys.service.impl;

import com.baizhi.votesys.entity.Vote;
import com.baizhi.votesys.dao.VoteDao;
import com.baizhi.votesys.service.VoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 4096 kB 服务实现类
 * </p>
 *
 * @author 杜腾飞
 * @since 2019-02-22
 */
@Service
public class VoteServiceImpl extends ServiceImpl<VoteDao, Vote> implements VoteService {

}
