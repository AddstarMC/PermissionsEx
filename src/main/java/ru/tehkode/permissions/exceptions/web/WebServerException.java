package ru.tehkode.permissions.exceptions.web;

/**
 * Exceptions thrown by WebServer
 *
 * @author Rsl1122
 * @see ru.tehkode.permissions.backends.web.WebServer
 */
public class WebServerException extends Exception {

    public WebServerException(String message) {
        super(message);
    }

    public WebServerException(String message, Throwable cause) {
        super(message, cause);
    }
}