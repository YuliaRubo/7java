package com.company;

final class  Person{
    private  final String firsName;
    private final String lastName;
    private final Gender gender;

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
        return firsName.equals(person.firsName) &&
                lastName.equals(person.lastName) &&
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
