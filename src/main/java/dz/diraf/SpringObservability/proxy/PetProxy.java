package dz.diraf.SpringObservability.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "pet" , url = "http://localhost:8081")
public interface PetProxy {

    @GetMapping("/pet")
    String getPet();
}
