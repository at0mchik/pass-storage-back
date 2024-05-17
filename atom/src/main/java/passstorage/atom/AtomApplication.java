package passstorage.atom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;

// import jakarta.activation.DataSource;

@SpringBootApplication
public class AtomApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtomApplication.class, args);
	}

	// @Bean
    // public DataSource dataSource(){
    //     System.out.println(driverClass+" "+ url+" "+username+" "+password);
    //     DriverManagerDataSource source = new DriverManagerDataSource();
    //     source.setDriverClassName(driverClass);
    //     source.setUrl(url);
    //     source.setUsername(username);
    //     source.setPassword(password);
    //     return source;
    // }

    // @Bean
    // public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
    //     NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource());
    //     return namedParameterJdbcTemplate;
    // }

}
