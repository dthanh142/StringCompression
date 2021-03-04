package thanhpham.example.StringCompression;

import org.springframework.stereotype.Service;

@Service
public class StringCompressServiceImpl implements StringCompressService {

	@Override
	public String stringCompress(String msg) {
		String result = "";
		
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
		return result;
	}

}
