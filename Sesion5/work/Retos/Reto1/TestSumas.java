@Test
@DisplayName("Reto 1")
void cubosFiltrados(){
   Ejemplo1.reto().subscribe(s -> assertThat(s).isEqualTo(405));
}
