package br.com.daads.tutorial;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // String firstName, String lastName, String email, String gender)
        User aluno = new User("Oscar", "Neirinhos", "oscar.neirinhos@gmail.com", "M");
        System.out.println( "O aluno " + aluno.getFirstName() + " " + aluno.getLastName() + " tem o email " + aluno.getEmail() );
    }
}
