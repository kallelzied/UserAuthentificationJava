package com.code.street.ws;

import com.code.street.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import java.io.IOException;

import static com.stripe.pay.util.ApiUrls.*;

@RestController
@RequestMapping("api/user")
public class userWS {
    @Autowired
    private UserDTO companyService;

    ModelMapper modelMapper = new ModelMapper();

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity addCompany(@RequestBody @Valid SignUpDTO signUpDTO)  throws IOException {
        Company company = companyService.saveCompany(signUpDTO);
        return new ResponseEntity<Company>(company, new HttpHeaders(), HttpStatus.CREATED);
    }
}
