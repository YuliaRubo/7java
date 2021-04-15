package com.company;

final class  Person{
    private String firsName;
    private String lastName;
    private Gender gender;

Person(String firsName, String lastName, Gender gender){
    this.lastName=lastName;
    this.firsName=firsName;
    this.gender=gender;
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return firsName == person.firsName &&
                lastName == person.lastName &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {

        return firsName.hashCode() + lastName.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + firsName +
                ", LastName=" + lastName +
                ", gender=" + gender+
                '}'+"\n";
    }




//    public Gender(String gender){
//    this.gender = gender;}


}
