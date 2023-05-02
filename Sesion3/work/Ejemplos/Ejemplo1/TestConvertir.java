@Test
@DisplayName("Suma dos strings convertidos a enteros")
void addsUpTwoIntegers(){
    String a = "4";
    String b = "8";
    Integer expected = 12;

    Convertir ejemplo1 = new Convertir();

    assertEquals(expected, ejemplo1.sumar(a,b));
}
