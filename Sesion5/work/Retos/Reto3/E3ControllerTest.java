package Ejemplo3;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class E3ControllerTest { 
   
     private static final List<String> NOMBRES = Arrays.asList(new String[]{"Romo Përez, Juan", "Sánchez García, Diana", "Rodríguez Soto, Sebastian"});
     private static final String NOMBRE_QUERY = "DIA";
     private static final String NOM_COM = "Diana Sánchez García"
     private static final String TEL = "5550000002"
   
   @Test
   @DisplayName("Reto3")
   void reto3() {
      E3Controller controller = new E3Controller();

      controller.buscarPorNombre(NOMBRE_QUERY)
         .subscribe(x -> {
            assertThat(x.getNomCom()).isEqualTo(NOMBRE_COMPLETO);
            assertThat(x.getTel()).isEqualTo(TELEFONO);
         });
   }


}
