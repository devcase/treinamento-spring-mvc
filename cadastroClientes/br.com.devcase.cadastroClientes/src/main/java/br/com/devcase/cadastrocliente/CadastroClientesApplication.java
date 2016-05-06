package br.com.devcase.cadastrocliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan
public class CadastroClientesApplication
{
    public static void main( String[] args )
    {
        new SpringApplication(CadastroClientesApplication.class).run(args);
    }
}
