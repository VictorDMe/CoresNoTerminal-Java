package format;

public class Texto {
    private final String codePrefix = "\u001B[";

    //String negrito
    public String negrito(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "1m", string);
        else
            return String.format("%s%s%s", codePrefix + "1m", string, resetAll());
    }

    public String negrito(String string) {
        return negrito(string, true);
    }

    //String itálico
    public String italic(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "3m", string);
        else
            return String.format("%s%s%s", codePrefix + "3m", string, resetAll());
    }

    public String italic(String string) {
        return italic(string, true);
    }

    //String sublinhado
    public String sublinhado(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "4m", string);
        else
            return String.format("%s%s%s", codePrefix + "4m", string, resetAll());
    }

    public String sublinhado(String string) {
        return sublinhado(string, true);
    }

    public String resetAll() {
        return codePrefix + "0m";
    }
}


