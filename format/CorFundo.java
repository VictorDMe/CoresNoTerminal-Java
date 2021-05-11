package format;

public class CorFundo {

    private final String codePrefix = "\u001B[";

    //Fundo em vermelho / red
    public String vermelho(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "41m", string);
        else
            return String.format("%s%s%s", codePrefix + "41m", string, resetFundo());
    }

    public String vermelho(String string) {
        return vermelho(string, true);
    }

    //Fundo em verde / green
    public String verde(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "42m", string);
        else
            return String.format("%s%s%s", codePrefix + "42m", string, resetFundo());
    }

    public String verde(String string) {
        return verde(string, true);
    }

    //Fundo em amarelo / yellow
    public String amarelo(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "43m", string);
        else
            return String.format("%s%s%s", codePrefix + "43m", string, resetFundo());
    }

    public String amarelo(String string) {
        return amarelo(string, true);
    }

    //Fundo em azul / blue
    public String azul(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "44m", string);
        else
            return String.format("%s%s%s", codePrefix + "44m", string, resetFundo());
    }

    public String azul(String string) {
        return azul(string, true);
    }

    //Fundo em rosa / pink
    public String rosa(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "45m", string);
        else
            return String.format("%s%s%s", codePrefix + "45m", string, resetFundo());
    }

    public String rosa(String string) {
        return rosa(string, true);
    }

    //Fundo em ciano / cyan
    public String ciano(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "46m", string);
        else
            return String.format("%s%s%s", codePrefix + "46m", string, resetFundo());
    }

    public String ciano(String string) {
        return ciano(string, true);
    }

    //Fundo em cinza / gray
    public String cinza(String string, Boolean reset) {
        if (!reset)
            return String.format("%s%s", codePrefix + "47m", string);
        else
            return String.format("%s%s%s", codePrefix + "47m", string, resetFundo());
    }

    public String cinza(String string) {
        return cinza(string, true);
    }

    public String resetFundo() {
        return codePrefix + "48m";
    }

    public String resetAll() {
        return codePrefix + "0m";
    }
}

