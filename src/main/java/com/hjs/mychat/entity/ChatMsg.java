package com.hjs.mychat.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjsranger
 * @since 2019-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChatMsg implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 聊天ID
     */
    private String id;

    /**
     * 发送用户ID
     */
    private String sendUserId;

    /**
     * 接收用户ID
     */
    private String acceptUserId;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 消息已读状态
     */
    private Integer signFlag;

    /**
     * 时间
     */
    private LocalDateTime createTime;


}
