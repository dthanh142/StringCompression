package thanhpham.example.StringCompression;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class StringCompressServiceImpl implements StringCompressService {

	final static Logger logger = Logger.getLogger(StringCompressionApplication.class);
	
	@Override
	public String stringCompress(String msg) {
		String result = "";
		
				
		try { 
			for (int i = 0; i < msg.length(); i++) { 

				int count = 1; 
				while (i < msg.length() - 1 && msg.charAt(i) == msg.charAt(i + 1)) { 
					count++; 
					i++; 
				} 

				if (count == 1) {
					result += msg.charAt(i); 
				} 
				else {
		    	  	result += msg.charAt(i); 
		    	  	result += count; 
				}
			} 

			
		} catch(Exception ex) {
			logger.error(ex);
		}
		
		return result;
	}

}
