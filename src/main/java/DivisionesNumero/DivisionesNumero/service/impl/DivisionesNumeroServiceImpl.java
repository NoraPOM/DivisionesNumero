package DivisionesNumero.DivisionesNumero.service.impl;

import DivisionesNumero.DivisionesNumero.service.DivisionesNumeroService;

import java.util.ArrayList;
import java.util.List;

@Service
public class DivisionesNumeroServiceImpl implements DivisionesNumeroService {
 @Override
    public public List<List<Integer>> GeneratedDivisors(Integer number) {

     List<List<Integer>> listGeneral = new ArrayList<>();

     List<Integer> listReturnedDivisors = new ArrayList<>();

     Integer prueba = 1;
     listReturnedDivisors.add(prueba);
     listGeneral.add(listReturnedDivisors);
     return listGeneral;

 }

}
