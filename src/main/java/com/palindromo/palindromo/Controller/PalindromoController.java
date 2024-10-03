package com.palindromo.palindromo.Controller;

import com.palindromo.palindromo.DAO.PalindromoDao;
import com.palindromo.palindromo.DTO.PalindromoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PalindromoController {
    @Autowired
    public PalindromoDao palindromoDao;

    @PostMapping("/checarPalabra")
    public ResponseEntity<PalindromoDTO> verificarPalindromo(@RequestBody PalindromoDTO palindromoDTO) {
        String palabra = palindromoDTO.getPalindromo();

        PalindromoDTO palindromoDTO1 = new PalindromoDTO();
        palindromoDTO1.setPalindromo(palabra);
        palindromoDTO1.setIsPalindromo(palindromoDao.isPalindromoMet(palabra));
        palindromoDTO1.setLengthCadena(palabra.length());
        palindromoDTO1.setLengthCaracteresEspeciales(palindromoDao.caracterEspecial(palabra));

        System.out.println(palindromoDTO1);


        return ResponseEntity.ok(palindromoDTO1);

    }
}
