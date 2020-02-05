
package academy.devdojo.youtube.suprimentos.endpoint;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class SuprimentoController {
    
    @GetMapping(path = "index")
    public String index(){
        return "Modulo de suprimento esta funcionando";
    }
}
