
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = java.util.Objects.requireNonNullElse(firstName, "");
    }


    public void setLastName(String lastName) {
        this.lastName = java.util.Objects.requireNonNullElse(lastName, "");
    }

    public String getFullName() {
        String fullName;
        if ("".equals(firstName) && "".equals(lastName)) {
            fullName = "Unknown";
        } else if ("".equals(firstName)) {
            fullName = lastName;
        } else if ("".equals(lastName)) {
            fullName = firstName;
        } else {
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }
}