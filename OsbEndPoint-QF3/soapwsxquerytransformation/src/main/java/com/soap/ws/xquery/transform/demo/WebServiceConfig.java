package com.soap.ws.xquery.transform.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@EnableWs
@Configuration
public class WebServiceConfig {
	
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/osbws/*");
	}
	
	@Bean(name = "osbletterservice")
	public SimpleWsdl11Definition orders() {
		return new SimpleWsdl11Definition(new ClassPathResource("/wsdl/osblettermanagerws.wsdl"));
	}

	/*
	 * @Bean(name = "osbletterservice") public DefaultWsdl11Definition
	 * defaultWsdl11Definition(XsdSchema transformSchema) { DefaultWsdl11Definition
	 * definition = new DefaultWsdl11Definition();
	 * definition.setPortTypeName("TransformPort");
	 * definition.setTargetNamespace("http://webservice.flhk.com/FLHKWebService/1.0"
	 * ); definition.setLocationUri("/osbws");
	 * definition.setSchema(transformSchema); return definition; }
	 * 
	 * @Bean public XsdSchema transformSchema() { return new SimpleXsdSchema(new
	 * ClassPathResource("LetterManagerWSSchema.xsd")); }
	 */

	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
		SOAPConnector client = new SOAPConnector();
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.soap.ws.xquery.transformer.vidaJaxbclasses");
		return marshaller;
	}
}
