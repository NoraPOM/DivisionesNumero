package DivisionesNumero.DivisionesNumero.controller;

import DivisionesNumero.DivisionesNumero.service.DivisionesNumeroService;

import java.util.List;

@RestController
@RequestMapping( "/divisors" )
public class DivisionesNumeroController {

    private final DivisionesNumeroService divisorService;

    this divisorService = divisorService;

    @GetMapping("/{nunber}") //carga desde el load un cliente por id
    @ResponseBody

    public ResponseEntity<List<List<Integer>>> calculate(@PathVariable Integer number) {
        return ResponseEntity.ok(divisorService.generarDivisores(number));
    }
}
