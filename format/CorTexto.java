package format;

public class CorTexto {

    private final String codePrefix = "\u001B[";

    //String em vermelho / red
    public String vermelho(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "31m", string);
        else
            return String.format("%s%s%s", codePrefix + "31m", string, resetCor());
    }

    public String vermelho(String string) {
        return vermelho(string, true);
    }

    //String em verde / green
    public String verde(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "32m", string);
        else
            return String.format("%s%s%s", codePrefix + "32m", string, resetCor());
    }

    public String verde(String string) {
        return verde(string, true);
    }

    //String em amarelo / yellow
    public String amarelo(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "33m", string);
        else
            return String.format("%s%s%s", codePrefix + "33m", string, resetCor());
    }

    public String amarelo(String string) {
        return amarelo(string, true);
    }

    //String em azul / blue
    public String azul(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "34m", string);
        else
            return String.format("%s%s%s", codePrefix + "34m", string, resetCor());
    }

    public String azul(String string) {
        return azul(string, true);
    }

    //String em rosa / pink
    public String rosa(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "35m", string);
        else
            return String.format("%s%s%s", codePrefix + "35m", string, resetCor());
    }

    public String rosa(String string) {
        return rosa(string, true);
    }

    //String em ciano / cyan
    public String ciano(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "36m", string);
        else
            return String.format("%s%s%s", codePrefix + "36m", string, resetCor());
    }

    public String ciano(String string) {
        return ciano(string, true);
    }

    //Texto em cinza / gray
    public String cinza(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "37m", string);
        else
            return String.format("%s%s%s", codePrefix + "37m", string, resetCor());
    }

    public String cinza(String string) {
        return cinza(string, true);
    }

    public String resetCor() {
        return codePrefix + "38m";
    }

    public String resetAll() {
        return codePrefix + "0m";
    }
}
