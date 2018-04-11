package com.code.street.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

/**
 * @author Zied Kallel
 */
@ResponseStatus(value = NOT_FOUND, reason = "The required resource is not found.")
public class ResourceNotFoundException extends  Exception {

}
