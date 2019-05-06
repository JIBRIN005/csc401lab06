/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author;
/**
 *
 * @author Jibrin Yahaya
 */
public class TestAuthor {
    public static void main(String[] args) {
        String name = "Jibrin", email = "katunjibrin@gmail.com";
        char sex = 'm';
        Author author = new Author(name, email, sex);
        
        System.out.println(author);
        String newMail = "jibrin777@gmail.com";
         author.setEmail(newMail);
        System.out.println(author);
    }
}
