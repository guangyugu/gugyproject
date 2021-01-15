package org.gugy.gugyproject.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 辜光宇
 * 2021/1/12 16:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends PageQuery {

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 联系电话
     */
    private Integer phoneNumber;

}
