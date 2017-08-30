package springBootTest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="my")
public class YamlProperties {
	
	private String address;
	
	public String getAddress(){
		return this.address;
	}
	

}
