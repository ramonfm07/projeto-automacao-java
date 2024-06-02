package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        // Caminho para os arquivos.feature
        glue = {"steps", "hooks"}, // Pacotes onde estão os steps definitions e hooks
        tags = "@SmokeTest" // Tags para executar cenários específicos
)
public class RunnerTest {
    // Esta classe serve apenas como ponto de entrada para os testes Cucumber
}
