package org.curso.jsfproject.functions;

/**
 *
 * @author Mauri
 */
public class CustomFunctions {

    private CustomFunctions() {
        // Hide constructor.
    }

    public static boolean isAdmin(String username) {
        System.out.println("Evaluate user:" + username);
        return "admin".equalsIgnoreCase(username);
    }
}
