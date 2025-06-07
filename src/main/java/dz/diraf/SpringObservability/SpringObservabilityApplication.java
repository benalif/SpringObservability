package dz.diraf.SpringObservability;

import dz.diraf.SpringObservability.entity.User;
import dz.diraf.SpringObservability.proxy.PetProxy;
import dz.diraf.SpringObservability.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
@Slf4j
@EnableFeignClients
public class SpringObservabilityApplication implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;
    private final PetProxy petProxy;

    public static void main(String[] args) {
        SpringApplication.run(SpringObservabilityApplication.class, args);
    }

    @GetMapping("/")
    public String getPet() {
        log.info("get pet from MS1");
//        return restTemplate.getForObject("http://localhost:8081/pet", String.class);
        return petProxy.getPet();
    }


    @GetMapping("/pet")
    public String getPetFromApi() {
        log.info("get pet from MS2");
        return  restTemplate.getForObject("https://petstore.swagger.io/v2/pet/3", String.class);
    }


    @Override
    public void run(String... args) {
        User user = User.builder().id(1L).name("Mohamed").build();
        User savedUser = userRepository.save(user);
        log.info("User saved: {}", savedUser);

    }

}
