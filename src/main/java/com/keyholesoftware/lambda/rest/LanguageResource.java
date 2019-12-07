package com.keyholesoftware.lambda.rest;

import com.keyholesoftware.lambda.model.Language;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LanguageResource {

    @RequestMapping(path = "/languages", method = RequestMethod.GET)
    public List<Language> listLambdaLanguages() {
        return Arrays.asList(new Language("node"), new Language("java"), new Language("python"));
    }

    @RequestMapping(path = "/languages", method = RequestMethod.POST)
    public List<Language> saveLambdaLanguage(@RequestBody Language language) {
        return Arrays.asList(new Language("node"), new Language("java"), new Language("python"), language);
    }

    @RequestMapping(path = "/requests", method = RequestMethod.GET)
    public List<Language> showRequests() {
        return Arrays.asList(new Language("Request 1"), new Language("Request 2"), new Language("Request 3"));
    }

}