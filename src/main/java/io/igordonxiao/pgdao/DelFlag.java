package io.igordonxiao.pgdao;

/**
 * ɾ����ʶ��
 */
public enum DelFlag {
    NORMAL(0), REMOVED(1);
    private Integer flag;
    private DelFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return String.valueOf(this.flag);
    }
}
