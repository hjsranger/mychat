package com.hjs.mychat.entity;

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
public class MyFriends implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 好友ID
     */
    private String id;

    /**
     * 我的ID
     */
    private String myUserId;

    /**
     * 朋友的ID
     */
    private String myFriendUserId;


}
