package jammazwan.xav;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component
@WebService
public interface XavService {
	String noChange(String string);
}
