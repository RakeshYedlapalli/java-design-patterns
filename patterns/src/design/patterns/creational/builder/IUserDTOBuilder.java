package design.patterns.creational.builder;

public interface IUserDTOBuilder {

    UserDTOBuilderImpl withFirstName(String firstName);
    UserDTOBuilderImpl withLastName(String lastName);
    UserDTOBuilderImpl withAge(String age);

    UserDTO build();
    UserDTO getDTO();
}
