package tests;

import org.junit.jupiter.api.*;


public class RegistrationWithTestDataTests extends TestBase {


    @Test
    void fillFormTest() {
        String userName = "Nataly",
                lastName = "Bochkova",
                email = "Nataly@natal.com",
                gender = "Female",
                phone = "7999999999",
                birthDay = "23",
                birthMonth = "June",
                birthYear = "1992",
                subject = "English",
                hobbies = "Sports",
                uploadFile = "src/test/resources/Screenshot_188.png",
                currentAdress = "Moscow,Lenina 152",
                state = "NCR",
                city = "Delhi",
                pictureName = "Screenshot_188.png";

        //Open page
        registrationPage.openPage()
                // Add  First Name
                .setFirstName(userName)
                // Add Last Name
                .setLastName(lastName)
                // Add Email
                .setEmail(email)
                // Add Gender
                .setGender(gender)
                // Add Mobile
                .setPhone(phone)
                // Add Date of Birth
                .setBirthDate (birthDay,birthMonth,birthYear)
                // Add Subjects
                .setSubject(subject)
                // Add Hobbies
                .setHobbies(hobbies)
                // Add Picture
                .setUploadFile(uploadFile)
                // Add Current Address;
                .setCurrentAddress(currentAdress)
                // Add State
                .setState(state)
                // Add City
                .setCity(city)
                // Click on Submit
                .setSubmit();
        // Check
        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", userName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", birthDay)
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", pictureName)
                .verifyResult("Address", currentAdress)
                .verifyResult("State and City", state + " " + city);


    }
}
