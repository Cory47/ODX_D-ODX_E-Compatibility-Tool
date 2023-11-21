package Parser;

import org.springframework.web.bind.annotation.*;
//https://felixbeinssen.medium.com/develop-and-deploy-a-rest-api-using-java-spring-boot-mysql-and-docker-daeb4034ab51
@RestController
@RequestMapping("/parser")
public class ParserMapping {
    @GetMapping
    public String[] getProducts() {
        return new String[0];
    }

    @PostMapping
    public String postProduct(@RequestBody String product) {
        return product;
    }
}


