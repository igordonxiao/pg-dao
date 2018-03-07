## PG-DAO
> A simple Data Access tool which wpped [apache commons-dbutils](http://commons.apache.org/proper/commons-dbutils/) for PostgreSQL.

[pg-dao github](https://github.com/igordonxiao/pg-dao)

## ����
* ֧��ʵ��ID������
* ����`CRUD`����
* ֧��������ѯ����ҳ

## ʹ�÷�ʽ
1. ��`Conf.java`�ļ�������PostgreSQL������Ϣ

```java

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
```

2. ʹ��ʾ��

ʵ���ࣺ`User.java`

> �û��Զ����ʵ�����̳���`AbstractModel`

```java

public class User extends AbstractModel {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{\"id\": "+this.getId()+", \"name\": "+this.getName()+", \"age\": "+this.getAge()+", \"createdDate\": "+this.getCreatedDate()+", \"updatedDate\": "+this.getUpdatedDate()+", \"delFlag\": "+this.getDelFlag()+"}";
    }
}
```

2.1 �������
```java

    @Test
    public void testSave() {
        User user = new User();
        user.setName("Gordon");
        user.setAge(20);
        User userDb = dao.save(user, User.class);
        Assert.assertEquals("Gordon", userDb.getName());
    }
```

2.2 ����ID��ѯ����

```java

    @Test
    public void testFindUserById() {
        Long id = 1L;
        User user = dao.findById(id, User.class);
        Assert.assertEquals(id, user.getId());
    }
```

2.3 �޸Ķ���
```java

    @Test
    public void testUpdateUser() {
        User user = dao.findById(1L, User.class);
        user.setName("Gordon Xiao");
        User updatedUser = dao.update(user, User.class);
        Assert.assertEquals("Gordon Xiao", updatedUser.getName());
    }
```

2.4 ɾ������
```java

    @Test
    public void testDeleteUserById() {
        Long id = 1L;
        dao.deleteById(id, User.class);
        Assert.assertEquals(null, dao.findById(id, User.class));
    }
```

2.5 ��ҳ��������ѯ
```java

    @Test
    public void testFindPageUsers() {
        PageResult<User> page = dao.findPage(User.class, 15, 1, "id > 0 and createdDate > '2018-03-01 08:12:00'");
        Assert.assertTrue(page.getCount() > 0);
        Assert.assertTrue(page.getData().size() > 0);
    }
```