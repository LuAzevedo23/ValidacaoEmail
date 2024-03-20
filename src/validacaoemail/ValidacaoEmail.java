/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacaoemail;

import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author lucie
 */
public class ValidacaoEmail {

    public static void main(String[] args) {
        EmailValidator validator = EmailValidator.getInstance();
        
        if(validator.isValid("luciene.azevedo@hotmail.com")){
            System.out.println("Email Válido!");
        } else {
            throw new RuntimeException ("Email Inválido");
        }
    }
    
}
