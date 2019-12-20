package com.soap.ws.xquery.transform.demo.resource;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Service;

import com.soap.ws.xquery.transform.demo.SOAPConnector;
import com.soap.ws.xquery.transformer.jaxbclasses.Confirmation;
import com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinksResponse;
import com.soap.ws.xquery.transformer.jaxbclasses.ServiceReplyEnum;

@Service
public class VidaService {

	@Autowired
	SOAPConnector connector;
	Confirmation confirmation = new Confirmation();

	public InsertLetterPDFLinksResponse callVidaEndPoint() throws XmlMappingException, IOException, JAXBException {

		File transformedXmlInputFile = new File("C:\\data\\ViewAccountDataTransformedInput.xml");

		JAXBContext jaxbContext = JAXBContext
				.newInstance(com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinks.class);
		javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinks insertLetterPdfLinksVidaRequest = (com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinks) jaxbUnmarshaller
				.unmarshal(transformedXmlInputFile);

		com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks convertedInsertLetterPdfLinksVidaRequest = convertReqToVidaEndPointRequest(
				insertLetterPdfLinksVidaRequest);

		/*
		 * javax.xml.bind.JAXBElement jaxbElement = (javax.xml.bind.JAXBElement)
		 * connector.callWebService(
		 * "http://localhost:9090/ws/CustomerDetails/lettermanagerwsschema",
		 * convertedInsertLetterPdfLinksVidaRequest);
		 */

		// Service call to QF3
		javax.xml.bind.JAXBElement jaxbElement = (javax.xml.bind.JAXBElement) connector.callWebService(
				"http://flcsvc01qf3.corp.psi:5001/LettersManagement/LetterManagerWSService",
				convertedInsertLetterPdfLinksVidaRequest);

		com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinksResponse insertLetterPDFLinksVidaResponse = (com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinksResponse) jaxbElement
				.getValue();

		InsertLetterPDFLinksResponse insertLetterPDFLinksOsbResponse = new InsertLetterPDFLinksResponse();
		confirmation.setMessage(insertLetterPDFLinksVidaResponse.getReturn().getMessage());
		confirmation.setServiceReply(ServiceReplyEnum.SUCCESS);

		insertLetterPDFLinksOsbResponse.setReturn(confirmation);

		return insertLetterPDFLinksOsbResponse;

	}

	private com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks convertReqToVidaEndPointRequest(
			com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinks links) {
		com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks vidaLink = new com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks();
		vidaLink.setFileName(links.getFileName());
		vidaLink.setFilePath(links.getFilePath());
		return vidaLink;
	}
}
