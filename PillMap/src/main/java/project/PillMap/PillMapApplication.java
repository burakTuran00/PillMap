package project.PillMap;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import project.PillMap.repository.PharmacyRepository;

import java.util.Locale;

@SpringBootApplication
public class PillMapApplication {
	private PharmacyRepository pharmacyRepository;

    public static void main(String[] args) {
		SpringApplication.run(PillMapApplication.class, args);
	}

	@Bean
	public SessionLocaleResolver localResolver(){
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Bean
	public PharmacyRepository pRepo(){
		return pharmacyRepository;
	}
}
