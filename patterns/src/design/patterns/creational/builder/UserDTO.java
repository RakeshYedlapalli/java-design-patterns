package design.patterns.creational.builder;

public class UserDTO {
    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    private String firstName;
    private String lastName;
    private String age;

    public UserDTO(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public static void main(String[] args) {
        IUserDTOBuilder userDTOBuilder = new UserDTOBuilderImpl();

        System.out.println(userDTOBuilder.withFirstName("Rakesh").withLastName("Yedlapalli").withAge("30").build());
    }

}
