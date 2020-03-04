package co.grandcircus.Lab28Weather;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.Lab28Weather.model.WeatherResponse;


@Component
public class ApiService {

	//@Value("${times-key}")
	//private String apiKey;

	private RestTemplate rt;

	// initialization block that runs when a new instance of the class is created
	// loaded before the constructor
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "ooeeee!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}



	public WeatherResponse getWeather() {

		//String token = "29e30457de1595cebdbd43545111c5af5e46e8c5";

		String url = "https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";

		HttpHeaders headers = new HttpHeaders();
		//headers.add("Authorization", "Token " + token);

		WeatherResponse response = null;

		try {
			response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), WeatherResponse.class).getBody();
		} catch (RestClientException e) {
			System.out.println("Defintion not found!");
		}

		return response;
	}
}