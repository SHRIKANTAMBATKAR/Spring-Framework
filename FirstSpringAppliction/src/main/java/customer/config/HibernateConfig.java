package customer.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mysql.cj.xdevapi.SessionFactory;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.customer")
public class HibernateConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/customerdb");
        ds.setUsername("root");
        ds.setPassword("SHRIKANT@2024");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return ds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
        factory.setDataSource(dataSource());
        factory.setPackagesToScan("com.customer.model");

        Properties p = new Properties();
        p.put("hibernate.hbm2ddl.auto","update");
        p.put("hibernate.show_sql","true");
        p.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");

        factory.setHibernateProperties(p);
        return factory;
    }

    @Bean
    public HibernateTransactionManager txManager(SessionFactory sf) {
        return new HibernateTransactionManager();
    }
}
