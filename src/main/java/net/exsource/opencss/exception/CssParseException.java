package net.exsource.opencss.exception;

import java.io.Serial;

public class CssParseException extends IllegalArgumentException {

    @Serial
    private static final long serialVersionUID = 7002908551463726234L;

    private final String message;

    public CssParseException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
