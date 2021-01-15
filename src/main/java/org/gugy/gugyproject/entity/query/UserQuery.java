package org.gugy.gugyproject.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ������
 * 2021/1/12 16:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends PageQuery {

    /**
     * �û�����
     */
    private String userName;

    /**
     * ��ϵ�绰
     */
    private Integer phoneNumber;

}
