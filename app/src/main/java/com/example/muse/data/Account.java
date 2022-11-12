package com.example.muse.data;
import com.example.muse.util.Constants;

import java.util.ArrayList;
import java.util.Calendar;

public class Account {

    private Id id;
    private String firstName;
    private String lastName;
    private String nickName;
    private int age;
    private Email email;
    private String password;
    private Birthday birthday;
    private String gender;

    private String description;
    private Picture profilePic;
    private Picture coverPic;
    private boolean isLocationAllowed;
    private MyLocation myLocation;
    private boolean isOnline;


    public Account() {
    }

    public Account(String firstName, String lastName, Email email, String password, String gender) {
        this(new Id(1),
                firstName,
                lastName,
                "",
                1,
                email,
                password,
                gender,
                new Picture(Constants.PROFILE_PIC, null),
                new Picture(Constants.COVER_PIC, null),
                false,
                new MyLocation(1, 1, Constants.MSG_LOCATION_NOT_FOUND));
    }

    public Account(Id id, String firstName, String lastName, String nickName, int age, Email email, String password, String gender, Picture profilePic, Picture coverPic, boolean isLocationAllowed, MyLocation myLocation) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setNickName(nickName);
        setEmail(email);
        setPassword(password);
        setBirthday(new Birthday(1, 1, 1992));
        setGender(gender);
        setDescription("");
        setProfilePic(profilePic);
        setCoverPic(coverPic);
        setLocationAllowed(isLocationAllowed);
        setMyLocation(myLocation);
        setOnline(false);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 99) {
            this.age = 99;
        } else {
            this.age = age;
        }
        setBirthday(new Birthday(1, 1, Calendar.getInstance().get(Calendar.YEAR) - age));
    }

    public MyLocation getMyLocation() {
        return myLocation;
    }

    public void setMyLocation(MyLocation myLocation) {
        this.myLocation = myLocation;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Picture getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(Picture coverPic) {
        this.coverPic = coverPic;
    }

    public boolean isLocationAllowed() {
        return isLocationAllowed;
    }

    public void setLocationAllowed(boolean locationAllowed) {
        isLocationAllowed = locationAllowed;
    }

    public Picture getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Picture profilePic) {
        this.profilePic = profilePic;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        if (description == null) {
            return "";
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

}
