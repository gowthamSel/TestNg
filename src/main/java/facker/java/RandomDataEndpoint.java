package facker.java;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.javafaker.Faker;

//@RestController
//@RequestMapping("/random")
public class RandomDataEndpoint {
 
  private final ObjectMapper objectMapper;
 
  public RandomDataEndpoint(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }
 
//  @GetMapping("/persons")
  public JsonNode getRandomPersons() {
 
    Faker faker = new Faker();
    ArrayNode persons = objectMapper.createArrayNode();
 
    for (int i = 0; i < 10; i++) {
      persons.add(objectMapper.createObjectNode()
        .put("firstName", faker.name().firstName())
        .put("lastName", faker.name().lastName())
        .put("title", faker.name().title())
        .put("suffix", faker.name().suffix())
        .put("address", faker.address().streetAddress())
        .put("city", faker.address().cityName())
        .put("country", faker.address().country()));
    }
 
    return persons;
  }
}