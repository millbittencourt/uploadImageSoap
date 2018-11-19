package uploadImageSoap;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface UploadImageInterface {
	
	@WebMethod void uploadImage(String b64) throws IOException;
	

}
