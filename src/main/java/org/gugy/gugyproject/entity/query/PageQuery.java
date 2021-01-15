package org.gugy.gugyproject.entity.query;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author ������
 * 2021/1/12 16:25
 */
public class PageQuery {

    /**
     * ����ҳ��
     */
    private static final Integer MAX_PAGESIZE = 100;

    /**
     * ��ǰҳ��
     */
    private Integer page;

    /**
     * ��ʾ��
     */
    private Integer pageSize;


    public Integer getPage() {
        if (this.page == null || this.page < 1) {
            this.page = 1;
        }
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        if (this.pageSize == null || this.pageSize < 1) {
            this.pageSize = 20;
        }
        return Math.min(this.pageSize, MAX_PAGESIZE);
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
