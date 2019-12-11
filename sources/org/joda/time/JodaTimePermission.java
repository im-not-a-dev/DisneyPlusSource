package org.joda.time;

import java.security.BasicPermission;

public class JodaTimePermission extends BasicPermission {
    private static final long serialVersionUID = 1408944367355875472L;

    public JodaTimePermission(String str) {
        super(str);
    }
}
