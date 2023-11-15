package br.testeprojectij.testeIDEA;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class pessoaController {

    @RequestMapping
    public ResponseEntity<pessoa> getPessoa() {
        final pessoa eu = new pessoa( "Arthur",  "19");
        return ResponseEntity.ok(eu);
    }




}
