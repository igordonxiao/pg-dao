package io.igordonxiao.pgdao;


import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ���ݿ����������
 * ֻ֧��PostgreSQL
 */
public abstract class DbKit {
    private DbKit() {
    }

    /**
     * ��ȡ���ݿ�����
     *
     * @return
     */
    public static Connection getConnection() {
        DbUtils.loadDriver(Conf.DB_DRIVER);
        try {
            return DriverManager.getConnection(Conf.DB_URL, Conf.DB_USER, Conf.DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * �ر����ݿ�����
     *
     * @param connection
     */
    public static void closeConnection(Connection connection) {
        try {
            DbUtils.close(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * ʹ�ø����ķ����������鲢����ַ���
     * @param data
     * @param seperater
     * @return
     */
    public static String joinArray(Object[] data, String seperater) {
        if (data == null || data.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int dataLen = data.length;
        for (int i = 0; i < dataLen; i++) {
            sb.append(data[i] + (i < dataLen - 1 ? seperater:""));
        }
        return sb.toString();
    }

    /**
     * �����ʺ�
     * @param count
     * @return
     */
    public static String genQuestionMarks(Integer count) {
        if (count == null || count <=0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append((i < count - 1) ? "?,": "?");
        }
        return sb.toString();
    }
}
