package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String languages(){
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>JavaScript</li>" +
                            "<li>Java</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +
                    "<body>" +
                        "<form action='form' method='post'>" +
                            "<input type='text' name='name'><br>" +
                            "<label for='languages'>My favorite language:</label><br>" +
                                "<select id='languages1st' name='languages1st'>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select><br>" +
                            "<label for='languages2nd'>My second favorite language:</label><br>" +
                                "<select id='languages' name='languages2nd'>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Python'>Python</option>" +
                                 "</select><br>" +
                            "<label for='languages3rd'>My third favorite language:</label><br>" +
                                "<select id='languages' name='languages3rd'>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select><br>" +
                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String formInfo(@RequestParam String name, @RequestParam String languages1st, @RequestParam String languages2nd, @RequestParam String languages3rd){
        return "<html>" +
                    "<body>" +
                        "<h1>" + name +"</h1>" +
                        "<h2>Programming Languages</h2>" +
                        "<ol>" +
                            "<li>" + languages1st +"</li>" +
                            "<li>" + languages2nd +"</li>" +
                            "<li>" + languages3rd + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";

    }

}
