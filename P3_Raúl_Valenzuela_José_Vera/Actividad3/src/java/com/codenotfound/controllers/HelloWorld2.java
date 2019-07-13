package com.codenotfound.controllers;

import com.codenotfound.model.Academics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.xml.ws.Response;

import com.codenotfound.model.Academics;
import com.codenotfound.services.AcademicsService;

import org.springframework.web.client.RestTemplate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

@Named
public class HelloWorld2 {

  private String firstName = "John";
  private String lastName = "Doe";
  private AcademicsService academicsService = new  AcademicsService();
  private List<Academics> listaAcademics = new ArrayList<Academics>();

  @PostConstruct
  public void init(){
    this.listaAcademics = academicsService.getAcademicsList();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    Academics s = new Academics();
    s.setNombre(firstName + " " + lastName);
    this.listaAcademics.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Student> return the listaStudent
     */
    public List<Academics> getListaAcademics() {
        return listaAcademics;
    }

  

}
