package io.igordonxiao.pgdao;

/**
 * ���ݿ��ѯ����ʽ
 */
public enum OrderFlag {

    ASC("ASC"), DESC("DESC");
    private String flag;
    private OrderFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return this.flag;
    }
}
