/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academy.devdojo.youtube.financeiro.endpoint.controller;

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
@RequestMapping("pag")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PagamentoController {
    
    @GetMapping(path = "titulos")
    public ResponseEntity<List<String>> titulos(){
        return ResponseEntity.ok(Arrays.asList("1","2","3"));
    }
}
