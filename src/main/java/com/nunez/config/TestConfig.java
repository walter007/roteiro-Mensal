package com.nunez.config;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nunez.entities.Ano;
import com.nunez.repositories.AnoRepository;
import com.nunez.services.AnoService;

@Configuration
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AnoRepository reporitory;

	@Override
	public void run(String... args) throws Exception {
		/*Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.MONTH, Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 20);

		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));*/
		
		//Ano ano = new Ano(1,2021);
		//reporitory.save(ano);
		
	}

}
