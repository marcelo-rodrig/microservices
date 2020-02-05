package academy.devdojo.youtube.contabil.controller;

import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("razao")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContabilController {
    
    @GetMapping("documentos")
    public ResponseEntity<List<String>> documentos(){
        return ResponseEntity.ok(Arrays.asList("doc1","doc2","doc3","doc4"));
    }
}
