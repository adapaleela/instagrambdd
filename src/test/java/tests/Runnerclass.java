package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\leelajava\\com.instagram.org\\src\\test\\resources\\repository\\instagram.feature"},
							monochrome=true,
							plugin={"pretty","html:target\\result"}
				)
public class Runnerclass 
{

}
