package org.gugy.gugyproject.service;

import org.gugy.gugyproject.entity.User;
import org.gugy.gugyproject.entity.query.UserQuery;
import org.gugy.gugyproject.entity.receive.UserReceive;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ������
 * 2021/1/12 15:23
 */
public interface UserService {

    /**
     * ��ȡ�û��б�
     * @param query ��ѯ����
     * @return �û��б�
     */
    List<User> getUserList(UserQuery query);

    /**
     * �����û�
     * @param receive
     * @return
     */
    Long addUser(UserReceive receive);
}
