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
public class FriendsRequest implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 好友请求ID
     */
    private String id;

    /**
     * 发送请求的用户ID
     */
    private String sendUserId;

    /**
     * 接收请求的用户ID
     */
    private String acceptUserId;

    /**
     * 时间
     */
    private LocalDateTime requestDateTime;


}
