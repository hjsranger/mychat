package com.hjs.mychat.service;

import com.hjs.mychat.entity.Users;
import com.hjs.mychat.mapper.UsersMapper;
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
public class UsersService extends ServiceImpl<UsersMapper, Users> {

}
