package io.igordonxiao.pgdao;

/**
 * ����
 */
public interface Conf {
    // ---------------------------------------------------------------
    //  ���ݿ���������
    /**
     * DB URL
     */
    String DB_URL = "jdbc:postgresql://[host]:[ip]/[databasename]";
    /**
     * DB DRIVER
     */
    String DB_DRIVER = "org.postgresql.Driver";
    /**
     * DB USER
     */
    String DB_USER = "[username]";
    /**
     * DB PASSWORD
     */
    String DB_PASSWORD = "[password]";


    /**
     * ��ҳ����
     */
    Integer DB_PAGE_SIZE = 15;

    /**
     * Ĭ�ϴӵڼ�����ȡ
     */
    Integer DB_PAGE_DEFAULT = 1;

    // ---------------------------------------------------------------

    /**
     * ����
     */
    String SERPERATOR_COMMA = ", ";

    /**
     * ID�ֶ�
     */
    String ID_FIELD = "id";
    /**
     * ����ʱ���ֶ�
     */
    String CREATED_DATE = "createdDate";
    /**
     * ����ʱ���ֶ�
     */
    String UPDATED_DATE = "updatedDate";
    /**
     * ɾ����ʶ�ֶ�
     */
    String DEL_FLAG = "delFlag";


}
