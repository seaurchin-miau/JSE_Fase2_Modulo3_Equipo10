@Test
@DisplayName("Reto 1")
void cubosFiltrados(){
   Sumas.reto().subscribe(s -> assertThat(s).isEqualTo(405));
}

@Test
@DisplayName("Reto 2")
void cubosFiltrados(){
   Cubos.reto().subscribe(s -> assertThat(s).isEqualTo(36));
}
