package br.com.plusoft.fivetechcollective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class FivetechcollectiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(FivetechcollectiveApplication.class, args);
	}

	@RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "API Back-End 5TECH COLLECTIVE";
    }

}
