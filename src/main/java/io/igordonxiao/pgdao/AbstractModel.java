package io.igordonxiao.pgdao;

import java.sql.Timestamp;
import java.util.Date;

abstract public class AbstractModel {

    /**
     * ID
     */
    private Long id;

    /**
     * ����ʱ��
     * PG-JDBC driver��֧��Date
     */
    private Timestamp createdDate;
    /**
     * ����ʱ��
     */
    private Timestamp updatedDate;

    /**
     * ɾ����ʶ
     */
    private Integer delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
