package de.phl.programmingproject.petadoption;

import java.util.Date;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'Pet Adoption Center' HERE.
 */
public class Main {
    public static void main(String[] args) {
    
               Pet buddy = new Pet("Buddy", 3, "Labrador Retriever");
                Adopter jane = new Adopter("Jane Smith", "555-555-5555", "janesmith@email.com");
        
                System.out.println("Haustier-Info: " + buddy.getInfo());
                System.out.println("Adoptierende Person-Info: " + jane.getInfo());
                System.out.println("Ist Buddy adoptiert? " + buddy.isAdopted());
        
                Date today = new Date();
                Adoption adoption = buddy.adopt(jane, today);
        
                System.out.println("Adoption-Info: " + adoption.getInfo());
                System.out.println("Buddy ist schon adoptiert" + buddy.isAdopted());
            
        
                  }      }
