package cucumber.examples.java.testNG.runners;

/**
 * Created by H243774 on 6/30/2017.
 */

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

public class HTMLReport {
    public HTMLReport() throws Exception {
        CucumberResultsOverview results = new CucumberResultsOverview();
        results.setOutputDirectory("target/cucumber-report/chrome");
        results.setOutputName("cucumber-results");
        results.setSourceFile("target/cucumber-report/chrome/cucumber.json");
        results.execute();
    }

    public static void main(String[] args) throws Exception {
        HTMLReport x= new HTMLReport();
    }
}