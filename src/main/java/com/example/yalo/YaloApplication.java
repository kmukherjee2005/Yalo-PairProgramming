package com.example.yalo;

import com.example.yalo.model.Recipient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class YaloApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(YaloApplication.class, args);
		String filePath = "/Users/kaustavmukherjee/Documents/1000-phones.csv";


		List<Recipient> recipients = new ArrayList<>();
		BufferedReader  br  =  new BufferedReader(new FileReader(filePath));
		int headerCount=0;
		try{
			String line;
			while ((line= br.readLine())!=null){
				if(headerCount !=0){
					String [] values = line.split(",");
					Recipient recipient = new Recipient(values[0],values[1]);
					System.out.println(line);
					recipients.add(recipient);
				}
				headerCount++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}




	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
