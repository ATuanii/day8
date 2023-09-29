package mvc.controller;

import mvc.formregistration.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestRestController {
@RequestMapping(value = "/rest-test")
public Object greeting1(@RequestParam(name = "name") String name,
                            @RequestParam(name = "country",required = false,defaultValue = "VietNam")String country){
    return "Hello " + name + " from " + country;
}
@RequestMapping(value = "/rest-test2")
    public Object greeting2(@RequestParam(value = "name") String name,
                            @RequestParam(value = "country") String country){
    Map<String, String> result = new HashMap<>();
    result.put("name",name);
    result.put("country",country);
    return result;
}
    @RequestMapping(value = "/rest-test3/{name}/{country}")
    public Object greeting3(@PathVariable(value = "name") String name,
                            @PathVariable(value = "country") String country){
        Map<String, String> result = new HashMap<>();
        result.put("name",name);
        result.put("country",country);
        return result;
    }
}
