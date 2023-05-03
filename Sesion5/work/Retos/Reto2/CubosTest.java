package Ejemplo2;

import static org.junit.jupiter.api.Assertions.*;

class CubosTest {

@Test
@DisplayName("Reto 2")
void cubosFiltrados(){
   Cubos.reto().subscribe(s -> assertThat(s).isEqualTo(36));
}
