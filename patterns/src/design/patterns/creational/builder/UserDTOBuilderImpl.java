package design.patterns.creational.builder;

public class UserDTOBuilderImpl implements IUserDTOBuilder {
    @Override
    public String toString() {
        return "UserDTOBuilderImpl{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", userDTO=" + userDTO +
                '}';
    }

    private String firstName;
    private String lastName;
    private String age;

    private UserDTO userDTO;

    @Override
    public UserDTOBuilderImpl withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilderImpl withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilderImpl withAge(String age) {
        this.age = age;
        return this;
    }

    @Override
    public UserDTO build() {
        userDTO = new UserDTO(firstName, lastName, age);
        return userDTO;
    }

    @Override
    public UserDTO getDTO() {
        return userDTO;
    }


}
