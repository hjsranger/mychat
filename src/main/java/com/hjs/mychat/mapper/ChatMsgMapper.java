package com.hjs.mychat.mapper;

import com.hjs.mychat.entity.ChatMsg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjsranger
 * @since 2019-12-21
 */
@Mapper
public interface ChatMsgMapper extends BaseMapper<ChatMsg> {

}
