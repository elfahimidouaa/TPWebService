package ma.projet.TpXML.config;

import ma.projet.TpXML.service.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class);

        // Optionally, specify the application path for Jersey if it isn't working
        // jerseyServlet.property("jersey.config.server.application.path", "/");

        return jerseyServlet;
    }
}
