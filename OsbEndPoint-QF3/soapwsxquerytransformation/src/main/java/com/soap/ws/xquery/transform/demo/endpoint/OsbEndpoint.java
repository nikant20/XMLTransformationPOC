package com.soap.ws.xquery.transform.demo.endpoint;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.ws.xquery.transform.demo.resource.FileService;
import com.soap.ws.xquery.transform.demo.resource.TransformationService;
import com.soap.ws.xquery.transform.demo.resource.VidaService;
import com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinks;
import com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinksResponse;

@Endpoint
public class OsbEndpoint {

	@Autowired
	TransformationService transformService;

	@Autowired
	FileService fileService;

	@Autowired
	VidaService vidaService;

	@PayloadRoot(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", localPart = "insertLetterPDFLinks")
	@ResponsePayload
	public InsertLetterPDFLinksResponse processOsbRequest(
			@RequestPayload InsertLetterPDFLinks insertLetterPdfLinksOsbRequest, MessageContext mc)
			throws Exception {

		InsertLetterPDFLinksResponse response = null;
		JAXBContext jaxbContext = JAXBContext.newInstance(InsertLetterPDFLinks.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		String transformedXmlData = null;
		File inputXmlFile = new File("C:/data/ViewAccountDataInput.xml");

		jaxbMarshaller.marshal(insertLetterPdfLinksOsbRequest, inputXmlFile);

		transformedXmlData = transformService.executeTransformation();

		if (fileService.writeTransformedXmlData(transformedXmlData)) {
			response = vidaService.callVidaEndPoint();
		}
		return response;
	}

}
