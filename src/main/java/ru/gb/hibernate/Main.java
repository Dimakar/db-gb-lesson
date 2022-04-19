package ru.gb.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ru.gb.hibernate.entity.UsersEntity;

import javax.persistence.metamodel.EntityType;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        try (Session session = getSession()) {
            UsersEntity usersEntity = new UsersEntity();
            usersEntity.setUserId(12345);
            usersEntity.setName("User 12345");
            session.save(usersEntity);
            System.out.println(session.get(UsersEntity.class, usersEntity.getUserId()));
            usersEntity.setName(usersEntity.getName() + " changed");
            session.update(usersEntity);
            System.out.println(session.get(UsersEntity.class, usersEntity.getUserId()));
            session.delete(usersEntity);
            System.out.println(session.get(UsersEntity.class, usersEntity.getUserId()));

//            System.out.println(session.get(UsersEntity.class, 1).getSalesByUserId().stream()
//                    .findAny().orElseThrow().getSaleId());

        }
    }
}