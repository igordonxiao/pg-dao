package io.igordonxiao.pgdao;

import java.util.List;

/**
 * ��ҳ����
 */
public class PageResult<T> {
    /**
     * ��¼����
     */
    private Long count;
    /**
     * ҳ��
     */
    private Integer page;
    /**
     * ��ҳ����
     */
    private Integer size;
    /**
     * ��¼��
     */
    private List<T> data;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
