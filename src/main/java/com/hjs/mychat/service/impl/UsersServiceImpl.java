package com.hjs.mychat.service.impl;

import com.hjs.mychat.entity.Users;
import com.hjs.mychat.mapper.UsersMapper;
import com.hjs.mychat.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author hjsranger
 * @since 2019-12-21
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
