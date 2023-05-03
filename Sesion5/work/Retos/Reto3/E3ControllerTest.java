package Ejemplo3;

import static org.junit.jupiter.api.Assertions.*;

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
