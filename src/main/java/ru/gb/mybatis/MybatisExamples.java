package ru.gb.mybatis;

import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import ru.gb.mybatis.dao.UsersMapper;
import ru.gb.mybatis.model.Users;
import ru.gb.mybatis.model.UsersExample;

public class MybatisExamples {

    @SneakyThrows
    private static SqlSession getSession() {
        return new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"))
                .openSession();
    }


    public static void main(String[] args) {
        try (SqlSession sqlSession = getSession()) {
            UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);

            Users user = new Users();
            user.setUserId(53453);
            user.setName("User 53453");
            usersMapper.insert(user);

            UsersExample usersExample = new UsersExample();
            usersExample.createCriteria().andNameEqualTo(user.getName());

            usersMapper.selectByExample(usersExample).forEach(System.out::println);

            usersMapper.deleteByPrimaryKey(user.getUserId());

            usersMapper.selectByExample(usersExample).forEach(System.out::println);
        }
    }
}
