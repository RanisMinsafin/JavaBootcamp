package edu.school21.model;


import edu.school21.annotation.HtmlForm;
import edu.school21.annotation.HtmlInput;

@HtmlForm(fileName ="user.html", action ="/users", method = "post")
public class UserForm {
    @HtmlInput(type = "text", name = "first_name", placeholder = "Enter First Name")
    private String firstName;
    @HtmlInput(type = "text", name = "last_name", placeholder = "Enter Last Name")
    private String lastName;
    @HtmlInput(type = "password", name = "password", placeholder = "Enter Password")
    private String password;
}
