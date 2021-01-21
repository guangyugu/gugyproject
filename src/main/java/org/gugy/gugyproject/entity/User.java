package org.gugy.gugyproject.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -123165461321651L;
    /**
     * ����id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �û�����
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * �û��˺�
     */
    @Column(name = "user_account")
    private String userAccount;

    /**
     * ����
     */
    private String password;

    /**
     * ��ϵ�绰
     */
    @Column(name = "phone_number")
    private Integer phoneNumber;

    /**
     * ���֤��
     */
    @Column(name = "id_card_number")
    private String idCardNumber;

    /**
     * ��ַ
     */
    private String address;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * �޸�ʱ��
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * ������
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * �޸���
     */
    @Column(name = "modify_user")
    private Long modifyUser;

    /**
     * ɾ����ʶ��1�ǣ�0��
     */
    private Integer removed;

    /**
     * ���ñ�ʶ��1�ǣ�0��
     */
    private Integer enabled;

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ�û�����
     *
     * @return user_name - �û�����
     */
    public String getUserName() {
        return userName;
    }

    /**
     * �����û�����
     *
     * @param userName �û�����
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * ��ȡ�û��˺�
     *
     * @return user_account - �û��˺�
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * �����û��˺�
     *
     * @param userAccount �û��˺�
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ��ϵ�绰
     *
     * @return phone_number - ��ϵ�绰
     */
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * ������ϵ�绰
     *
     * @param phoneNumber ��ϵ�绰
     */
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * ��ȡ���֤��
     *
     * @return id_card_number - ���֤��
     */
    public String getIdCardNumber() {
        return idCardNumber;
    }

    /**
     * �������֤��
     *
     * @param idCardNumber ���֤��
     */
    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    /**
     * ��ȡ��ַ
     *
     * @return address - ��ַ
     */
    public String getAddress() {
        return address;
    }

    /**
     * ���õ�ַ
     *
     * @param address ��ַ
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ�޸�ʱ��
     *
     * @return modify_time - �޸�ʱ��
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * �����޸�ʱ��
     *
     * @param modifyTime �޸�ʱ��
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * ��ȡ������
     *
     * @return create_user - ������
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * ���ô�����
     *
     * @param createUser ������
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * ��ȡ�޸���
     *
     * @return modify_user - �޸���
     */
    public Long getModifyUser() {
        return modifyUser;
    }

    /**
     * �����޸���
     *
     * @param modifyUser �޸���
     */
    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * ��ȡɾ����ʶ��1�ǣ�0��
     *
     * @return removed - ɾ����ʶ��1�ǣ�0��
     */
    public Integer getRemoved() {
        return removed;
    }

    /**
     * ����ɾ����ʶ��1�ǣ�0��
     *
     * @param removed ɾ����ʶ��1�ǣ�0��
     */
    public void setRemoved(Integer removed) {
        this.removed = removed;
    }

    /**
     * ��ȡ���ñ�ʶ��1�ǣ�0��
     *
     * @return enabled - ���ñ�ʶ��1�ǣ�0��
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * �������ñ�ʶ��1�ǣ�0��
     *
     * @param enabled ���ñ�ʶ��1�ǣ�0��
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}