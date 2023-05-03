package Ejemplo1;

import static org.junit.jupiter.api.Assertions.*;

class SumasTest {

}


@Test
@DisplayName("Reto 1")
void cubosFiltrados(){
   Sumas.reto().subscribe(s -> assertThat(s).isEqualTo(405));
}
