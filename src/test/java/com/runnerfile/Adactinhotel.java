package com.runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src//test//java//com//featurefile//adactin.feature", glue="com.stepdefinition", monochrome = true)


public class Adactinhotel {

}
