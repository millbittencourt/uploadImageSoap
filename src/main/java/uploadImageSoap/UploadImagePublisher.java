package uploadImageSoap;

import javax.xml.ws.Endpoint;

public class UploadImagePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8085/uploadImageSoap", new UploadImageController());

	}

}
