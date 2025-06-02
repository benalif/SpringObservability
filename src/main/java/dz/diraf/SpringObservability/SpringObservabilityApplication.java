package dz.diraf.SpringObservability;

import dz.diraf.SpringObservability.entity.User;
import dz.diraf.SpringObservability.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
@Slf4j
public class SpringObservabilityApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringObservabilityApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Hello Spring boot observability";
    }

    @Override
    public void run(String... args) {
        User user = User.builder().id(1L).name("Mohamed").build();
        User savedUser = userRepository.save(user);
        log.info("User saved: {}", savedUser);

    }
}
