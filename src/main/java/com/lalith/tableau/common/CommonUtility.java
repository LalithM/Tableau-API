package com.lalith.tableau.common;

import java.io.IOException;
import java.util.Objects;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lalith.tableau.models.SiteListType;
import com.lalith.tableau.models.SiteType;
import com.lalith.tableau.models.TableauCredentialsType;
import com.lalith.tableau.models.TsRequest;
import com.lalith.tableau.models.TsResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



@Component
public class CommonUtility {

	private final static Logger logger = Logger.getLogger(CommonUtility.class);

	public enum RestAPI {

		ADD_WORKBOOK_PERMISSIONS(getApiUriBuilder().path("sites/{siteId}/workbooks/{workbookId}/permissions")), 
		DELETE_WORKBOOK_PERMISSIONS(getApiUriBuilder().path("sites/{siteId}/workbooks/{workbookId}/permissions/users/{userId}/{capabilityName}/{capabilityMode}")), 
		APPEND_FILE_UPLOAD(getApiUriBuilder().path("sites/{siteId}/fileUploads/{uploadSessionId}")), 
		CREATE_GROUP(getApiUriBuilder().path("sites/{siteId}/groups")),
		INITIATE_FILE_UPLOAD(getApiUriBuilder().path("sites/{siteId}/fileUploads")), 
		PUBLISH_WORKBOOK(getApiUriBuilder().path("sites/{siteId}/workbooks")), 
		QUERY_PROJECTS(getApiUriBuilder().path("sites/{siteId}/projects")), 
		QUERY_SITES(getApiUriBuilder().path("sites")),
		QUERY_DATASOURCES(getApiUriBuilder().path("sites/{siteId}/datasources")),
		QUERY_WORKBOOKS(getApiUriBuilder().path("sites/{siteId}/workbooks")),
		QUERY_WORKBOOKS_USER(getApiUriBuilder().path("sites/{siteId}/users/{userId}/workbooks")),
		QUERY_VIEWS(getApiUriBuilder().path("sites/{siteId}/workbooks/{workbookId}/views")),
		QUERY_VIEWS_ON_SITE(getApiUriBuilder().path("sites/{siteId}/views")),
		QUERY_USERS_ON_SITE(getApiUriBuilder().path("sites/{siteId}/users")), 
		GET_WORKBOOK_PERMISSIONS(getApiUriBuilder().path("sites/{siteId}/workbooks/{workbookId}/permissions")),
		GET_USER(getApiUriBuilder().path("sites/{siteId}/users/{userId}")), 
		GET_WORKBOOK(getApiUriBuilder().path("sites/{siteId}/workbooks/{workbookId}")),
		UPDATE_USER(getApiUriBuilder().path("sites/{siteId}/users/{userId}")),
		SIGN_IN(getApiUriBuilder().path("auth/signin")), 
		SIGN_OUT(getApiUriBuilder().path("auth/signout"));

		private final UriBuilder uri_builder;

		RestAPI(UriBuilder builder) {
			uri_builder = builder;
		}

		UriBuilder getUriBuilder() {
			return uri_builder;
		}

		public String getUrl(Object... values) {
			return uri_builder.build(values).toString();
		}

	}

	private static String server="http://localhost:8001";

	@Autowired
	ObjectFactory objectFactory; 
	
	private final String TABLEAU_AUTH_HEADER = "X-Tableau-Auth";

	private static UriBuilder getApiUriBuilder() {
		return UriBuilder.fromPath(server + "/api/2.0");
	}

	public TableauCredentialsType invokeSignIn(String username, String password, String contentUrl) throws IOException {
		logger.info("Signing in to Tableau Server");
		String url = RestAPI.SIGN_IN.getUrl();
		TsRequest payload = createPayloadForSignin(username, password, contentUrl);
		TsResponse response = post(url, null, payload);
		if (Objects.isNull(response.getCredentials())) {
			throw new IOException("Sign IN Not successFull ");
		}
		 return response.getCredentials();
	}

	private TsRequest createPayloadForSignin(String username, String password, String contentUrl) {
		TsRequest requestPayload = objectFactory.createTsRequest();
		TableauCredentialsType signInCredentials = objectFactory.createTableauCredentialsType();
		SiteType site = objectFactory.createSiteType();
		site.setContentUrl(contentUrl);
		signInCredentials.setSite(site);
		signInCredentials.setName(username);
		signInCredentials.setPassword(password);
		requestPayload.setCredentials(signInCredentials);
		return requestPayload;
	}

	private TsResponse post(String url, String authToken, TsRequest requestPayload) {
		logger.debug("Input payload: \n" + requestPayload);
		ObjectMapper mapper = new ObjectMapper();
		String payload =null;
		Client client = Client.create();
		WebResource webResource = client.resource(url);
		try {
			payload = mapper.writeValueAsString(requestPayload);
		} catch (JsonProcessingException e) {
			logger.error("Utils.Post Creates error" +e);
		}
		ClientResponse clientResponse = webResource.header(TABLEAU_AUTH_HEADER, authToken).type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, payload);
		String responseJSON = clientResponse.getEntity(String.class);
		logger.debug("Response: \n" + responseJSON);
		return JSONResponse(responseJSON);
	}
	
	private TsResponse JSONResponse(String responseJSON) {
        TsResponse tsResponse = objectFactory.createTsResponse();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
       try {
        	tsResponse = mapper.readValue(responseJSON, TsResponse.class);
		} catch (IOException e) {
			logger.error("Utils.JSONResponse Creates error" +e);
		}
        return tsResponse;
    }
	
	private TsResponse get(String url, String authToken) {
        Client client = Client.create();
        WebResource webResource = client.resource(url).queryParam("pageSize", "1000").queryParam("pageNumber", "1");
        ClientResponse clientResponse = webResource.header(TABLEAU_AUTH_HEADER, authToken).accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        
        String responseJSON = clientResponse.getEntity(String.class);
        logger.info("Response: \n" + responseJSON);
        return JSONResponse(responseJSON);
    }
	
	
	public TsResponse query(TableauCredentialsType credential, String url ) throws IOException{
    	TsResponse response = get(url, credential.getToken());
    	if (Objects.isNull(response)) {
        	throw new IOException("Response is not available");
        }
    	return response;
    }

	

}