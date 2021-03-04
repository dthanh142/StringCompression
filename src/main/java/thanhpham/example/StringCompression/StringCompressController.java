package thanhpham.example.StringCompression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Validated
@RequestMapping( produces = MediaType.APPLICATION_JSON_VALUE)
public class StringCompressController {

	@Autowired
	StringCompressService stringCompressService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String stringCompress(@RequestParam String message) {
		return this.stringCompressService.stringCompress(message);
	}
	
}
