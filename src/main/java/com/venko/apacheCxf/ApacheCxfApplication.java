package com.venko.apacheCxf;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.venko.apacheCxf.repostories.WorkerRepository;

@SpringBootApplication
public class ApacheCxfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCxfApplication.class, args);
		JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
		factoryBean.setResourceClasses(WorkerRepository.class);
		factoryBean.setResourceProvider(new SingletonResourceProvider(new WorkerRepository()));
		factoryBean.setAddress("http://localhost:8095/");
		Server server = factoryBean.create();
	}

}
